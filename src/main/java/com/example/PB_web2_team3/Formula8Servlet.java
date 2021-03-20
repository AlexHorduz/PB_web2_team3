package com.example.PB_web2_team3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Math.*;

@WebServlet(name = "formula8Servlet", value = "/formula8")
public class Formula8Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    private double calculate(double a, double b, double c, double d) {
        double answer = (5 * a / sin(a)) + sqrt(tanh(abs(b) * c) / Math.log(d));
        return answer;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String aParam = request.getParameter("a");
        String bParam = request.getParameter("b");
        String cParam = request.getParameter("c");
        String dParam = request.getParameter("d");

        try(PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            try {
                double a = Double.parseDouble(aParam);
                double b = Double.parseDouble(bParam);
                double c = Double.parseDouble(cParam);
                double d = Double.parseDouble(dParam);

                double result = calculate(a, b, c, d);
                if (result != result) {    //result = NaN
                    throw new IllegalArgumentException();
                }

                out.println("<img src=\"formula8.png\" alt=\"8th formula image\" border=\"2\" height=\"150\"/>");
                out.println("<h2>Answer for a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + " :</h2>");
                out.println("<h3>" + result + "</h3></br>");
            } catch (NumberFormatException e) {
                out.println("<h1>Error! Please, enter only numbers</h1>");
            } catch (IllegalArgumentException e) {
                out.println("<h1>Error! Follow the domain of the function</h1>");
            } finally {
                out.println("<a href=\"formula8page.jsp\"><h2>Back</h2></a>");
                out.println("</body></html>");
            }
        }
    }
}
