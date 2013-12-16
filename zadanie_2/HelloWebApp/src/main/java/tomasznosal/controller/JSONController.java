package tomasznosal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import tomasznosal.model.User;

@Controller
@RequestMapping("/hello")
public class JSONController {

	//@RequestMapping(value="{name}", method = RequestMethod.GET)
	@RequestMapping(params = {"person"}, method = RequestMethod.GET)
	public @ResponseBody User getUserInJSON(@RequestParam(value = "person", required = true) String message) {
 
		User user = new User();
		user.setMessage(message);
 
		return user;
 
	}
	
}
