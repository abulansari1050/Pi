package com.project.Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.Spring.entity.WalletEntity;
import com.project.Spring.service.WalletService;

@Controller
public class controller {
	@Autowired
	private WalletService walletService;
	
	@GetMapping("/")
	 public String view() {
		return "index";
	}
		
	@GetMapping("/StackPage")
	public String  Passphrase(Model model) {
	WalletEntity walletEntity= new WalletEntity();
	model.addAttribute("wallet_entity",walletEntity);
	return "stack";
	}
	
	@PostMapping("/wallet")
	public String wallet(@ModelAttribute("wallet_entity") WalletEntity walletEntity) {
		walletService.userWallet(walletEntity);
		return "redirect:/";
	}
	
	
	@GetMapping("/AboutPage")
	 public String view1() {
		return "about";
	}
	@GetMapping("/DeveloperPage")
	 public String dev() {
		return "developer";
	}
	@GetMapping("/ClaimPage")
	 public String sup() {
		return "claim";
	}
	@GetMapping("/ReadPage1")
	 public String view2() {
		return "read1";
	}
	@GetMapping("/ReadPage2")
	 public String view3() {
		return "read2";
	}

	    @GetMapping("/deleteuser/{userpassphrase}")
	    public String deleteUser(@PathVariable(value = "userpassphrase") String userpassphrase) {
	        // call delete employee method 
	        this.walletService.deleteUser(userpassphrase);
	        return "redirect:/admin";
	    }
	    
	 // display list of passphrase
	    @GetMapping("/AdminPage")
	    public String viewHomePage(Model model) {
	    	model.addAttribute("listUser", walletService.getAllUsers());
			return "admin";

	    }
}
