package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cadastro/*")
public class Cadastro extends HttpServlet {
    private String name;
    private String password;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.getWriter().print("Cadastro efetuado.");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.name = req.getParameter("txtNome");
        this.password = req.getParameter("txtsenha");

        this.setName(name);
        this.setName(name);
        this.password = (!(this.name).isEmpty()) ? this.name : "Guest";

        StringBuilder html = new StringBuilder();

        html.append("<html>");
        html.append("<head>");
        html.append("<title>Servlet executado - Recuperação de dados.</title>");
        html.append("</head>");
        html.append("<body>");
        html.append("<h1>Seja bem vindo, " + this.name + "!</h1>");
        html.append("<h1>Senha cadastrada: , " + this.password + "!</h1>");
        html.append("</body>");
        html.append("</html>");

        resp.getWriter().print(html);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = (!name.isEmpty()) ? name : "Guest";
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String password)
    {
        this.password = (!password.isEmpty()) ? password : "123";
    }


}
