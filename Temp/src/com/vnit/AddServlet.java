
package com.vnit;

import java.io.IOException;
import javax.servlet.http.*;
import java.util.Date;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@SuppressWarnings("serial")
public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();


Entity employee = new Entity("questionStore");

employee.setProperty("question", req.getParameter("question"));
employee.setProperty("answer", req.getParameter("answer"));
employee.setProperty("topic", req.getParameter("topic"));

employee.setProperty("op1", req.getParameter("op1"));
employee.setProperty("op2", req.getParameter("op2"));
employee.setProperty("op3", req.getParameter("op3"));
employee.setProperty("op4", req.getParameter("op4"));

datastore.put(employee);
resp.sendRedirect("addQA.html");
	}
}
