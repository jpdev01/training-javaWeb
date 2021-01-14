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

@WebServlet("/Carrinho/Adicionar/*")
public class AdicionarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(req.getParameter("id"));
            Produto p = Produto.getProdutoById(id);

            HttpSession session = req.getSession(); // retorna um objeto que representa a session do user que faz a requisição naquele momento

            Carrinho carrinho = (Carrinho) session.getAttribute("carrinho");
            if (carrinho == null)  // se carrinho ainda não existir (primeira vez, primeiro produto)
            {
                carrinho = new Carrinho();
                session.setAttribute("carrinho", carrinho);
            }

            if (p != null)
            {
                carrinho.add(p);
            }
        } catch (Exception e ){
            e.printStackTrace();
        }

        req.getRequestDispatcher("../Produtos/List").forward(req, resp);

    }
}
