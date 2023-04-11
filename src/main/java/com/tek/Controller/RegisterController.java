package com.tek.Controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.type.LocalDateType;

import com.tek.Dao.StudentDao;
import com.tek.Dto.Student;

@WebServlet("/register")
public class RegisterController extends HttpServlet {

	LocalDate date = LocalDate.now();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Student student = new Student();
		String date1 = req.getParameter("dob");
		student.setFirstName(req.getParameter("firstName"));
		student.setLastName(req.getParameter("lastName"));
		student.setDOB(date1);
		student.setGender(req.getParameter("gender"));
		student.setGrade(Integer.parseInt(req.getParameter("grade")));
//		String date2="";
//		String date3="";
		String year = date.toString();
//		
//		for(int i=0;i<4;i++) {
//			date2+=date1.charAt(i);
//			date3+=year.charAt(i);
//		}

		String[] date2 = date1.split("-");
		String[] date3 = year.split("-");

		student.setAge(Integer.parseInt(date3[0]) - Integer.parseInt(date2[0]));
		StudentDao studentDao = new StudentDao();
		studentDao.saveStudent(student);
		req.getRequestDispatcher("view.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao studentDao = new StudentDao();
		List<Student> students = studentDao.getByName();

		req.setAttribute("names", students);
		req.getRequestDispatcher("view1.jsp").forward(req, resp);
	}
}
