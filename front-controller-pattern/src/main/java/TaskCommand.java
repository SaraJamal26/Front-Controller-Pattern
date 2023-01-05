import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TaskCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		Task task = new Task(1, "Code this design pattern");
        request.setAttribute("taskDetail", task);

        return "displayTaskDetail";
	}

}
