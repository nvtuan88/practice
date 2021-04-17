package com.demo.servlet;

import com.demo.dao.PhoneDao;
import com.demo.entity.PhoneEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
    PhoneDao dao = new PhoneDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PhoneEntity> phones = listPhone();
        if (phones.isEmpty()) {
            insertPhone();
            phones = listPhone();
        }
        request.setAttribute("phones", phones);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    private List<PhoneEntity> listPhone() {
        return dao.getPhone();
    }

    private void insertPhone() {
        for (int i = 1; i <= 10; i++) {
            PhoneEntity phone = new PhoneEntity("Phone " + i, "Iphone", 1000, "Máy chính hãng 100%");
            dao.insertPhone(phone);
        }

    }
}
