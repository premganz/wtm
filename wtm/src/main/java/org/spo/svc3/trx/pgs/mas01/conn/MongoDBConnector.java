package org.spo.svc3.trx.pgs.mas01.conn;

import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

import org.spo.svc3.trx.pgs.w01.form.PrdForm01;
import org.spo.svc3.trx.pgs.w01.model.Prd;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.util.JSON;

public class MongoDBConnector {
	
	
	
	public static String create(Prd prd){
		Mongo mongo = new Mongo("localhost", 27017);
		DB db = mongo.getDB("ICS");

		DBCollection collection = db.getCollection("MAS01");

		// 1. BasicDBObject example
		System.out.println("BasicDBObject example");
		Gson gson = new Gson();
		Type typ = new TypeToken<Prd>(){}.getType();
		String json = gson.toJson(prd, typ);		
		DBObject dbObject = (DBObject)JSON.parse(json);
		

		//collection.insert(dbObject);

		
		return "";
		
	}
	
	public static void main(String[] args) {
		//MongoDBConnector.create(new Prd());
		
		PrdForm01 prd = new PrdForm01();
		Gson gson = new Gson();
		Type typ = new TypeToken<PrdForm01>(){}.getType();
		String json = gson.toJson(prd, typ);
		System.out.println(json);
		Map<String,String> map = new LinkedHashMap<String,String>(); 
		Type typ1 = new TypeToken<Map<String, String>>(){}.getType();
		//map = gson.fromJson("{\"hello\":\"hi\"}",typ1);
		map = gson.fromJson(json,typ1);
		
		System.out.println(map);
		
		
	}
	
	
	

}