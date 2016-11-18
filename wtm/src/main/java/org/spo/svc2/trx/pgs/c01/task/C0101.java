package org.spo.svc2.trx.pgs.c01.task;

import java.lang.reflect.Type;

import org.spo.cms2.svc.PageService;
import org.spo.ifs2.dsl.controller.NavEvent;
import org.spo.ifs2.dsl.controller.StateInfo;
import org.spo.ifs2.dsl.controller.TrxInfo;
import org.spo.ifs2.dsl.model.AbstractTask;
import org.spo.svc2.trx.pgs.c01.cmd.LB99T;
import org.spo.svc2.trx.pgs.c01.handler.C01Handler;
import org.spo.svc2.trx.pgs.c01.toolkit.C01Toolkit;
import org.spo.svc2.trx.pgs.m01.cmd.LA99T;
import org.spo.svc2.trx.pgs.m01.handler.M01Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
@Component
public class C0101 extends AbstractTask {
	@Autowired
	public PageService svc ;
	@Override
	public NavEvent initView(TrxInfo info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NavEvent initTask(String dataId, TrxInfo info) throws Exception {


		String dataId_Content= dataId;//Here dataId represents the template incoming because it is mostly a set of links in this page wiht a small intro
		String response="";
		String response_content="";

		response = svc.readUpPage("templates", "LA01T");//Menu
		Gson gson = new Gson();
		
		Type typ = new TypeToken<LA99T>(){}.getType();//FIXME right now only string works
		LA99T cmd_menu= gson.fromJson(response,typ);	
		
		try{
		
			
		
			response_content = svc.readUpPage("templates", dataId_Content);


			typ = new TypeToken<LB99T>(){}.getType();//FIXME right now only string works
			LB99T cmd= gson.fromJson(response_content,typ);		
			info.put(C01Toolkit.SV_MENU_OBJECT, (Object)cmd_menu);
			info.addToModelMap("menu",cmd_menu);
			info.addToModelMap("message",cmd);
			System.out.println(cmd.toString());

		}catch(Exception e){
			System.out.println("Error during messagePayload processing from  TestResourceServerException on" );
			e.printStackTrace();
		}

		return C01Handler.EV_INIT_01;
	
	}

	@Override
	public NavEvent processViewEvent(String event, TrxInfo info) {
		if(event.startsWith("EV_DTL")){
			String dataId = event.replaceAll("EV_DTL_","");
			NavEvent navEvent = C01Handler.EV_SWITCH_TO_DTL;
			navEvent.dataId=dataId;
			return navEvent;
		}else if(event.startsWith("EV_SUB_LAND")){
			String dataId = event.replaceAll("EV_SUB_LAND_","");
			NavEvent navEvent = C01Handler.EV_REFRESH_NEW_SUB_LAND;
			navEvent.dataId=dataId;
			return navEvent;
		}
		return C01Handler.EV_SWITCH_TO_OVV;
	}

	@Override
	public String processAjaxEvent(String event, TrxInfo info) {
		// TODO Auto-generated method stub
		return null;
	}

	
		
	
}
