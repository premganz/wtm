package org.spo.svc2.trx.def;

import org.spo.ifs2.template.web.Constants;
import org.springframework.stereotype.Component;
//@Component
public class ConstantsImpl implements Constants {

	public String getRepoPath() {
		return "C:\\Users\\premganesh\\git\\bg1_3\\src\\main\\resources\\data-cms";
	}

	public String getLandingPage() {
		return "trx/W01/LA01T";
	}

}
