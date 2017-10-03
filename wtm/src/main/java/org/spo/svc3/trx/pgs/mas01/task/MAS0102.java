package org.spo.svc3.trx.pgs.mas01.task;

import java.lang.reflect.Type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spo.cms3.svc.PageService;
import org.spo.cms3.svc.SocketConnector;
import org.spo.ifs3.dsl.controller.NavEvent;
import org.spo.ifs3.dsl.controller.TrxInfo;
import org.spo.ifs3.dsl.model.AbstractTask;
import org.spo.svc3.trx.pgs.m99.cmd.LA01T;
import org.spo.svc3.trx.pgs.mas01.toolkit.MAS01Toolkit;
import org.spo.svc3.trx.pgs.w01.handler.W01Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Component
public class MAS0102 extends AbstractTask {

	@Autowired
	PageService svc; 

	private static final Logger logger = LoggerFactory.getLogger(MAS0102.class);

	
	private SocketConnector connector=new SocketConnector();
	
	@Override
	public NavEvent initTask(String dataId, TrxInfo info) throws Exception {

		String contentId= dataId;		
		String response="";
		String response_content="";
		info.addToModelMap("prd1",info.get(MAS01Toolkit.SV_PRD));
		
		return W01Handler.EV_INIT_02;
	}
	
	

	@Override
	public NavEvent processViewEvent(String event, TrxInfo info) {	
		if(event.startsWith("EV_PVS")){
			String dataId = event.replaceAll("EV_DTL_","");
			NavEvent navEvent = W01Handler.EV_PVS_SCREEN;
			navEvent.dataId="W02";
			return navEvent;
		}
		return W01Handler.EV_INIT_02;
	}
	
	@Override
	public NavEvent processViewResult(String event,   String json, TrxInfo info) {
		// TODO Auto-generated method stub
		return null;
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
