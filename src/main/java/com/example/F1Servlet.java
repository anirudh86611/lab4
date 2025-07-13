package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class F1Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Formula 1 Info</title></head><body>");
        out.println("<h1>Welcome to Formula 1 Stats</h1>");
        out.println("<ul>");
        out.println("<li>2024 Champion: Max Verstappen</li>");
        out.println("<li>Top Team: Red Bull Racing</li>");
        out.println("<li>A site by : Anirudh - 2021WA86611</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }
}

