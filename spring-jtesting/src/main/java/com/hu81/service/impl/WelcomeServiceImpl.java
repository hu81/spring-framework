package com.hu81.service.impl;

import com.hu81.dao.WelcomeDao;
import com.hu81.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {
	@Autowired
	private WelcomeDao welcomeDao;

	@Override
	public String sayHi(String toUser) {
		return welcomeDao.sayHi(toUser);
	}

	public void setWelcomeDao(WelcomeDao welcomeDao) {
		this.welcomeDao = welcomeDao;
	}
}
