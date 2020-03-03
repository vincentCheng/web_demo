package com.example.web_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebDemoApplicationTests {

	@Autowired
	MySvc mySvc;

	@Test
	public void addTest() {
		int res = mySvc.add(300,200);
		assert res == 500;
	}

	@Test
	public void addTest2() {
		int res = mySvc.add(300,201);
		assert res == 501;
	}

}
