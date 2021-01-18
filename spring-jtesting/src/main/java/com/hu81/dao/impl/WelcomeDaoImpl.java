package com.hu81.dao.impl;

import com.hu81.dao.WelcomeDao;
import org.springframework.stereotype.Repository;

@Repository
public class WelcomeDaoImpl implements WelcomeDao {

	@Override
	public String sayHi(String toUser) {
		return "Hi, " + toUser + ", Welcome!";
	}
}
