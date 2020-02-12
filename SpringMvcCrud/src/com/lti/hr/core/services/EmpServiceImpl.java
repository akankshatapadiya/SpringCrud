package com.lti.hr.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.hr.core.daos.EmpDao;
import com.lti.hr.core.entities.Employee;
import com.lti.hr.core.exceptions.HrException;

@Service
public class EmpServiceImpl implements EmpServices {

	@Autowired
	private EmpDao dao;
	
	@Override
	public ArrayList<Employee> getEmpNameList() throws HrException {
		// TODO Auto-generated method stub
		return dao.getEmpList();
	}

	@Override
	public boolean isAuthenticated(String usernm, String passwd) {
		// TODO Auto-generated method stub
		if(usernm.equals("Grish") && passwd.equals("aa")) {
			return true;
		}
		else
			return false;
	}

}
