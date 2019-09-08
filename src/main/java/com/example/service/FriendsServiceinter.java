package com.example.service;

import java.util.List;

import com.example.entity.Friend;

public interface FriendsServiceinter {
	
	public List<Friend> getFriends();
	public Friend getFriend(String id);

}
