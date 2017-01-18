/**
 * @Title: UserAction.java
 * @Package: com.community.action
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-1-14 下午12:11:11
 * @version V1.0
 */
package com.community.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

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
	private Map<String, Object> jdata;
	
	public Map<String, Object> getJdata() {
		return jdata;
	}

	public void setJdata(Map<String, Object> jdata) {
		this.jdata = jdata;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String login() {
		user = userService.login(user);
		if(user == null){
			this.addActionMessage("用户名或密码错误！");
		} else {
			this.addActionMessage("登录成功！");
		}
		return "finish";
	}
	
	public String mLogin() {
		HttpServletRequest request = ServletActionContext.getRequest();
		user.setUserid(request.getParameter("userid"));
		user.setPassword(request.getParameter("password"));
		user = userService.login(user);
		jdata = new HashMap<String, Object>();
		if(user == null) {
			jdata.put("message", "用户名或密码错误！");
		} else {
			jdata.put("message", "登录成功！");
		}
		return "Jfinish";
	}

}
