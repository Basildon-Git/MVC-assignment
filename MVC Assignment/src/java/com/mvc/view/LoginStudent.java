package com.mvc.view;

import com.mvc.controller.studentDAOImplementation;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginStudent", urlPatterns = {"/signin"})
public class LoginStudent extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();
        RequestDispatcher dispatcher;

        studentDAOImplementation imp = new studentDAOImplementation();

        if (imp.loginStudent(userName, password)) {
            session.setAttribute("username", userName);
            dispatcher = request.getRequestDispatcher("index.jsp");
        }else{
            request.setAttribute("status", "failed");
            dispatcher = request.getRequestDispatcher("loginStudent.jsp?msg=notexist");
        }
        dispatcher.forward(request, response);
    }

}
