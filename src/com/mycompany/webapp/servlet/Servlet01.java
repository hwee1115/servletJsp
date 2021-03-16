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
		System.out.println("Servlet01 - service()실행");
		//요청 내용을 확인
		System.out.println(req.getRemoteHost());//클라이언트 ip
		//응답 내용을 생성 및 전송
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
