package org.spo.svc2.trx.pgs.c01.cmd;

import java.lang.reflect.Type;

import org.spo.cms2.svc.PageService;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class CX99Connector {

	public PageService svc ;
	
	public CX99T prepareContent(PageService svc,
			String dataId){
		
	
		String dataId_Content = dataId;

		String response_content = svc.readUpPage("templates", dataId_Content);

		Gson gson = new Gson();
	
		Type typ = new TypeToken<CX99T>(){}.getType();//FIXME right now only string works
		Type typ_meta = new TypeToken<CX99_Meta>(){}.getType();//FIXME right now only string works
		CX99T cmd= gson.fromJson(response_content,typ);	
		String pageId=cmd.getCont_page_content_id();
		String response = svc.readUpPage("posts", pageId);		
		response=response.equals("")?"<p>blank reply</p>":response;		
		
		cmd.setCont_page_content_text(response);
		
		String response_meta = svc.readUpPage("posts", pageId+"_meta");
		CX99_Meta cmd1= gson.fromJson(response_meta,typ_meta);	
		
		
		
		
		if(cmd1.getSECTION_CONTENT_ZN_REDEFINES_CD()!=null){
			
			
		}
		
			
	return cmd;	
	}
	
	
	
}
