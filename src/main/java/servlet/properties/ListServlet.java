package servlet.properties;

import model.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/List/*")
public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> props = Properties.getProperties();
        req.setAttribute("props", props);

        req.getRequestDispatcher("properties/list.jsp").forward(req, resp);
    }
}
