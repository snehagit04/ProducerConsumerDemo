package com.example.fuse;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class ActiveMQReceiver implements Processor {
	
//	@Autowired
//	GetEmployeeData emp1;
//	
//
//	@Override
//	public void configure() throws Exception {
//		// TODO Auto-generated method stub
//		
//		from("activemq:myqueue").unmarshal().json(JsonLibrary.Jackson,Employee.class).bean(emp1).to("log:myloggingqueue");
//		
//	}


	@Override
	public void process(Exchange arg0) throws Exception {
		// TODO Auto-generated method stub
		String body=arg0.getIn().getBody(String.class);
		System.out.println(body);
		
		
		
	}
}

//@Component
//class GetEmployeeData{
//	
//	Logger logger =LoggerFactory.getLogger(GetEmployeeData.class);
//	public void getData(Employee emp) {		
//
//		//String body=arg0.getIn().getBody(String.class);
//	   // logger.info("Java  method invoked"+body);
//		logger.info("employee details : " + emp.getId() + emp.getName()+ "${body}");
//	}
//
//}

