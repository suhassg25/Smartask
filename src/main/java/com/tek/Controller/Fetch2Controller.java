package com.tek.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tek.Dao.StudentDao;
import com.tek.Dto.Student;

@WebServlet("/fetch")
public class Fetch2Controller extends HttpServlet {
	StudentDao dao = new StudentDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Student> std = dao.getAll();
		List<Student> student = new ArrayList();
		for (Student s : std) {
			if (s.getGrade() == Integer.parseInt(req.getParameter("grade"))) {
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
