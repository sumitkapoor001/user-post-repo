package com.spf.user.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spf.user.model.User;

@Service
public class UserDaoService 
{
	private static List<User> users=new ArrayList<User>();
	private static int count=3;							
	static
	{
		users.add(new User(1,"John",new Date()));
		users.add(new User(2,"Sam",new Date()));
		users.add(new User(3,"Vince",new Date()));
	}
	
	public List<User> getAllUsers()
	{
		return users;
	}
	
	public User addUser(User user)
	{
		if(user.getId()==null)
		{
			user.setId(++count);
		}
		users.add(user);
		return user;
	}
	
	public User getAUser(int id)
	{
		Iterator<User> user=users.iterator();
		if(user.next().getId()==id)
		{
			return user.next();
		}
		return null;
	}
}
