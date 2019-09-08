package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Friend;
import com.example.repository.FriendsRepository;

@Service
public class FriendsServiceimpl implements FriendsServiceinter  {
	
	@Autowired
	private FriendsRepository friendRepository;
	
	public List<Friend> getFriends() {
		
		return (List<Friend>) friendRepository.findAll();
	}
	
	public Friend getFriend(String id) {
		
		return friendRepository.findOne(id);
		
	}
}





