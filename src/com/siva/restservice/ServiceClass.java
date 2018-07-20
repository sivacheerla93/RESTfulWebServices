package com.siva.restservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/welcome")
public class ServiceClass {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/text")
	public String textResp() {
		return "Hello, Welcome to Restful webservices session!";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("/xml")
	public String xmlResp() {
		return "<?xml version=\"1.0\"?>" + "<hello>Hello Message from RestFull Service in XML Format</hello>";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/html")
	public String htmlResp() {
		return "<h1>Dear All,Please continue the hands-on after the training to learn more</h1>";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/json")
	public String jsonResp() {
		return "[{name:'RAJ', band:'C2'},{name:'Rajesh', band:'C1'},{name:'SHIVA', band:'B1'},{name:'Dakshith', band:'B2'}]";
	}
}
