package com.irn.rr.platform.userservice.serviceimpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.irn.rr.platform.userservice.entity.User;
import com.irn.rr.platform.userservice.entity.UserType;
import com.irn.rr.platform.userservice.repository.UserRepository;
import com.irn.rr.platform.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void registerAsAdmin(User user) {
		System.out.println("User===========>>>>>>"+user.getPassword());
//		String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
//		user.setPassword(encodedPassword);
		System.out.println("code reaches here!!!!!!!!!!!!!!");
		user.setUserType(UserType.ADMIN);
		user.setCreatedAt(LocalDateTime.now());
		userRepository.save(user);
	}
	
}
