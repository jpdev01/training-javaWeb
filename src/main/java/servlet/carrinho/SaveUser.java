package servlet.carrinho;

import entity.Carrinho;
import entity.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/User/Save")
public class SaveUser extends HttpServlet {
    public String name;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.setName(req.getParameter("name"));
        String s= req.getParameter("produtos");
        Cookie cookie = new Cookie("Username", this.name);
        cookie.setMaxAge(30);//30min
        resp.addCookie(cookie); //armazenada no browser

        HttpSession session = req.getSession();
        Carrinho carrinho = null;
        if (session != null)
        {
            carrinho = (Carrinho) session.getAttribute("carrinho");
        }

        if (carrinho == null)
        {
            carrinho = new Carrinho();
        }
        List<Produto> listCarrinho = carrinho.getProdutos();

        req.setAttribute("carrinho", listCarrinho);

        req.getRequestDispatcher("/carrinho/carrinho.jsp").forward(req, resp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
