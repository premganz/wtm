package org.spo.svc2.trx.pgs.c01.task;

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
import org.spo.svc2.trx.pgs.c01.toolkit.C01Toolkit;
import org.spo.svc2.trx.pgs.m01.cmd.LA99T;
import org.spo.svc2.trx.pgs.mc.cmd.PostContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Component
public class C0102 extends AbstractTask {



	private static final Logger logger = LoggerFactory.getLogger(C0102.class);
	
	@Autowired
	public PageService svc ;
	
	private SocketConnector connector=new SocketConnector();
	
	@Override
	public NavEvent initTask(String dataId, TrxInfo info) {

		
		try{
			
			Type typ = new TypeToken<CX99T>(){}.getType();
			CX99T cmd= new CX99Connector().prepareContent(svc,dataId);
			info.addToModelMap("menu",info.get(C01Toolkit.SV_MENU_OBJECT));
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
