package com.lti.hr.core.services;

import java.util.ArrayList;

import com.lti.hr.core.entities.Employee;
import com.lti.hr.core.exceptions.HrException;

public interface EmpServices {

	public ArrayList<Employee> getEmpNameList() throws HrException;
	public boolean isAuthenticated(String usernm, String passwd);
}
