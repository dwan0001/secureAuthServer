package TP104.Dosewise.server;

import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import TP104.Dosewise.server.connectdb.connectdb;
import TP104.Dosewise.server.readdata.listdata;



@Path("myresource")
public class MyResource {

	connectdb cdb = new connectdb();
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<listdata> getIt() throws URISyntaxException, SQLException {
        return connectdb.getdata();
    }
}
