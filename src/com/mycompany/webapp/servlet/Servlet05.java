package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.controller.Controller05;

public class Servlet05 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet05 - service()실행");
		//요청 내용을 확인
		System.out.println(request.getRemoteHost());//클라이언트 ip
		
		//컨트롤러 생성 및 요청 처리 메소드 호풀
		Controller05 ctrl = new Controller05();
		String viewName=ctrl.getBoardList(request, response);
	
		//응답 내용을 생성 및 전송
		String prefix = "/WEB-INF/views/";
		String suffix=".jsp";
		RequestDispatcher rd = request.getRequestDispatcher(prefix+viewName+suffix);
		rd.forward(request, response);
		
		
	}

}
