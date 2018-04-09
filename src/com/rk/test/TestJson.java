
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
         佛祖保佑       永无BUG 
*/
public class TestJson {
	
	@Test
	public void m1() {
		System.out.println(AdminLoginData.success("成功了"));
		System.out.println(AdminLoginData.incorrectPassword("密码不正确"));
		System.out.println(AdminLoginData.noAccount("没有这个用户"));
		System.out.println(AdminLoginData.timeout("超时"));
	}

}
