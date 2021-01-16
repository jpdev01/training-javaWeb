package servlet.carrinho;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/User/Save")
public class SaveUser extends HttpServlet {
    public String name;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.setName(req.getParameter("name"));
        Cookie cookie = new Cookie("Username", this.name);
        cookie.setMaxAge(30);//30min
        resp.addCookie(cookie); //armazenada no browser
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
