
package com.rk.test;

import org.junit.Test;

import com.rk.util.logindata.AdminLoginData;

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
public class TestJson {
	
	@Test
	public void m1() {
		System.out.println(AdminLoginData.success("�ɹ���"));
		System.out.println(AdminLoginData.incorrectPassword("���벻��ȷ"));
		System.out.println(AdminLoginData.noAccount("û������û�"));
		System.out.println(AdminLoginData.timeout("��ʱ"));
	}

}
