package com.demo.mims;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.mims.controller.FirstController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests extends JerseyTest{

	@Override
	protected Application configure() {
		return new ResourceConfig(FirstController.class);
	}
	@Test
	public void contextLoads() {
		
		String Response = target("/first/test").request().get(String.class);
		System.out.println(Response +"Arun");
	}
}
