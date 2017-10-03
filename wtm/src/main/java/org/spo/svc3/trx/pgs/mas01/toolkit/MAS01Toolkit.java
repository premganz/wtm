package org.spo.svc3.trx.pgs.mas01.toolkit;

import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

import org.spo.ifs3.dsl.controller.ScopeVar;
import org.spo.ifs3.dsl.controller.TrxInfo.Scope;
import org.spo.svc3.trx.pgs.w01.form.PrdForm01;
import org.spo.svc3.trx.pgs.w01.model.Prd;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.util.JSON;

public class MAS01Toolkit {


	public static final ScopeVar SV_PRD=new ScopeVar(Scope.TRX,"prd");
	

	}
