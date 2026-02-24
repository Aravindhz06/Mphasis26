package com.java.spr;

import org.springframework.context.annotation.Bean;

public class AppConfig {

		//Equivalent to <bean id="beanJobChennai">
	@Bean
	public JobDetails beanJobChennai() {
		return new JobDetails(
				"Software Engineer",
				"Mphasis",
				"Chennai"
				);
	}
	
	@Bean
	public Person personRupesh() {
		return new Person(1,
				"Rupesh",
				beanJobChennai(), // SAME bean reused
				new Family("Patna","Bihar"));
	}
	
	@Bean
	public Person personAravindh() {
		return new Person(2,
				"Aravindh",
				beanJobChennai(),
				new Family("Villupuram","TamilNadu"));
	}
	
	@Bean
	public Person personPrashanth() {
		return new Person(3,
				"Prashanth",
				beanJobChennai(),
				new Family("Kanpur","UttarPradesh"));
	}
}
