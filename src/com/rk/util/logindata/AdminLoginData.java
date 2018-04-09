
package com.rk.util.logindata;

import com.alibaba.fastjson.JSON;

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
/**
 * �˺Ų�����1
	*���벻��ȷ2
	*��½�ɹ�3
	*��¼��ʱ4
	*
	*{
	��code��:3,
	��msg��:��xxx��
	}

 * @author Mrruan
 *
 */
public class AdminLoginData {
	
	private Integer code;  //��¼���� 
	private String msg;
	
	
	//���ĸ�����,�˺Ų�����1 ���벻��ȷ2 ��½�ɹ�3 ��¼��ʱ4
	public static String noAccount(String msg) {
		AdminLoginData adminLoginData = new AdminLoginData(1,msg);
		return JSON.toJSONString(adminLoginData);
	}
	public static String incorrectPassword(String msg) {
		AdminLoginData adminLoginData = new AdminLoginData(2,msg);
		return JSON.toJSONString(adminLoginData);
	}
	public static String success(String msg) {
		AdminLoginData adminLoginData = new AdminLoginData(3,msg);
		return JSON.toJSONString(adminLoginData);
	}
	public static String timeout(String msg) {
		AdminLoginData adminLoginData = new AdminLoginData(4,msg);
		return JSON.toJSONString(adminLoginData);
	}
	
	
	
	private AdminLoginData(Integer code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
