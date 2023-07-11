package com.controller; /**
 * @project MiniProject - Copy
 * @author Will
 * @date 7/10/2023
 */

import com.dao.StudentDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeController", value = "/Home")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("userName");
        String pass = request.getParameter("userPass");

        if (StudentDAO.getInstance().checkLogin(name, pass)==true) {
            RequestDispatcher rd = request.getRequestDispatcher("infor.jsp");
            rd.forward(request, response);
        } else {
            out.print("Sorry UserName or Password Error!");
            response.sendRedirect("login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
