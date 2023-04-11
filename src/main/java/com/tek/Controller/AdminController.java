package com.tek.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tek.Dao.StudentDao;
import com.tek.Dto.Student;

@WebServlet("/admin")
public class AdminController extends HttpServlet {
	StudentDao dao = new StudentDao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Student> allStudents = dao.getAll();
		if (allStudents.isEmpty()) {
			req.getRequestDispatcher("view2.jsp").forward(req, resp);
		} else {
			req.setAttribute("names", allStudents);
			req.getRequestDispatcher("view3.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		if (id > 0) {

			dao.deleteById(id);
			List<Student > std=dao.getAll();
			if (std.isEmpty()) {
				
				req.getRequestDispatcher("view2.jsp").forward(req, resp);
			} else {
				req.setAttribute("names", std);
				req.getRequestDispatcher("view3.jsp").include(req, resp);
			}
		}
	}
}
