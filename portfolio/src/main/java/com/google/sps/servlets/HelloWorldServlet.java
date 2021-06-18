package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
  
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      //list of messages
    final ArrayList<String> msgs = new ArrayList<>();
    {
        msgs.add("Have a good day!");
        msgs.add("I am proud of you!");
        msgs.add("You are amazing!");
    }

    response.setContentType("text/html;");
    response.getWriter().println(msgs);
  }
  
}

