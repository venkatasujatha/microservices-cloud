package com.tectoro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.bean.LimitsConfiguration;

@RestController
public class LimitController {
	
	@Autowired
	private LimitsConfiguration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration limitsConfiguration()
	{
		return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
		
	}

}
