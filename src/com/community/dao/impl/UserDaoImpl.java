/**
 * @Title: UserDaoImpl.java
 * @Package: com.community.dao.impl
 * @Description: TODO
 * @author Steven Ming
 * @date 2017-1-14 обнГ12:21:54
 * @version V1.0
 */
package com.community.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.community.dao.UserDao;
import com.community.model.User;

/**
 * @author Steven Ming
 *
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	
	public User login(User user) {
		String hql = "from User where userid = ? and password = ?";
		List<User> list = (List<User>) this.getHibernateTemplate().find(hql, user.getUserid(), user.getPassword());
		if(list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
