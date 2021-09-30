package impl;

import com.User;

import ifc.UserControllerIfc;

public class UserControllerImpl implements UserControllerIfc{

	@Override
	public User getUser(int id) {
		User user = null;
		if (id == 1) {
			user = new User(id, "LUIS");
		}
		return user;
	}

}
