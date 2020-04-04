package com.c2s.loginservice.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;


@Entity
@Table(name = "userlogin")
public class User {
	
	 public User() {
		super();
	}
	
	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "user_id")
	    private int id;
	    @Column(name = "user_name")
	    @Length(min = 5, message = "*Your user name must have at least 5 characters")
	    @NotEmpty(message = "*Please provide a user name")
	    private String firstName;
	    
	    
	    public User(int id ,String firstName, String password) {
	    	super();
	    	this.id = id;
	    	this.firstName = firstName;
	    	this.password = password;
	    
	    }

		@Override
		public String toString() {
			return "User {id=" + id + ", firstName=" + firstName + ", password=" + password + "}";
		}

		/*
	 * @Column(name = "email")
	 * 
	 * @Email(message = "*Please provide a valid Email")
	 * 
	 * @NotEmpty(message = "*Please provide an email") private String email;
	 */
	    @Column(name = "password")
	    @Length(min = 3, message = "*Your password must have at least 5 characters")
	    @NotEmpty(message = "*Please provide your password")
	    private String password;
	    
	/*
	 * @Column(name = "name")
	 * 
	 * @NotEmpty(message = "*Please provide your name") private String name;
	 * 
	 * @Column(name = "last_name")
	 * 
	 * @NotEmpty(message = "*Please provide your last name") private String
	 * lastName;
	 * 
	 * @Column(name = "active") private Boolean active;
	 */
	    
	/*
	 * @ManyToMany(cascade = CascadeType.MERGE)
	 * 
	 * @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
	 * inverseJoinColumns = @JoinColumn(name = "role_id")) private Set<Role> roles;
	 */
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

	/*
	 * public String getEmail() { return email; } public void setEmail(String email)
	 * { this.email = email; }
	 */
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	/*
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public String getLastName() { return lastName; } public
	 * void setLastName(String lastName) { this.lastName = lastName; } public
	 * Boolean getActive() { return active; } public void setActive(Boolean active)
	 * { this.active = active; }
	 */

	/*
	 * public Set<Role> getRoles() { return roles; } public void setRoles(Set<Role>
	 * roles) { this.roles = roles; }
	 */
		
		
	    
	    

}
