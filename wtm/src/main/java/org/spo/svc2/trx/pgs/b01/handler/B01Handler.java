package org.spo.svc2.trx.pgs.b01.handler;

import org.spo.ifs2.dsl.controller.AbstractHandler;
import org.spo.ifs2.dsl.controller.DSLConstants.EventType;
import org.spo.ifs2.dsl.controller.NavEvent;
import org.spo.svc2.trx.pgs.b01.task.B0101;
import org.spo.svc2.trx.pgs.b01.task.B0102;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class B01Handler extends AbstractHandler{

   
   @Autowired
   B0101 b0101;
   
   @Autowired
   B0102 b0102;
   
   public static final NavEvent EV_INIT_01 =  NavEvent.create(EventType.REFRESHPAGE);
   public static final NavEvent EV_INIT_02 =  NavEvent.create(EventType.REFRESHPAGE, "m01/M0102");
   public static final NavEvent EV_SWITCH_TO_DTL =  NavEvent.create(EventType.TASKSET, "02");
   public static final NavEvent EV_REFRESH_CONTENT =  NavEvent.create(EventType.TASKSET, "01");
  
  
   @Override
   public void configureChannel() {
			taskChannel.put("01",b0101);
			taskChannel.put("02",b0102);
   }
   
   
  
    
	
	
	
	
	
	
}
