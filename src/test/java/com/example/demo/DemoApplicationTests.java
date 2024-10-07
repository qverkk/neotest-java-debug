package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;

@WebMvcTest(controllers = TestController.class)
@Import({ IntegrationTestConfig.class, BaseSecurityConfig.class })
class DemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Run this");
	}

}
