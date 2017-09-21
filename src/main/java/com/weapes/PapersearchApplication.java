package com.weapes;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication
public class PapersearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PapersearchApplication.class, args);
	}


}
