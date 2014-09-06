/**
 * 
 */
package koontal.magazine.com.users.service.implementaion;

import koontal.magazine.com.users.bean.UserBean;
import koontal.magazine.com.users.dao.IUserAddDao;
import koontal.magazine.com.users.service.IUserAddService;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author KOONTAL
 *
 */
@Service
@Transactional(propagation=Propagation.REQUIRED)
public class UserAddServiceImpl implements IUserAddService{

	@Autowired
	private IUserAddDao userAddDao;
	
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * Add user service for adding the user data
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public UserBean addUserService(UserBean userData) {
		
		return userAddDao.addUserDao(userData,sessionFactory);
	}

}
