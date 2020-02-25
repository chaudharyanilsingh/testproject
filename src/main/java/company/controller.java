package company;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class controller {
	@GetMapping(value="/")
	public String mapped()
	{
		return "here  is  heroku";
	}

}
