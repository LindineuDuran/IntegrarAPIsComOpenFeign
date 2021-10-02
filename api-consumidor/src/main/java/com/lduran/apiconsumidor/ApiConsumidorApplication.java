package com.lduran.apiconsumidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiConsumidorApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ApiConsumidorApplication.class, args);
	}

}
