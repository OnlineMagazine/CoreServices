/**
 * 
 */
package koontal.magazine.com.users.dao.implementation;

import koontal.magazine.com.users.bean.UserBean;
import koontal.magazine.com.users.dao.IUserAddDao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * @author KOONTAL
 *
 */
@Repository
public class UserAddDaoImpl implements IUserAddDao{

	@Override
	public UserBean addUserDao(UserBean userData, SessionFactory sessionFactory) {
		sessionFactory.getCurrentSession().save(userData);
		sessionFactory.getCurrentSession().flush();
		sessionFactory.getCurrentSession().clear();
		return userData;
	}

}
