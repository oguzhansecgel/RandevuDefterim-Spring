package com.randevudefterim.shopservice;

import com.turkcell.tcell.core.annotations.EnableSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSecurity
public class ShopserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopserviceApplication.class, args);
	}

}
