/**
 * 
 */
package com.rk.service;

import com.rk.model.User;

public interface UserService {
	/**
	 * 用户登录,输入一个用户名一个密码,返回登录是否成功
	 * @return 是否登录成功
	 */
	User login(String account,String password);
	
	
	

}
