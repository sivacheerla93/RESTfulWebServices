package com.siva.restclient;

import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.client.ClientConfig;

public class ClientClass {
	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(getBaseURI());

		System.out.println("*****TEXT*****");
		System.out.println("Text Request: "
				+ target.path("rest").path("welcome/text").request().accept(MediaType.TEXT_PLAIN).get(String.class));

		System.out.println("*****XML*****");
		System.out.println("XML Request: "
				+ target.path("rest").path("welcome/xml").request().accept(MediaType.TEXT_XML).get(String.class));

		System.out.println("*****HTML*****");
		System.out.println("HTML Request: "
				+ target.path("rest").path("welcome/html").request().accept(MediaType.TEXT_HTML).get(String.class));

		System.out.println("*****JSON*****");
		System.out.println("JSON Request: " + target.path("rest").path("welcome/json").request()
				.accept(MediaType.APPLICATION_JSON).get(String.class));
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8085/RestfulWebServiceDemo").build();
	}
}