/**
 * @Title: UserAction.java
 * @Package: com.community.action
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-1-14 ����12:11:11
 * @version V1.0
 */
package com.community.action;

import com.community.model.User;
import com.community.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author Steven Ming
 *
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
	private User user = new User();
	private UserService userService;
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String login() {
		System.out.println("loginAction����ִ��");
		user = userService.login(user);
		if(user == null){
			this.addActionMessage("�û������������");
		} else {
			this.addActionMessage("��¼�ɹ���");
		}
		return "finish";
	}

}
