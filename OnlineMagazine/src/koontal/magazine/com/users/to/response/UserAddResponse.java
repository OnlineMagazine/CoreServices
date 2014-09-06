/**
 * 
 */
package koontal.magazine.com.users.to.response;

import koontal.magazine.com.users.bean.UserBean;
import koontal.magazine.com.util.common.CommonResponse;

/**
 * @author KOONTAL
 *
 */
public class UserAddResponse extends CommonResponse{

	private UserBean userData;

	public UserBean getUserData() {
		return userData;
	}

	public void setUserData(UserBean userData) {
		this.userData = userData;
	}
	
}
