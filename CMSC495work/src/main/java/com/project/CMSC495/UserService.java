package com.project.CMSC495;

import java.util.List;

import com.project.CMSC495.User;


/**
 * @author      Edward Owings <eddyo2@yahoo.com>
 * @version     4.3                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */


/**
 * User service, defines the interactions between the controller and the user table.
 */

public interface UserService {

	
	 public List<User> getAllUsers();
	 
	 public User getUserById(int id);
	 
	 public void addUser(User user);
	 
	 public void deleteUser(int id);
	

}

