package com.example.LR4;

import Entity.User;
import Model.Create;
import Model.Update;
import com.google.gson.Gson;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.IOException;


@WebServlet(name="UpdateServlet", value="/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("/Pages/update.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String data = request.getParameter("data");
        System.out.println(data);
        Gson gson = new Gson();
        User user = gson.fromJson(data, User.class);

        Update.update(user);
        response.getWriter().write("Обновление завершено");
    }
}
