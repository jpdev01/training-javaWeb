package servlet;

import model.Pessoa;

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

    public String cadastrar(HttpServletRequest req)
    {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        Pessoa p = new Pessoa(01, name, password);
        return name;
    }


}
