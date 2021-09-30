package impl;

import com.User;

import ifc.UserControllerIfc;

public class AdminControlerImpl {
	
	private UserControllerIfc userController;

	public AdminControlerImpl(UserControllerIfc userController) {
		super();
		this.userController = userController;
	}
	
	public User recoverUserInfo(int id) {
		return userController.getUser(id);
	}

}
