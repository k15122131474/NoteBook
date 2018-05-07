package com.jike.service;

import com.jike.entity.AccountInfo;

public interface AccountInfoService {
	 AccountInfo login(AccountInfo accountInfo);
	 AccountInfo register(AccountInfo accountInfo);
	 AccountInfo modifyProfile(AccountInfo accountInfo);
}
