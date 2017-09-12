package cn.itcast.bigdata.hadooprpc.service;

import cn.itcast.bigdata.hadooprpc.protocol.IUserLoginService;

public class UserLoginServiceImpl implements IUserLoginService{

	public String login(String name, String passwd) {
		
		return name + "logged in successfully...";
	}
	
	
	

}
