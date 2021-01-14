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
import java.util.List;

@WebServlet("/Carrinho/Carrinho/*")
public class CarrinhoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        Carrinho carrinho = (Carrinho) session.getAttribute("carrinho");

        List<Produto> listCarrinho = carrinho.getProdutos();

        req.setAttribute("carrinho", listCarrinho);

        req.getRequestDispatcher("/carrinho/carrinho.jsp")
    }
}
