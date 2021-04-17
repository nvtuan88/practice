package com.demo.servlet;

import com.demo.dao.PhoneDao;
import com.demo.entity.PhoneEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreatPhoneServlet", urlPatterns = {"/creatphone"})
public class CreatPhoneServlet extends HttpServlet {
    PhoneDao dao = new PhoneDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PhoneEntity phone = new PhoneEntity(
                request.getParameter("name"),
                request.getParameter("brand"),
                Integer.parseInt(request.getParameter("price")),
                request.getParameter("description")
        );

        dao.insertPhone(phone);

        response.sendRedirect("home");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("creatphone.jsp").forward(request, response);
    }
}
