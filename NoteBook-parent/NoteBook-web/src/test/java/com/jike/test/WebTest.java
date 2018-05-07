package com.jike.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jike.entity.AccountInfo;
import com.jike.service.AccountInfoService;

public class WebTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext-dao.xml", "applicationContext-service.xml" });

		AccountInfoService accountInfoService = ac.getBean(AccountInfoService.class);
		accountInfoService.login(new AccountInfo("111", "333"));
		accountInfoService.register(new AccountInfo("444", "444", "555"));
		accountInfoService.modifyProfile(new AccountInfo("jj", "333", "555"));
	}

}
