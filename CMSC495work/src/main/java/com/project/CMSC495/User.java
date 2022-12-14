package com.project.CMSC495;

import java.util.Arrays;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * @author      Edward Owings <eddyo2@yahoo.com>
 * @version     4.3                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */


/**
 * Setter and Getter for User, defies the variables within user and determines the return string format.
 */

@Entity
@Table(name = "users")

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@NotBlank
    private String name;
    @NotBlank
    @Email(message = "Please enter a valid e-mail address")
    private String email;
    private String provider;
    private String channels;

 
    // Getters
    public int getId() {
        return id;
      }
    public String getName() {
      return name;
    }
    public String getEmail() {
        return email;
      }
    public String getProvider() {
        return provider;
      }
    public String getChannels() {
        return channels;
      }


    // Setters
    public void setId(int id) {
        this.id = id;
      }
    public void setName(String name) {
      this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }
    public void setChannels(String channels) {
        this.channels = channels;
    }

    // override toString()
    @Override
    public String toString() {
    	List<String> userChoices = Arrays.asList(name, email, provider, channels); 
    	String userChoicesString = String.join(", ", userChoices);
        return userChoicesString;
    }
     
}
