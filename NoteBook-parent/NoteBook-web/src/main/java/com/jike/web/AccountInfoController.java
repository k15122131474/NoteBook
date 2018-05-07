package com.jike.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jike.entity.AccountInfo;
import com.jike.service.AccountInfoService;

@Controller
public class AccountInfoController {
	@Autowired
	private AccountInfoService accountInfoService;

	@RequestMapping("register")
	@ResponseBody
	public String registerAccountInfo(AccountInfo accountInfo) {
		AccountInfo register = accountInfoService.register(accountInfo);
		String jsonString = JSON.toJSONString(register);
		System.out.println("registerAccountInfo run");
		return jsonString;
	}

	@RequestMapping("modify")
	@ResponseBody
	public String modifyAccountInfo(AccountInfo accountInfo) {
		AccountInfo register = accountInfoService.modifyProfile(accountInfo);
		String jsonString = JSON.toJSONString(register);
		System.out.println("modifyAccountInfo run");
		return jsonString;
	}

	@RequestMapping("login")
	@ResponseBody
	public String login(AccountInfo accountInfo,HttpSession httpSession) {
		AccountInfo register = accountInfoService.login(accountInfo);
		httpSession.setAttribute("accountInfo", register);
		String jsonString = JSON.toJSONString(register);
		System.out.println("login run");
		return jsonString;
	}

	public AccountInfoService getAccountInfoService() {
		return accountInfoService;
	}

	public void setAccountInfoService(AccountInfoService accountInfoService) {
		this.accountInfoService = accountInfoService;
	}
	
}
