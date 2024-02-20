package com.project.Spring.service;

import java.util.List;

import com.project.Spring.entity.WalletEntity;

public interface WalletService {
	void userWallet(WalletEntity walletEntity);

	List<WalletEntity> getAllUsers();

	void deleteUser(String userpassphrase);
}
