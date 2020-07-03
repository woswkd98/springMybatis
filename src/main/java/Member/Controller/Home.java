package Member.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller 
public class Home  {
	@RequestMapping("/t1")
	public String t1() {
	
		return "HomeView";
	}
}	



	