package com.bitlabs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@NotNull(message="Please Enter Full Name")
    private String name;
	@NotNull(message="Email id should not be empty")
	@Email(message="Please eneter correct email id")
    private String email;
	@NotNull(message="Please Enter mobile number")
    private String mobilenumber;
    @NotNull(message="Please Enter Password")
    private String password;
    private static String role="user";


    public String getMobilenumber() {
 
        return mobilenumber;
    }
    public static String getRole() {
		return role;
	}
	public void setMobilenumber(String mobilenumber) {

        this.mobilenumber = mobilenumber;
    }

    public User() {

        super();

    }

 

    public User(String name, String email, String mobilenumber, String password) {

        super();

 

        this.name = name;

 

        this.email = email;

 

        this.mobilenumber = mobilenumber;

 

        this.password = password;

 

    }

 

    public Long getId() {

 

        return id;

 

    }

 

    public void setId(Long id) {

 

        this.id = id;

 

    }

 

    public String getName() {

 

        return name;

 

    }

 

    public void setName(String name) {

 

        this.name = name;

 

    }

 

    public String getEmail() {

 

        return email;

 

    }

 

    public void setEmail(String email) {

 

        this.email = email;

 

    }

 

    public String getPassword() {

 

        return password;

 

    }

 

    public void setPassword(String password) {

 

        this.password = password;

 

    }

 

}