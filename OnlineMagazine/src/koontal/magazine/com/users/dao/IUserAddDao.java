/**
 * 
 */
package koontal.magazine.com.users.dao;

import koontal.magazine.com.users.bean.UserBean;

import org.hibernate.SessionFactory;

/**
 * @author KOONTAL
 *
 */
public interface IUserAddDao {

	/**
	 * @param userData
	 * @param sessionFactory
	 * @return
	 */
	UserBean addUserDao(UserBean userData, SessionFactory sessionFactory);

	
}
