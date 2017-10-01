package org.spo.svc3.trx.pgs.w01.task;

import java.lang.reflect.Type;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spo.cms3.svc.PageService;
import org.spo.cms3.svc.SocketConnector;
import org.spo.ifs3.dsl.controller.NavEvent;
import org.spo.ifs3.dsl.controller.TrxInfo;
import org.spo.ifs3.dsl.model.AbstractTask;
import org.spo.svc3.trx.pgs.w01.form.PrdForm01;
import org.spo.svc3.trx.pgs.w01.handler.W01Handler;
import org.spo.svc3.trx.pgs.w01.model.Prd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Component
public class W0101 extends AbstractTask {

	@Autowired
	PageService svc; 

	private static final Logger logger = LoggerFactory.getLogger(W0101.class);

	
	private SocketConnector connector=new SocketConnector();
	
	@Override
	public NavEvent initTask(String dataId, TrxInfo info) throws Exception {
		//Display a list of products 

		String contentId= dataId;		
		String response="";
		String response_content="";

		response = svc.readUpPage("templates", contentId);

		String dataId_Content="" ;
		if(dataId.equals("LA01T")){
			//regular Menu can be mapped with A01T content
			dataId_Content = "B01T";

		}

		response_content = svc.readUpPage("templates", dataId_Content);

		try{
			Gson gson = new Gson();
			Type typ = new TypeToken<Prd>(){}.getType();//FIXME right now only string works
			Prd cmd= gson.fromJson(response_content,typ);		
			info.addToModelMap("prd",cmd);
			info.addToModelMap("prdForm",new PrdForm01());	
			System.out.println(cmd.toString());

		}catch(Exception e){
			System.out.println("Error during messagePayload processing from  TestResourceServerException on" );
			e.printStackTrace();
		}

		return W01Handler.EV_INIT_01;
	}

	@Override
	public NavEvent processViewEvent(String event, TrxInfo info) {	
		if(event.startsWith("EV_DTL")){
			String dataId = event.replaceAll("EV_DTL_","");
			NavEvent navEvent = W01Handler.EV_NEXT_SCREEN;
			navEvent.dataId="W02";
			return navEvent;
		}
		if(event.startsWith("EV_FLT")){
			String dataId = event.replaceAll("EV_FLT_","");
			NavEvent navEvent = W01Handler.EV_INIT_01;
			navEvent.dataId="W02";
			return navEvent;
		}
		return W01Handler.EV_INIT_01;
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
