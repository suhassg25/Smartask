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

@WebServlet("/get")
public class FetchControll extends HttpServlet {
	StudentDao dao = new StudentDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Student> grades = dao.getByGrade();
		req.setAttribute("names", grades);
		req.getRequestDispatcher("view1.jsp").forward(req, resp);

	}


}
