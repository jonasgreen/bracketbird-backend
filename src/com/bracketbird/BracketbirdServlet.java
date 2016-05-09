package com.bracketbird;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
public class BracketbirdServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.addHeader("Access-Control-Allow-Origin", "*");
    resp.setContentType("application/json");
    PrintWriter out = resp.getWriter();
    out.println("{\":a\":\"Flot\"}");
  }
}
