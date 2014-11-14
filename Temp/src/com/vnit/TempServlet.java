package com.vnit;

import java.io.IOException;
import javax.servlet.http.*;
import java.util.Date;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@SuppressWarnings("serial")
public class TempServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");

DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();


Entity employee = new Entity("Employee");

employee.setProperty("firstName", "Antonio");
employee.setProperty("lastName", "Salieri");

Date hireDate = new Date();
employee.setProperty("hireDate", hireDate);

employee.setProperty("attendedHrTraining", true);


datastore.put(employee);

	}
}
