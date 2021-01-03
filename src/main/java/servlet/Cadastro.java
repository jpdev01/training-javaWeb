package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/cadastro/*", initParams = {
        @WebInitParam(name="moeda", value ="Real"),
        @WebInitParam(name="moeda-simbolo", value="R$"),
        @WebInitParam(name="País", value="Brasil")
})
public class Cadastro extends HttpServlet {
    private String name;
    private String password;
    String coin;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.getWriter().print("Cadastro efetuado.");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.name = req.getParameter("txtNome");
        this.password = req.getParameter("txtpassword");

        this.setName(name);
        this.setPassword(this.password);

        StringBuilder html = new StringBuilder();


        setMoeda();

        html.append("<html>");
        html.append("<head>");
        html.append("<title>Servlet executado - Recuperação de dados.</title>");
        html.append("</head>");
        html.append("<body>");
        html.append("<h1>Seja bem vindo, " + this.name + "!</h1>");
        html.append("<h1>Senha cadastrada: " + this.password + "!</h1>");
        html.append("<h5>Você se cadastrou via " + req.getHeaderNames() + "</h5>");
        html.append("<h5>A moeda cadastrada no sistema é: " + getMoeda() + "<h5>");
        html.append("</body>");
        html.append("</html>");
        resp.setContentType("text/html"); //desnecessário ex: image/jpeg
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

    public void setMoeda()
    {
//        ServletConfig config = getServletConfig();
//        String moeda = config.getInitParameter("Moeda");
        this.coin = getInitParameter("Moeda");
    }

    public String getMoeda()
    {
        return this.coin;
    }

}
