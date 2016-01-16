/*
 * HelloResource.java
 * (C) 2016 Siddhartha Ghosh / IBM India Pvt. Ltd.
 * All Rights Reserved
 */

package com.ibm.vis.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * This is just a simple Hello World service.
 * @author Siddhartha Ghosh (siddhartha.ghosh@in.ibm.com)
 *
 */
@Path("/hello")
public class HelloResource {

	@GET
	public String getInformation() {

		// 'VCAP_APPLICATION' is in JSON format, it contains useful information about a deployed application
		// String envApp = System.getenv("VCAP_APPLICATION");

		// 'VCAP_SERVICES' contains all the credentials of services bound to this application.
		// String envServices = System.getenv("VCAP_SERVICES");
		// JSONObject sysEnv = new JSONObject(System.getenv());
		
		return "Hi World!";

	}
}