package com.demo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/jersey")
public class MyController {
 
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/hi") 
	public String getQueryParam(@QueryParam("name") String name){
		System.out.println("JERSEY");
		
		return "hello : "+name;
	}
	
	@GET
	@Path("/hello/{no}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	public String getPathParam(@PathParam("no") String no){
		
		return no; 
	}
	
	/*@GET
	@Path("/matrix/{make}/{model}/{year}")
	@Produces("text/plain")
	public String getFromMatrixParam(@PathParam("make") String make,
	                                 @PathParam("model") PathSegment car,
	                                 @MatrixParam("color") Color color,
	                                 @PathParam("year") String year)
	{
	   return "A " + color + " " + year + " " + make + " " + car.getPath();
	}*/
	
	
}
