package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/arquivo/*")
public class Arquivo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OutputStream out = null;
        FileInputStream file = null;

        try
        {
            out = resp.getOutputStream();
            resp.setContentType("application/zip");

            resp.addHeader("Content-Disposition", "atachment; file-name: arquivo.zip"); // colocando um header na resposta -> esse arquivo deve ser salvo com o nome de arquivo.zip
            file = new FileInputStream("C:/jpt/jptpgm/Java/Web/training-servlet-oficial/src/main/assets/images/homer_zip.zip");
            byte[] buffer = new byte[1024]; //1 mb

            int b;
            while ((b = file.read(buffer)) > -1) // significa que ainda há bytes para serem lidos no arquivo -> isso garante a leitura do arquivo
            {
                //out -> canal de saída
                out.write(buffer, 0, b); // escrevo no canal de saída o conteúdo de buffer, da posição zero ate a posição b
            }
        }
        finally
        {
            if (file != null)
            {
                file.close(); // fecho o file
            }
            if (out != null)
            {
                out.close();
            }
        }
    }
}
