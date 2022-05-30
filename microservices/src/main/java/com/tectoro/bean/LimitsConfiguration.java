package com.tectoro.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("microservices")
public class LimitsConfiguration {
	
	private int maximum;
	private int minimum;
	
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public LimitsConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public LimitsConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LimitsConfiguration [maximum=" + maximum + ", minimum=" + minimum + "]";
	}
	

}
