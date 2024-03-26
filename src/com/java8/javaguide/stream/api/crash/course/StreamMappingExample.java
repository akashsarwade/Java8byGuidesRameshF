package com.java8.javaguide.stream.api.crash.course;

import java.util.ArrayList;
import java.util.List;

public class StreamMappingExample {

	public static void main(String[] args) {
		// creat List of User Object

		List<User> user = new ArrayList<>();
		user.add(new User(80, "amsarwade", "pass@123", "akash123@gmail.com"));
		user.add(new User(20, "sagar", "sagar@123", "sagar22@gmail.com"));
		user.add(new User(40, "sonia", "pass@123", "sony@gmail.com"));

		List<UserDTO> userDTO = new ArrayList<UserDTO>();
		UserDTO dto = null;

//		for (User user1 : usrs) {
//			userDTO.add(new UserDTO(user1.getId(), user1.getUsername(), user1.getEmail()));
//		}
	}
}

class UserDTO {

	private int id;
	private String username;
	private String email;

	public UserDTO(int id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

class User {
	private int id;
	private String username;
	private String password;
	private String email;

	public User(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
