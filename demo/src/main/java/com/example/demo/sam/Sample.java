package com.example.demo.sam;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	@GetMapping("/sam")
	public String Hello(@PathParam("name")String name)
	{
		return "hii"+name; 
	}

}
