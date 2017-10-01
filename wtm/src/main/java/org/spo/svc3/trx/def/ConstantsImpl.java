package org.spo.svc3.trx.def;

import org.spo.ifs3.template.web.Constants;
import org.springframework.stereotype.Component;
@Component
public class ConstantsImpl implements Constants {

	public String getRepoPath() {
		if(!System.getProperty("os.name").startsWith("Windows")){
			return "/home/kv/Documents/lc/data-cms/lc/";
		}else{
			return "C:\\Users\\premganesh\\git\\bg2\\src\\main\\resources\\data-cms";
		}
	}

	public String getLandingPage() {
		return "trx/MAS01/LA01T";
	}

	public int getPortNumber() {
		// TODO Auto-generated method stub
		return 8083;
	}

}
