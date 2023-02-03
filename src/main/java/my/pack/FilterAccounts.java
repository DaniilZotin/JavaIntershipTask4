package my.pack;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class FilterAccounts implements Filter {

    public List<Accounts> Customers = new ArrayList<>(List.of(new Accounts("Finlonging","Daniil","147"),
            new Accounts("Jimo","Alex","111"),
            new Accounts("Lorms","Mikes","894")));

    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {

    }





    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String login = servletRequest.getParameter("login");
        String password = servletRequest.getParameter("password");
        String name = servletRequest.getParameter("name");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpSession session = req.getSession();
        Accounts user = (Accounts) session.getAttribute("user");


        if(user == null){
            user = new Accounts(login,login,password);
            session.setAttribute("user",user);
            System.out.println("set");
        }else {
            System.out.println(session.getAttribute("asdfasdf"));
        }


        System.out.println(user.getPassword() + " " + user.getLogin());




        int n = 0;
        for(Accounts accounts : Customers)
        {
            if(login.equals(accounts.getLogin())  && password.equals(accounts.getPassword())) {
                n = 1;
                user = new Accounts(login,login,password);
                session.setAttribute("user", user);
            }
        }



        if (n == 1) {
            RequestDispatcher dispatcher = servletRequest.getServletContext().getRequestDispatcher("/menu.jsp");
            dispatcher.forward(servletRequest, servletResponse);

        } else {
            servletRequest.setAttribute("error","Your date is bad try again");
            RequestDispatcher dispatcher = servletRequest.getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(servletRequest, servletResponse);
        }
        System.out.println(session.getAttribute("user"));


    }


    @Override
    public void destroy() {}
}
