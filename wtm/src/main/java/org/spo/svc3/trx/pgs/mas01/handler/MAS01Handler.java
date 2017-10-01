package org.spo.svc3.trx.pgs.mas01.handler;

import org.spo.ifs3.dsl.controller.AbstractHandler;
import org.spo.ifs3.dsl.controller.DSLConstants.EventType;
import org.spo.ifs3.dsl.controller.NavEvent;
import org.spo.svc3.trx.pgs.mas01.task.MAS0101;
import org.spo.svc3.trx.pgs.mas01.task.MAS0102;
import org.spo.svc3.trx.pgs.mas01.task.MAS0103;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MAS01Handler extends AbstractHandler{

   
   @Autowired
   MAS0101 mas0101;
   @Autowired
   MAS0102 mas0102;
   @Autowired
   MAS0103 mas0103;
   
  public static final NavEvent EV_INIT_01 =  NavEvent.create(EventType.REFRESHPAGE,"01");
  public static final NavEvent EV_INIT_02 =  NavEvent.create(EventType.REFRESHPAGE,"02");
  public static final NavEvent EV_NEXT_SCREEN =  NavEvent.create(EventType.TASKSET,"02");
  public static final NavEvent EV_PVS_SCREEN =  NavEvent.create(EventType.TASKSET,"01");
  
 
   @Override
   public void configureChannel() {
			taskChannel.put("01",mas0101);
			taskChannel.put("02",mas0102);
			taskChannel.put("03",mas0103);
   }
   
   
  
    
	
	
	
	
	
	
}
