package com.thehecklers.aircraftfn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Function;

@SpringBootApplication
public class AircraftFnApplication {

	public static void main(String[] args) {
		SpringApplication.run(AircraftFnApplication.class, args);
	}

//	public Function<Aircraft, Aircraft> aircraftFunction() {
//		return a -> {
//			System.out.println(a);
//			return a;
//		};
//	}
}
