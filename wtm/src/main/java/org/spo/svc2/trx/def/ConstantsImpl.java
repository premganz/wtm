package org.spo.svc2.trx.def;

import org.spo.ifs2.template.web.Constants;
import org.springframework.stereotype.Component;
@Component
public class ConstantsImpl implements Constants {

	public String getRepoPath() {
		if(!System.getProperty("os.name").startsWith("Windows")){
			return "/usr/local/share/data-cms/lc";
		}else{
			return "C:/works/campus/data-cms-backup/lc";
			//C:\\Users\\premganesh\\git\\bg2\\src\\main\\resources\\data-cms
		}
	}

	public String getLandingPage() {
		return "trx/M01/A01T";
	}

	public int getPortNumber() {
		// TODO Auto-generated method stub
		return 80;
	}

}

