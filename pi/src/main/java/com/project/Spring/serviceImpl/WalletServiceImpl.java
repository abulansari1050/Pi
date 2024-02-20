package com.project.Spring.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Spring.dao.WalletDao;
import com.project.Spring.entity.WalletEntity;
import com.project.Spring.service.WalletService;

@Service
public class WalletServiceImpl implements WalletService {

	@Autowired
	private WalletDao walletDao;

	@Override
	public void userWallet(WalletEntity walletEntity) {
		this.walletDao.save(walletEntity);
		
	}

	@Override
	public List<WalletEntity> getAllUsers() {
		// TODO Auto-generated method stub
		return walletDao.findAll();
	}

	@Override
	public void deleteUser(String userpassphrase) {
		this.walletDao.deleteById(userpassphrase);
		
	} 	
}
