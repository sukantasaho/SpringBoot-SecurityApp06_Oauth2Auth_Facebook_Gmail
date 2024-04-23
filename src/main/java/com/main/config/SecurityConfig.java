package com.main.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		//place the authentication and authorization logics for the request url
		http.authorizeRequests().antMatchers("/home").permitAll()//no Authentication and Authorization 
		.anyRequest().authenticated().and().formLogin().and().oauth2Login()
		.and().csrf().disable();
	   
	}
	
}
