package com.project.Spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Spring.entity.WalletEntity;

public interface WalletDao extends JpaRepository<WalletEntity, String>  {

}
