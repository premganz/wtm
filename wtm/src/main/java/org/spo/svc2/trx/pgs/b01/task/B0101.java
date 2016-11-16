package org.spo.svc2.trx.pgs.b01.task;

import java.lang.reflect.Type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spo.cms2.svc.PageService;
import org.spo.cms2.svc.SocketConnector;
import org.spo.ifs2.dsl.controller.NavEvent;
import org.spo.ifs2.dsl.controller.TrxInfo;
import org.spo.ifs2.dsl.model.AbstractTask;
import org.spo.svc2.trx.pgs.c01.cmd.CX99Connector;
import org.spo.svc2.trx.pgs.c01.cmd.CX99T;
import org.spo.svc2.trx.pgs.c01.handler.C01Handler;
import org.spo.svc2.trx.pgs.m01.cmd.LA99T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Component
public class B0101 extends AbstractTask {



	private static final Logger logger = LoggerFactory.getLogger(B0101.class);
	
	@Autowired
	public PageService svc ;
	
	private SocketConnector connector=new SocketConnector();
	
	@Override
	public NavEvent initTask(String dataId, TrxInfo info) {

		String contentId= dataId;
		String response="";
		String response_content="";

		response = svc.readUpPage("templates", contentId);

		String dataId_Menu="LA01T" ;//MEnu responsive
		
		String dataId_Content = dataId;

		
		response = svc.readUpPage("templates", dataId_Menu);
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
		return C01Handler.EV_INIT_01;
	}

	@Override
	public NavEvent processViewEvent(String event, TrxInfo info) {
		if(event.startsWith("EV_DTL")){
			String dataId = event.replaceAll("EV_DTL_","");
				NavEvent navEvent = C01Handler.EV_REFRESH_CONTENT;
				navEvent.dataId=dataId;				
				return navEvent;
		}
		else if(event.startsWith("EV_ABOUT")){			
			NavEvent navEvent = C01Handler.EV_REFRESH_CONTENT;
			navEvent.dataId="B01T";
			return navEvent;
		}
		return C01Handler.EV_INIT_01;
	}

	
	
	
	
	@Override
	public String processAjaxEvent(String event, TrxInfo info) {
		return "";
	}

	public SocketConnector getConnector() {
		return connector;
	}

	public void setConnector(SocketConnector connector) {
		this.connector = connector;
	}

	@Override
	public NavEvent initView(TrxInfo info) {
		// TODO Auto-generated method stub
		return null;
	}




}
