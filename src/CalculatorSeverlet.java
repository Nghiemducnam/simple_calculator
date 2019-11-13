import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="CalculatorSeverlet", urlPatterns = "/calculate")

public class CalculatorSeverlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            float firstOperand = Integer.parseInt(req.getParameter("firstOperand"));
            float secondOperand = Integer.parseInt(req.getParameter("secondOperand"));
            char Operator = req.getParameter("Operator").charAt(0);

            PrintWriter writer  = resp.getWriter();
            writer.println("<html>");
            writer.println("<h1>result: </h1>");

            try{
                float result = Calculator.Calculate(firstOperand, secondOperand, Operator);
                writer.println(firstOperand + " " + Operator + " " + secondOperand + " = " + result);
            }catch (Exception ex){
                writer.println("Error: " + ex.getMessage());
            }
            writer.println("</html>");
        }

    }


