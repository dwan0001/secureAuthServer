package TP104.Dosewise.server.connectdb;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import TP104.Dosewise.server.readdata.listdata;

public class connectdb {
	public static Connection getConnection() throws URISyntaxException, SQLException {
	    URI dbUri = new URI(System.getenv("postgres://tvnuyfdzdivima:6e7b50e1296b579877dbe888c5f98b9b7fb8d151b7ead1f227b14acebf009d91@ec2-50-17-194-129.compute-1.amazonaws.com:5432/d77u14h2uju2hh"));

	    String username = dbUri.getUserInfo().split(":")[0];
	    String password = dbUri.getUserInfo().split(":")[1];
	    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath() + "?sslmode=require";

	    return DriverManager.getConnection(dbUrl, username, password);
	}
public static List<listdata> getdata() throws URISyntaxException, SQLException {
	Connection c = connectdb.getConnection();
	Statement stmt = c.createStatement();
	ResultSet rs = stmt.executeQuery("select * from heroku1");
	List<listdata> list=new ArrayList<>();
	while(rs.next()){
		listdata name = new listdata(rs.getString("Name"));
		list.add(name);
		}
	return list;
	
}
}

