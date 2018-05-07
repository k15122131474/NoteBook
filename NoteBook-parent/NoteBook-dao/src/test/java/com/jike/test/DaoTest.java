package com.jike.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jike.dao.AccountInfoDao;
import com.jike.dao.RecordDao;
import com.jike.entity.AccountInfo;
import com.jike.entity.Record;

public class DaoTest {

	@Test
	public void testAccountInfoDao() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");

		AccountInfoDao accountInfoDao = ac.getBean(AccountInfoDao.class);

		AccountInfo accountInfo = accountInfoDao.getById(1);
		System.out.println(accountInfo);
		// AccountInfo accountInfo = accountInfoDao.getByAccount("111");
		// accountInfoDao.insertAccountInfo(new AccountInfo("hahha", "333", "333"));

		// accountInfoDao.updateAccountInfo(new AccountInfo("hiahia", "333", "222"));

	}

	@Test
	public void testRecordDao() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");

		RecordDao recordDao = ac.getBean(RecordDao.class);
		// recordDao.insertRecord(new Record(2, new Date(), "jkfdsajfdsfjsk", 2));
		// recordDao.updateRecord(new Record(2, 1, new Date(), "hahahhaooo", 3, 1));
		Record byId = recordDao.getById(3);
		System.out.println(byId);
		List<Record> byId2 = recordDao.getByUid(2);
		System.out.println(byId2);
		List<Record> byId3 = recordDao.getByUidAndMark(new Record(2, 2));
		System.out.println(byId3);
	}
}
