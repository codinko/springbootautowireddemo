package com.codinko.springbootautowired.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codinko.springbootautowired.demo.dao.EmployeeDAO;
import com.codinko.springbootautowired.demo.vo.EmployeeRequestVO;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	EmployeeDAO employeeDAO;

	public String searchById(EmployeeRequestVO employeeRequestVO) {
		LOGGER.info("request : {}", employeeRequestVO);

		String result = employeeDAO.searchById(employeeRequestVO);

		return result;
	}

}
