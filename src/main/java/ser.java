import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.log4j.Logger;
@WebServlet(name = "ser",urlPatterns = "/ser")//声明
public class ser extends HttpServlet {
    private static Logger logger = Logger.getLogger(ser.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String t = req.getParameter("tizhong");
        String t1 = req.getParameter("shengao");
        // System.out.println("This is println message.");
        System.out.println(t);
        if (t1.equals("123") && t.equals("123"))
            resp.sendRedirect("http://www.baidu.com");
        else {
            // 记录debug级别的信息
            logger.debug("This is debug message.");
            // 记录info级别的信息
            logger.info("This is info message.");
            // 记录error级别的信息
            logger.error("This is error message.");
            }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
