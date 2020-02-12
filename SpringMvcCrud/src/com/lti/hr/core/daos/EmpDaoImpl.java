package com.lti.hr.core.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.hr.core.entities.Employee;
import com.lti.hr.core.exceptions.HrException;

@Repository
public class EmpDaoImpl implements EmpDao{

	@PersistenceContext
	private EntityManager entitymgr;//We can't use Autowired for EntityManager so we have to use different annotation @PersistanceContext
	
	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		// TODO Auto-generated method stub
		Query q=entitymgr.createQuery("From Employee");
		ArrayList<Employee> empList=(ArrayList<Employee>) q.getResultList();
		return empList;
	}

}
