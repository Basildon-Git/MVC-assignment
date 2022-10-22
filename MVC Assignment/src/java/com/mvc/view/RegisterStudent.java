package com.mvc.view;

import com.mvc.controller.studentDAOImplementation;
import com.mvc.model.student;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "RegisterStudent", urlPatterns = {"/studreg"})
public class RegisterStudent extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher dispatcher;
        
        String fName = request.getParameter("fname");
        String sName = request.getParameter("sname");
        String program = request.getParameter("program");
        String username = request.getParameter("uname");
        String password = request.getParameter("pass");
        String dob = request.getParameter("dob");
        
        studentDAOImplementation imp = new studentDAOImplementation();
        student st = new student();
        st.setFirstName(fName);
        st.setSurname(sName);
        st.setProgram(program);
        st.setUsername(username);
        st.setPassword(password);
        st.setDateOfBirth(dob);
        imp.createStudent(st);
        
        dispatcher = request.getRequestDispatcher("loginStudent.jsp");
        
        dispatcher.forward(request, response);
        
    }
}
