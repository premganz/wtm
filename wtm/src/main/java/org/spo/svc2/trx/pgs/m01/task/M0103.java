package org.spo.svc2.trx.pgs.m01.task;

import java.lang.reflect.Type;

import org.spo.cms2.svc.PageService;
import org.spo.ifs2.dsl.controller.NavEvent;
import org.spo.ifs2.dsl.controller.TrxInfo;
import org.spo.ifs2.dsl.model.AbstractTask;
import org.spo.svc2.trx.pgs.m01.cmd.LA99T;
import org.spo.svc2.trx.pgs.m01.cmd.LB99T;
import org.spo.svc2.trx.pgs.m01.handler.M01Handler;
import org.spo.svc2.trx.pgs.mc.cmd.PostContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
@Component
public class M0103 extends AbstractTask {

	@Autowired
	public PageService svc ;
	@Override
	public NavEvent initView(TrxInfo info) {
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
			
			info.addToModelMap("menu",cmd_menu);
			info.addToModelMap("message",cmd);
			System.out.println(cmd.toString());

		}catch(Exception e){
			System.out.println("Error during messagePayload processing from  TestResourceServerException on" );
			e.printStackTrace();
		}

		return M01Handler.EV_INIT_03;
	
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
			NavEvent navEvent = M01Handler.EV_SWITCH_TO_SUB_LAND;
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
