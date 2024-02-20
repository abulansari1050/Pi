package com.project.Spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="Passphrase")
public class WalletEntity {
	@Id
	@Column(name="userpassphrase")
    @NotBlank(message = "Can't be empty!")
	private String userpassphrase;


	public String getUserpassphrase() {
		return userpassphrase;
	}

	public void setUserpassphrase(String userpassphrase) {
		this.userpassphrase = userpassphrase;
	}

//	@Override
//	public String toString() {
//		return "WalletEntity [userpassphrase=" + userpassphrase + "]";
//	}
//
//	
	


}
