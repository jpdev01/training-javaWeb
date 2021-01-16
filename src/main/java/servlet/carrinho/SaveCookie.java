package servlet.carrinho;

import entity.Carrinho;
import entity.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/Cookie/Save")
public class SaveCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = (HttpSession) req.getSession();
        Carrinho carrinho = (Carrinho) session.getAttribute("carrinho");
        if (carrinho == null)
        {
            carrinho = new Carrinho();
        }
        List<Produto> produtos = carrinho.getProdutos();
        Cookie cookie = new Cookie("carrinho", carrinho.toString());


    }
}
