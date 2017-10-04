package com.cg.hr.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.hr.entities.User;
import com.cg.hr.exception.EmpException;
@Repository
public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {
		
	}
	//Autowiring for entity manager
	@PersistenceContext	//Annotation for Injecting entity manager specially
	private EntityManager manager;
	
	
	
	@Override
	public User getUserOnUserName(String userName) throws EmpException {
	System.out.println("In Dao "+userName);
		User user=manager.find(User.class,userName);
	
	System.out.println("Finding dao "+user);
		return user;	//returning new user object and returning from Table
	}

}
