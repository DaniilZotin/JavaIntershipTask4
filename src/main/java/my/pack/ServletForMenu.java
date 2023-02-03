package my.pack;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletForMenu extends HttpServlet {
    FilterAccounts accounts = new FilterAccounts();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        FilterAccounts filterAccounts = new FilterAccounts();

        req.setAttribute("list", filterAccounts.Customers);

        RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/accounts.jsp");
        dispatcher.forward(req, resp);
    }
}
