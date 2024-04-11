package com.example.LR4;

import Entity.User;
import Model.Delete;
import com.google.gson.Gson;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "DeleteServlet", value="/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("/Pages/delete.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String data = request.getParameter("data");
        Gson gson = new Gson();
        User user = gson.fromJson(data, User.class);

        Delete.delete(user);
        response.getWriter().write("Пользователь удалён");
    }
}
