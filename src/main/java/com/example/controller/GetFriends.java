package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Friend;
import com.example.service.FriendsServiceinter;

@RestController
@RequestMapping("/friends")
public class GetFriends {
	
	@Autowired
	private FriendsServiceinter friendsserviceinter;
	
	@GetMapping("/getfriends")
	
	public List<Friend> getFriends() {
		return friendsserviceinter.getFriends();
	}
	
	@GetMapping("/{id}")
	
	public Friend getFriend(@PathVariable String id) {
		return friendsserviceinter.getFriend(id);
		
	}
	
}