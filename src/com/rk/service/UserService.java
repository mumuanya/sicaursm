/**
 * 
 */
package com.rk.service;

import com.rk.model.User;

public interface UserService {
	/**
	 * �û���¼,����һ���û���һ������,���ص�¼�Ƿ�ɹ�
	 * @return �Ƿ��¼�ɹ�
	 */
	User login(String account,String password);
	
	
	

}
