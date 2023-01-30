package com.codinko.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.codinko.springbootautowired.demo.helper.DBdummy;
import com.codinko.springbootautowired.demo.service.EmployeeService;
import com.codinko.springbootautowired.demo.vo.EmployeeRequestVO;

// BIGGEST thing i learnt.. usually all classes will have having simila rpackage name like com.codinko.springbootautowired.demo
// however if the package is like 'com.codinko.main" and you just mentioned  "com.codinko.main" accidentally
// none of the Autowiring will work!!.. scanBasePackages is also mandatory..else autowiring wont work..
@SpringBootApplication(scanBasePackages = { "com.codinko.springbootautowired.demo" })
public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

		EmployeeService service = context.getBean(EmployeeService.class);
		DBdummy dbObj = context.getBean(DBdummy.class);
		dbObj.setDbContent("102 104 101");

		EmployeeRequestVO requestVO = new EmployeeRequestVO();
		requestVO.setName("codinko");
		requestVO.setId("101");

		String response = service.searchById(requestVO);

		LOGGER.info("response : {}", response);

		System.out.println(response);

	}
}
