package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	//list of user
	List<User> list =List.of(
			new User(101L,"Vishal","8980909809"),
			new User(102L,"Akash","7859869059"),
			new User(103L,"Sriram","453695899")
			);

	@Override
	public User getUser(Long id) {

		return  list.stream()
				.filter(user -> 
				user.getUserId()
				.equals(id))
				.findAny()
				.orElse(null);
	}

}
