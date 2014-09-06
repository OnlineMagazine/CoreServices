/**
 * 
 */
package koontal.magazine.com.users.controller;

import javax.servlet.http.HttpServletRequest;

import koontal.magazine.com.constants.MagazineConstants;
import koontal.magazine.com.users.bean.UserBean;
import koontal.magazine.com.users.service.IUserAddService;
import koontal.magazine.com.users.to.request.UserAddRequest;
import koontal.magazine.com.users.to.response.UserAddResponse;
import koontal.magazine.com.util.common.StatusType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author KOONTAL
 *
 */
@Controller
public class UserController {

	@Autowired
	private IUserAddService userAddService;
	
	@RequestMapping(value="/user/add",method=RequestMethod.POST,consumes = MagazineConstants.APPLICATION_JSON, produces = MagazineConstants.APPLICATION_JSON)
	@ResponseBody
	public UserAddResponse addUserDetails(@RequestBody UserAddRequest userAddRequest,HttpServletRequest request){
		UserAddResponse userAddResponse = new UserAddResponse();
		UserBean userAdded=userAddService.addUserService(userAddRequest.getUserData());
		
    if(userAdded!=null){
	userAddResponse.setUserData(userAdded);
	userAddResponse.setResponseMsg("Added successfully");
	userAddResponse.setStatus(StatusType.SUCCESS);
    }else{
	userAddResponse.setUserData(null);
	userAddResponse.setResponseMsg("Not added,please try again");
	userAddResponse.setStatus(StatusType.FAILURE);
    }
	return userAddResponse;
	}
}
