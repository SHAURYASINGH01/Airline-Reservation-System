@WebServlet("/user")
public class UserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("viewProfile".equals(action)) {
            // Assuming `user` is fetched from a database
            User user = UserDAO.getUserByEmail(request.getParameter("email"));
            request.setAttribute("user", user);  // Forward user object to JSP
            request.getRequestDispatcher("/profile.jsp").forward(request, response);
        }
    }
}
