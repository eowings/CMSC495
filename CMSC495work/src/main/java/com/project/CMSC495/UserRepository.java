package com.project.CMSC495;

import org.springframework.data.repository.CrudRepository;
import com.project.CMSC495.User;


/**
 * @author      Edward Owings <eddyo2@yahoo.com>
 * @version     4.3                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */


/**
 * User repository, sets the method used to communicate with the User table within database.
 */

public interface UserRepository extends CrudRepository<User, Integer> {
}
