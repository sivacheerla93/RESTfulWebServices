package com.siva.restservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/parameters")
public class RestParamsService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/single/{param}")
	public Response getmessage(@PathParam("param") String name) {

		return Response.status(200).entity("Dear " + name + "! This is the Last Day of the Training").build();

	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/double/{param1}/{param2}")
	public Response getmessage2(@PathParam("param1") String firstname, @PathParam("param2") String secondname) {

		return Response.status(200)
				.entity("Dear " + firstname + " " + secondname + "! This is the Last Day of the Training").build();

	}

}