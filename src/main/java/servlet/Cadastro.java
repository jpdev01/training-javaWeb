package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cadastro/*")
public class Cadastro extends HttpServlet {
    public String name;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.getWriter().print("Cadastro efetuado.");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("Cadastro efetuado.");
        this.name = req.getParameter("nome");

        this.name = (!(this.name).isEmpty()) ? this.name : "Guest";

        StringBuilder html = new StringBuilder();

        html.append("<html>");
        html.append("<head>");
        html.append("<title>Servlet executado - Recuperação de dados.");
        html.append("</head>");
        html.append("<body>");
        html.append("<h1>Seja bem vindo, " + this.name + "!</h1>");
        html.append("</body>");
        html.append("</html>");

        resp.getWriter().print(html);
    }
}
