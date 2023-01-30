package com.codinko.springbootautowired.demo.dao;

import com.codinko.springbootautowired.demo.vo.EmployeeRequestVO;

public interface EmployeeDAO {

	public String searchById(EmployeeRequestVO employeeRequestVO);

}
