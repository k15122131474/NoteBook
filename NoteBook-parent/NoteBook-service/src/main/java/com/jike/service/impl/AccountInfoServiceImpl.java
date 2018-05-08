package com.jike.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jike.dao.AccountInfoDao;
import com.jike.entity.AccountInfo;
import com.jike.service.AccountInfoService;

@Service("accountInfoService")
public class AccountInfoServiceImpl implements AccountInfoService {
	@Autowired
	public AccountInfoDao accountInfoDao;

	@Override
	public AccountInfo login(AccountInfo accountInfo) {
		AccountInfo byAccount = accountInfoDao.getByAccount(accountInfo.getAccount());
		if (byAccount != null) {
			if (accountInfo.getPassword().equals(byAccount.getPassword())) {
				return byAccount;
			}
		}
		return null;
	}

	@Override
	public AccountInfo register(AccountInfo accountInfo) {
		AccountInfo byAccount = accountInfoDao.getByAccount(accountInfo.getAccount());
		if (byAccount == null) {
			accountInfoDao.insertAccountInfo(accountInfo);
			return accountInfo;
		}
		return null;
	}

	@Override
	public AccountInfo modifyProfile(AccountInfo accountInfo) {
		accountInfoDao.updateAccountInfo(accountInfo);
		AccountInfo byid=accountInfoDao.getById(accountInfo.getId());
		return byid;
	}

	public AccountInfoDao getAccountInfoDao() {
		return accountInfoDao;
	}

	public void setAccountInfoDao(AccountInfoDao accountInfoDao) {
		this.accountInfoDao = accountInfoDao;
	}

}
