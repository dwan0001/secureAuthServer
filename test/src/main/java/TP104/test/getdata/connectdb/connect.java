package TP104.test.getdata.connectdb;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import TP104.test.getdata.mydata;


@Path("connect")
public class connect {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getinfor() {
		
		return mydata.main(String);
	}
}
