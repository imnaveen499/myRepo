package com.demo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/class")
public class MyClass {

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/employee")
	public Employee getEmp(Employee emp){
		//sSystem.out.println(emp.toString());
		
		MyClass vv=new MyClass();
		
		return emp;
	}
	
	
}
