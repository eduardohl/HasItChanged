package com.hasitchanged.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hasitchanged.model.Notifier;
import com.hasitchanged.model.VerificationRule;
import com.hasitchanged.service.NotifierService;

@WebServlet("/addnotifier")
public class AddNotifierServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private NotifierService notifierService;

	public AddNotifierServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		Integer notifierId = null;
		
		String targetUrl = request.getParameter("targetUrl");
		String targetString = request.getParameter("targetString");
		String frequencyStr = request.getParameter("frequency");
		String ruleStr = request.getParameter("rule");
		try {
			Integer frequency = Integer.parseInt(frequencyStr);
			VerificationRule rule = VerificationRule.valueOf(ruleStr);
			notifierId = notifierService.addNotifier(new Notifier(targetUrl, targetString, frequency, rule));
		} catch (NumberFormatException nfe) {
			//message = invalid frequency
			nfe.printStackTrace();
		}
		
		PrintWriter writer = response.getWriter();
		if(notifierId != null){
			writer.print("Adicionado com sucesso");
		} else {
			writer.print("Notifier nao adicionado");
		}
	}
}
