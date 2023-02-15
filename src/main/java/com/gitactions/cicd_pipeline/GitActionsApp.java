package com.gitactions.cicd_pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitActionsApp {
	public static void main(String[] args)  
	{  
		System.out.println( "Hello App - Sharon!" );
		System.out.println( "Application Started!!" );
	SpringApplication.run(GitActionsApp.class, args);    
	}   
}
