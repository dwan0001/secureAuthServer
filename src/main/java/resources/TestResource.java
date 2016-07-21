package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestResource {
	
	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public void testOutput(){
		
	}
}
