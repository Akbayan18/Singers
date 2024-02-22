package kz.baibalaeva.javaEE;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "/add")
public class AddSingers extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/addSingers.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String red= "/add?error";
       String name = req.getParameter("name");
       String surname = req.getParameter("surname");
       String birthdate = req.getParameter("birthdate");
       String city = req.getParameter("city");
       Singers singers = new Singers();
       singers.setName(name);
       singers.setSurname(surname);
       singers.setBirthdate(birthdate);
       singers.setCity(city);
       if (DB.addSingers(singers)){
           red="/hoo";
       }
       resp.sendRedirect(red);
    }
}
