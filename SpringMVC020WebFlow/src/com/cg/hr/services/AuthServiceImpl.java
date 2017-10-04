package com.cg.hr.services;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.cg.hr.daos.UserDao;
import com.cg.hr.entities.User;
import com.cg.hr.exception.EmpException;
@Service
public class AuthServiceImpl implements AuthService {

	private UserDao dao;
	
	@Resource	//by type
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	@Override
	public User isAuthenticated(User userForm) throws EmpException {
		System.out.println("In Service "+userForm.getUserName()+" "+userForm.getMessage());
		User UserDb=dao.getUserOnUserName(userForm.getUserName());
		if(UserDb==null)
		{
			userForm.setMessage("UserName does not exist");
			userForm.setAuthSucc(false);
		}
		else{
		if(userForm.getPassword().equals(UserDb.getPassword()))
			{
			userForm.setAuthSucc(true);
			userForm.setFullName(UserDb.getFullName());
			}
		else
			{
			userForm.setMessage("Password Mismatching");
			userForm.setAuthSucc(false);
			}
		
		
		}
		return userForm;
	}
}
