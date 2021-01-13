package servlet.properties;

import model.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit/*")
public class EditServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key = req.getParameter("key");
        if (key != null)
        {
            String value = Properties.getValue(key);
            if (value != null) {
                req.setAttribute("key", key);
                req.setAttribute("value", value);
            }
        }

        req.getRequestDispatcher("/edit.jsp").forward(req, resp);
    }
}
