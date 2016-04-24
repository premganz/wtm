package org.spo.svc2.trx.pgs.mc.cmd;

import java.util.LinkedHashMap;
import java.util.Map;

import org.spo.cms3.svc.CMSValidationException;

public class PostContent {

	private String htmlContent;
	private String meta;
	/**MAnually Added**/
	private Map<String,String> metaMap;

	private String id;
	private String formErrors;




	public String getFormErrors() {
		return formErrors;
	}

	public void setFormErrors(String formErrors) {
		this.formErrors = formErrors;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	

	public Map<String, String> getMetaMap() {
		return metaMap;
	}

	public void setMetaMap(Map<String, String> metaMap) {
		this.metaMap = metaMap;
	}

	public String getMeta() {		
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;metaMap=new LinkedHashMap<String,String>();
		try{
			String[] metaArr = meta.split(";");
			for(String expr:metaArr){	
				metaMap.put(expr.split("=")[0],expr.split("=")[1]);
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new CMSValidationException();
		}
	}

	public String getHtmlContent() {
		return htmlContent;
	}

	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
	}



}
