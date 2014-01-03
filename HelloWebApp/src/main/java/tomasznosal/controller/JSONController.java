package tomasznosal.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import tomasznosal.model.User;
import tomasznosal.model.UserManager;
import tomasznosal.model.Message;

@Controller
@RequestMapping("/users")
public class JSONController {

	UserManager userManager = new UserManager();

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<User> getUsersInJSON() {
		return userManager.getUsers();
	}
	
	
	@RequestMapping(params = {"username","email"}, method = RequestMethod.POST)
	public @ResponseBody Message postUserInJSON(@RequestParam(value = "username", required = true) String username,
											@RequestParam(value = "email", required = true) String email) {
 
		User user = new User(userManager.getId(), username, email);
		Message message = new Message();
		message.setMessage(userManager.addUser(user));
		return message;
	}
	

	@RequestMapping(value="{id}" ,params = {"username","email"}, method = RequestMethod.PUT)
    @ResponseBody
    public Message putUserById(@PathVariable Long id,
    						@RequestParam(value = "username", required = true) String username,
    						@RequestParam(value = "email", required = true) String email) {
		Message message = new Message();
		message.setMessage(userManager.updateUser(id, username, email));
        return message;
    }	
	
	@RequestMapping("/{id}")
    @ResponseBody
    public User getById(@PathVariable Long id) {
		User user = userManager.getUserById(id);
        return user;
    }
	
	@RequestMapping(value="{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public Message deleteComputer(@PathVariable long id) {
		Message message = new Message();
		message.setMessage(userManager.deleteUser(id));
		return message;
	}
	
}
