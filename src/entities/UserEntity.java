package entities;

import java.sql.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "User")
@XmlType(propOrder = {"user_id", "user_name", "f_name", "l_name", "email", "secret", "salt", "last_login"})
public class UserEntity {
	
	public UserEntity() {
		
	}

	public UserEntity(int user_id, String user_name, String f_name, String l_name, String email, String secret, String salt, Date last_login) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.secret = secret;
		this.salt = salt;
		this.last_login = last_login;
	}

	public UserEntity(String user_name, String f_name, String l_name, String email, String secret, String salt,
			Date last_login) {
		this.user_name = user_name;
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.secret = secret;
		this.salt = salt;
		this.last_login = last_login;
	}

	private int user_id;
	private String user_name;
	private String f_name;
	private String l_name;
	private String email;
	private String secret;
	private String salt;
	private Date last_login;

	@XmlElement
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@XmlElement
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@XmlElement
	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	@XmlElement
	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	@XmlElement
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement
	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	@XmlElement
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	@XmlElement
	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	
	@Override
	public String toString() {
		return "User ID: " + this.user_id + "\n" +
				"User Name: " + this.user_name + "\n" + 
				"First Name: " + this.f_name + "\n" +
				"Last Name: " + this.l_name + "\n" +
				"Email ID: " + this.email + "\n" +
				"Secret: " + this.secret + "\n" +
				"Salt: " + this.salt + "\n" +
				"Last Login: " + this.last_login;
	}

}