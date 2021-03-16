package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet01
 */
@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet01 - service()����");
		//��û ������ Ȯ��
		System.out.println(req.getRemoteHost());//Ŭ���̾�Ʈ ip
		//���� ������ ���� �� ����
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/view01.jsp");
		rd.forward(req, resp);
		/*
		resp.setContentType("text/html; charset=UTF-8");
		Writer writer = resp.getWriter();
		writer.write("<html>");
		writer.write("<head></head>");
		writer.write("<body>");
		writer.write("Servlet01</hr/>");
		writer.write("</html>");
		writer.flush();
		writer.close();*/
		
	}

}
