package com.example.demo;

import com.example.demo.client.IbgeClient;
import com.example.demo.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class DemoApplication implements CommandLineRunner {

	@Autowired
	IbgeClient ibgeClient;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<State> stats = ibgeClient.getStats();
		System.out.println("stats: " + stats);
	}
}
