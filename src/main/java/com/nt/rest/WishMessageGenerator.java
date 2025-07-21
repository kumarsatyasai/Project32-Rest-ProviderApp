package com.nt.rest;

import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class WishMessageGenerator {
	
	
	@GetMapping("/wish")
	public ResponseEntity<String> showWishMessage(){
		
		return new ResponseEntity<String>("Hello Kande Kumar.", HttpStatus.OK);
	}

}
