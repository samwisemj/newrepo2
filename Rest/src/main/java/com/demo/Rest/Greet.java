package com.demo.Rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {

	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public String sayHelo(String name)
	{
		return "Hello "+name;
	}
	
}
