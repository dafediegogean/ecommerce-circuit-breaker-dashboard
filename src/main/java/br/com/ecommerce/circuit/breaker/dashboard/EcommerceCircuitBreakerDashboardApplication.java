package br.com.ecommerce.circuit.breaker.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
public class EcommerceCircuitBreakerDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceCircuitBreakerDashboardApplication.class, args);
	}

}
