package com.randevudefterim.shopservice;

import com.turkcell.tcell.core.annotations.EnableSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.turkcell.tcell.exception.annotations.EnableException;

@SpringBootApplication
@EnableSecurity
@EnableException
public class ShopserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopserviceApplication.class, args);
	}

}
