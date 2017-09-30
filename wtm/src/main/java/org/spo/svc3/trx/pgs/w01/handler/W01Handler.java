package org.spo.svc3.trx.pgs.w01.handler;

import org.spo.ifs3.dsl.controller.AbstractHandler;
import org.spo.ifs3.dsl.controller.DSLConstants.EventType;
import org.spo.ifs3.dsl.controller.NavEvent;
import org.spo.svc3.trx.pgs.w01.task.W0101;
import org.spo.svc3.trx.pgs.w01.task.W0102;
import org.spo.svc3.trx.pgs.w01.task.W0103;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class W01Handler extends AbstractHandler{

   
   @Autowired
   W0101 w0101;
   @Autowired
   W0102 w0102;
   @Autowired
   W0103 w0103;
   
  public static final NavEvent EV_INIT_01 =  NavEvent.create(EventType.REFRESHPAGE,"01");
  public static final NavEvent EV_INIT_02 =  NavEvent.create(EventType.REFRESHPAGE,"02");
  public static final NavEvent EV_NEXT_SCREEN =  NavEvent.create(EventType.TASKSET,"02");
  public static final NavEvent EV_PVS_SCREEN =  NavEvent.create(EventType.TASKSET,"01");
  
 
   @Override
   public void configureChannel() {
			taskChannel.put("01",w0101);
			taskChannel.put("02",w0102);
			taskChannel.put("03",w0103);
   }
   
   
  
    
	
	
	
	
	
	
}
