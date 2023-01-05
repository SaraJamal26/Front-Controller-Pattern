import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PersonCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		Person person = new Person(1, "Yusuf", "Alnıaçık");
        request.setAttribute("personDetail", person);

        return "displayPersonDetail";
	}

}
