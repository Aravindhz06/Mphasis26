package com.java.spr;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {
	
	@Value("#{'com.mysql.cj.jdbc.Driver'}")
	private String driver;
	
	@Value("#{'jdbc:mysql://localhost:3306/Mphasis26'}")
	private String url;
	
	@Value("#{'root'}")
	private String user;
	
	@Value("#{'root@39'}")
	private String pwd;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setUrl(url);
		ds.setDriverClassName(driver);
		ds.setUsername(user);
		ds.setPassword(pwd);
		return ds;
	}
}
