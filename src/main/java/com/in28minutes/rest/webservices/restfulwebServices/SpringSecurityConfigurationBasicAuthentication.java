package com.in28minutes.rest.webservices.restfulwebServices;

//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfigurationBasicAuthentication  {


//public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//	// Response to pre-flight request doesn't pass access control check
//	//basic Auth
//	
//	return http.authorizeHttpRequests(
//			auth -> auth.requestMatchers(HttpMethod.OPTIONS, "/**")
//			     .permitAll()
//			       .anyRequest()
//			         .authenticated())
//			            .httpBasic(Customizer.withDefaults())
//			              .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).csrf(AbstractHttpConfigurer::disable).build();
//	
//}
//}
