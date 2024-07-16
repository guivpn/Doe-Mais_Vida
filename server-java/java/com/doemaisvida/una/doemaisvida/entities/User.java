package com.doemaisvida.una.doemaisvida.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(length = 50)
	private String name;

	@Email
	@NotNull
	@Column(unique = true)
	private String email;

	@NotNull
	@Size(min = 6, max = 255)
	private String password;

	@NotNull
	@Size(min = 6, max = 255)
	@Column(name = "password_confirm")
	private String passwordConfirm;

	@Column(name = "blood_type")
	private String bloodType;

	private String location;

	@NotNull
	@Digits(integer = 15, fraction = 0)
	@Column(name = "cell_phone")
	private Long cellPhone;

	@Column(name = "img_url")
	private String imgUrl;

	public User() {
	}

	public User(Long id, String name, String email, String password, String passwordConfirm,
				String bloodType, String location, Long cellPhone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
		this.bloodType = bloodType;
		this.location = location;
		this.cellPhone = cellPhone;
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

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(Long cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
}
