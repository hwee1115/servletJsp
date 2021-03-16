package com.mycompany.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.dto.Board;

public class Controller05 {
	public String getBoardList(HttpServletRequest request,HttpServletResponse respnse) throws ServletException {
			System.out.println(request.getRemoteHost());//Ŭ���̾�Ʈ ip
		
		//������ ���� �� JSP����
		List<Board> list = new ArrayList<>();
		for(int i=1; i<10; i++) {
			Board board = new Board();
			board.setBno(i);
			board.setBtitle("����" +i);
			board.setBcontent("����" +i);
			board.setBwriter("spring");
			list.add(board);
		}
		request.setAttribute("list",list);
		
		//�� �̸� ����
		return "view052";
	}
}
