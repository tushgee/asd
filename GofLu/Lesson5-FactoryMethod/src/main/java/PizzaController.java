import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pizza")
public class PizzaController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Your order is waiting.");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String selected = req.getParameter("selPizza");

        PizzaFactory factory = SimplePizzaFactory.getFactory();
        Pizza pizza = factory.createPizza(selected);
        resp.getWriter().println(pizza.getClass().getSimpleName());

        //different from below on when the decision has to be made - runtime or compile time?
        //which is one difference between framework and application development
        //Pizza pizza1 = new CheesePizza();
        //System.out.println(pizza.getClass().getSimpleName());


    }
}
