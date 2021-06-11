package com.yas.book.inventory.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yas.book.inventory.entity.UserT;
import com.yas.book.inventory.repo.UserRepo;
import com.yas.book.inventory.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userrepo;


	public UserT addUser(UserT userT) {

		return userrepo.save(userT);
	}

}
