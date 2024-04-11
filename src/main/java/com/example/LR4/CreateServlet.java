package com.example.LR4;

import Entity.User;
import Model.Create;
import com.google.gson.Gson;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(name= "CreateServlet", value = "/CreateServlet")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = request.getRequestDispatcher("/Pages/create.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = request.getReader();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        String data = stringBuilder.toString();

        Gson gson = new Gson();
        User user = gson.fromJson(data, User.class);

        Create.add(user);
        response.getWriter().write("Новый пользователь добавлен");
    }
}
