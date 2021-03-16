package com.mycompany.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.dto.Board;

public class Controller05 {
	public String getBoardList(HttpServletRequest request,HttpServletResponse respnse) throws ServletException {
			System.out.println(request.getRemoteHost());//클라이언트 ip
		
		//데이터 생성 및 JSP전달
		List<Board> list = new ArrayList<>();
		for(int i=1; i<10; i++) {
			Board board = new Board();
			board.setBno(i);
			board.setBtitle("제목" +i);
			board.setBcontent("내용" +i);
			board.setBwriter("spring");
			list.add(board);
		}
		request.setAttribute("list",list);
		
		//뷰 이름 리턴
		return "view052";
	}
}
