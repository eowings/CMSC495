package com.project.CMSC495;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.CMSC495.User;
import com.project.CMSC495.UserRepository;

/**
 * @author      Edward Owings <eddyo2@yahoo.com>
 * @version     4.3                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */


/**
 * User Service, defines all User table actions
 */
@Service
@Transactional
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

}