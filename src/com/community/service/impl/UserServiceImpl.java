/**
 * @Title: UserServiceImpl.java
 * @Package: com.community.service.impl
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-1-14 обнГ12:23:39
 * @version V1.0
 */
package com.community.service.impl;

import com.community.dao.UserDao;
import com.community.model.User;
import com.community.service.UserService;

/**
 * @author Steven Ming
 *
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(User user) {
		user = userDao.login(user);
		return user;
	}

}
