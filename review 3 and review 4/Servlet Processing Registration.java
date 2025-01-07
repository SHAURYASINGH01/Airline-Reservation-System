@WebServlet("/user")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Save user data to database, for example:
        User newUser = new User(name, email, password);
        UserDAO.save(newUser); // Save to database

        response.sendRedirect("/user?action=viewProfile");
    }
}

