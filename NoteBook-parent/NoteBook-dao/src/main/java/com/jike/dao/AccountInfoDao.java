package com.jike.dao;


import com.jike.entity.AccountInfo;
public interface AccountInfoDao {
	 AccountInfo getById(Integer id);
	 AccountInfo getByAccount(String account);
	 Integer insertAccountInfo(AccountInfo accountInfo);
	 Integer updateAccountInfo(AccountInfo accountInfo);
}
