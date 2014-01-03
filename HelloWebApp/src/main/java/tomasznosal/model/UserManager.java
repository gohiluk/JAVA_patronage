package tomasznosal.model;

import java.util.*;


public class UserManager {

	List <User> Users;
	Long id;
	
	public UserManager() {
		Users = new ArrayList<User>();
		id=0l;
	}
	
	public List<User> getUsers() {
		return Users;
	}

	public void setUsers(List<User> users) {
		Users = users;
	}
	
	public Long getId() {
		id+=1l;
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String addUser(User user) {
		Users.add(user);
		return "New user with id: " + user.getId().toString() + " was created successfully!";
	}
	
	public User getUserById(Long id) {
		for (int i=0; i<Users.size(); i++) {
			User tmp = Users.get(i);
			if (tmp.getId().equals(id)) {
				return tmp;
			}			
		}
		return null;
	}
	
	public String updateUser(Long id, String username, String email) {
		Integer index=-1;
		for (int i=0; i<Users.size(); i++) {
			User tmp = Users.get(i);
			if (tmp.getId().equals(id)) {
				index=i;
			}			
		}
		if (index!=-1) {
			Users.get(index).setEmail(email);
			Users.get(index).setUsername(username);
		
			return "User with id: " + Users.get(index).getId().toString() + " was updated successfully!";
		}
		return "User with id: " + id.toString() + " wasn't found";
	}
	
	public String deleteUser(Long id) {
		for (int i=0; i<Users.size(); i++) {
			User tmp = Users.get(i);
			if (tmp.getId().equals(id)) {
				Long index = Users.get(i).getId();
				Users.remove(i);
				return "User with id: " + index.toString() + " was removed successfully!";
			}			
		}
		return "User with id: " + id.toString() + " wasn't found";
	}
}
