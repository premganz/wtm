package org.spo.svc3.trx.def;

import org.spo.ifs3.template.web.Constants;
import org.springframework.stereotype.Component;
@Component
public class ConstantsImpl implements Constants {

	public String getRepoPath() {
		if(!System.getProperty("os.name").startsWith("Windows")){
			return "/usr/local/share/data-cms/wtm";
		}else{
			return "C:\\Users\\premganesh\\git\\bg1_3\\src\\main\\resources\\data-cms";
		}
	}

	public String getLandingPage() {
		return "trx/W01/LA01T";
	}

	public int getPortNumber() {
		// TODO Auto-generated method stub
		return 8082;
	}

}
