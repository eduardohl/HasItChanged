package com.hasitchanged.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hasitchanged.model.User;
import com.hasitchanged.service.NotifierService;

@WebServlet(urlPatterns = { "/ListNotifier" }, 
		    initParams = {@WebInitParam(name="host", value="localhost")}
)
public class ListNotifierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private NotifierService notifierService;
	
    public ListNotifierServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		
		notifierService.listNotifiers(new User(email));
	}
}
