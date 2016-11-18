package org.spo.svc2.trx.pgs.m01.task;

import java.lang.reflect.Type;

import org.spo.cms2.svc.PageService;
import org.spo.ifs2.dsl.controller.NavEvent;
import org.spo.ifs2.dsl.controller.TrxInfo;
import org.spo.ifs2.dsl.model.AbstractTask;
import org.spo.svc2.trx.pgs.c01.cmd.CX99Connector;
import org.spo.svc2.trx.pgs.c01.cmd.CX99T;
import org.spo.svc2.trx.pgs.m01.cmd.LA99T;
import org.spo.svc2.trx.pgs.m01.handler.M01Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
@Component
public class M0102 extends AbstractTask {

	@Autowired
	public PageService svc ;
	@Override
	public NavEvent initView(TrxInfo info) {
		return null;
	}

	@Override
	public NavEvent initTask(String dataId, TrxInfo info) throws Exception {


		String contentId= dataId;
		String response="";
		String response_content="";

		response = svc.readUpPage("templates", contentId);

		String dataId_Content="" ;
		if(dataId.equals("LB01T")){
			//regular Menu can be mapped with A01T content
			dataId_Content = "BA01T";
		}

		response_content = svc.readUpPage("templates", dataId_Content);

		try{
			Gson gson = new Gson();
			Type typ = new TypeToken<LA99T>(){}.getType();//FIXME right now only string works
			LA99T cmd_menu= gson.fromJson(response,typ);		

			CX99T cmd= new CX99Connector().prepareContent(svc,dataId_Content);		
			
			
			info.addToModelMap("menu",cmd_menu);
			info.addToModelMap("message",cmd);
			System.out.println(cmd.toString());

		}catch(Exception e){
			System.out.println("Error during messagePayload processing from  TestResourceServerException on" );
			e.printStackTrace();
		}

		return M01Handler.EV_INIT_02;
	
	}

	@Override
	public NavEvent processViewEvent(String event, TrxInfo info) {
		if(event.startsWith("EV_DTL")){
			String dataId = event.replaceAll("EV_DTL_","");
			NavEvent navEvent = M01Handler.EV_SWITCH_TO_CONTENT;
			navEvent.dataId=dataId;
			return navEvent;
		}else if(event.startsWith("EV_SUB_LAND")){
			String dataId = event.replaceAll("EV_SUB_LAND_","");
			NavEvent navEvent = M01Handler.EV_SWITCH_SUB_LAND;
			navEvent.dataId=dataId;
			return navEvent;
		}else if(event.startsWith("EV_SHORTCUT")){
			String dataId = event.replaceAll("EV_SHORTCUT_","");
			NavEvent navEvent = M01Handler.EV_SWITCH_TO_CONTENT;
			navEvent.dataId=dataId;
			return navEvent;
		}
		else if(event.startsWith("EV_ABOUT")){			
			NavEvent navEvent = M01Handler.EV_SWITCH_TO_CONTENT;
			navEvent.dataId="B01T";
			return navEvent;
		}
		else if(event.startsWith("EV_BLOG")){		
			NavEvent navEvent = M01Handler.EV_SWITCH_TO_BLOG_LANDING;
			navEvent.dataId="LB01T";
			return navEvent;
		}
		return M01Handler.EV_INIT_01;
	}

	@Override
	public String processAjaxEvent(String event, TrxInfo info) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
