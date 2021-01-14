package servlet.carrinho;

import entity.Produto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListarCarrinho extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("produtos", Produto.getProdutos());
        req.getRequestDispatcher("/carrinho/produtos.jsp").forward(req, resp);
    }
}