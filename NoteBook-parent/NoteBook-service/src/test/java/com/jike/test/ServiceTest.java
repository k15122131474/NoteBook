package com.jike.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jike.dao.AccountInfoDao;
import com.jike.entity.AccountInfo;
import com.jike.service.AccountInfoService;
import com.jike.service.impl.AccountInfoServiceImpl;

public class ServiceTest {
	@Test
	public void testAccountInfoService() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext-dao.xml", "applicationContext-service.xml" });

		AccountInfoService accountInfoService = ac.getBean(AccountInfoService.class);
		accountInfoService.login(new AccountInfo("111", "333"));
		accountInfoService.register(new AccountInfo("444", "444", "555"));
		accountInfoService.modifyProfile(new AccountInfo("jj", "333", "555"));
		// ApplicationContext ac = new
		// ClassPathXmlApplicationContext("applicationContext-dao.xml");
		//
		// AccountInfoDao accountInfoDao = ac.getBean(AccountInfoDao.class);
		// accountInfoDao.insertAccountInfo(new AccountInfo("444", "444", "555"));
	}
}
