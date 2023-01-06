

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	
       
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String requestURI = request.getRequestURI();
        CommandHelper commandHelper = new CommandHelper();
        Command command = commandHelper.getCommand(requestURI);
        String view = command.execute(request, response);
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.dispatch(request, response, view);
    }

}
