
package com.cg.hr.daos;

import com.cg.hr.entities.User;
import com.cg.hr.exception.EmpException;

/**
 * 
 * @author shivaras
 *
 */
public interface UserDao {

		User getUserOnUserName(String userName) throws EmpException;
		
}

