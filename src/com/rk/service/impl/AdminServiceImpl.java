
package com.rk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.dao.UserMapper;
import com.rk.model.User;
import com.rk.service.AdminService;

/** 
                   _ooOoo_ 
                  o8888888o 
                  88" . "88 
                  (| -_- |) 
                  O\  =  /O 
               ____/`---'\____ 
             .'  \\|     |//  `. 
            /  \\|||  :  |||//  \ 
           /  _||||| -:- |||||-  \ 
           |   | \\\  -  /// |   | 
           | \_|  ''\---/''  |   | 
           \  .-\__  `-`  ___/-. / 
         ___`. .'  /--.--\  `. . __ 
      ."" '<  `.___\_<|>_/___.'  >'"". 
     | | :  `- \`.;`\ _ /`;.`/ - ` : | | 
     \  \ `-.   \_ __\ /__ _/   .-` /  / 
======`-.____`-.___\_____/___.-`____.-'====== 
                   `=---=' 
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
         ���汣��       ����BUG 
*/
@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User login(String account, String password) {
		User user = null;
		//1.ͨ��mapper���ҵ���Ӧ�����ݿ��¼
		try {
			user = userMapper.selectByAccount(account);
			//2.ͨ�������ж��Ƿ�ƥ��
			if(!user.getPassword().equals(password)) {
				return null;
			}
			//3.ƥ���򷵻�user,���򷵻�null
			return user;
		} catch (Exception e) {
			System.out.println("�����˺Ų����û�ʱ�׳��쳣");
			e.printStackTrace();
			return null;
		}
	}
}
