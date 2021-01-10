package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/cadastroJSP/*", initParams = {
        @WebInitParam(name="moeda", value ="Real"),
        @WebInitParam(name="moeda-simbolo", value="R$"),
        @WebInitParam(name="País", value="Brasil")
})
public class CadastroJsp extends HttpServlet {
    private String name;
    private String password;
    private String coin;
    private StringBuilder html;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        resp.getWriter().print("Cadastro efetuado.");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = cadastrar(req);
        req.setAttribute("response", name);

        req.getRequestDispatcher("success.jsp").forward(req, resp);
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

    public String cadastrar(HttpServletRequest req)
    {
        this.name = req.getParameter("txtNome");
        this.password = req.getParameter("txtpassword");
        this.setName(name);
        this.setPassword(this.password);
        return this.name;
    }


}
