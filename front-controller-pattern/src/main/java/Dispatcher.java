import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Dispatcher {

	public void dispatch(HttpServletRequest request, HttpServletResponse response, String view) {

        if (view != null){
            RequestDispatcher dispatcher = request.getRequestDispatcher(mapViewToJspPage(view));
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String mapViewToJspPage(String view) {

        if (view.equalsIgnoreCase("displayPersonDetail")){
            return "person.jsp";
        } else if (view.equalsIgnoreCase("displayTaskDetail")){
            return "task.jsp";
        }

        return null;
    }
}
