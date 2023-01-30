package com.codinko.springbootautowired.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codinko.springbootautowired.demo.helper.DBdummy;
import com.codinko.springbootautowired.demo.vo.EmployeeRequestVO;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	DBdummy dbDummy;

	public String searchById(EmployeeRequestVO employeeRequestVO) {

		boolean found = execute(dbDummy.getDbContent(), employeeRequestVO);
		if (found) {
			return "found";
		} else {
			return "not-found";
		}

	}

	private boolean execute(String dbContent, EmployeeRequestVO employeeRequestVO) {
		if (dbContent.contains(employeeRequestVO.getId())) {
			return true;
		} else {
			return false;
		}
	}

}
