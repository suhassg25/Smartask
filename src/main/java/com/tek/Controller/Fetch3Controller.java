package com.tek.Controller;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tek.Dao.StudentDao;
import com.tek.Dto.Student;

@WebServlet("/gets")
public class Fetch3Controller extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao dao = new StudentDao();
		List<Student> std = dao.getAll();
		List<Student> student = new ArrayList();
	
		
		for (Student s : std) {
			if (s.getFirstName().equals(req.getParameter("name"))) {
				student.add(s);
			}
		}
		if (student.isEmpty()) {
			req.getRequestDispatcher("view2.jsp").forward(req, resp);
		} else {
			req.setAttribute("names", student);
			req.getRequestDispatcher("view1.jsp").forward(req, resp);
		}
	}
}
