package com.bminozzi.appspringbootmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bminozzi.appspringbootmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User mayara = new User("1","Mayara Lima","mayara@gmail.com");
		User alex = new User("2","Alex Green","alex@gmail.com");
		List<User> listUsers = new ArrayList<User>();
		listUsers.addAll(Arrays.asList(mayara, alex));
		return ResponseEntity.ok().body(listUsers);
	}

}
