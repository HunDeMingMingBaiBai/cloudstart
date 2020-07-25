package com.ssd.cloudstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 启动一个服务注册中心
public class CloudstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudstartApplication.class, args);
	}

}
