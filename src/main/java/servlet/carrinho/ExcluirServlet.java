package servlet.carrinho;

import entity.Carrinho;
import entity.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Carrinho/Excluir/*")
public class ExcluirServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        HttpSession session = req.getSession();
        Carrinho carrinho = (Carrinho) req.getAttribute("carrinho");
        if (carrinho != null && carrinho.getProdutoById(id) != null)
        {
            carrinho.deleteProduto(id);
        }
        req.getRequestDispatcher("../Carrinho/Carrinho").forward(req, resp);
    }
}
