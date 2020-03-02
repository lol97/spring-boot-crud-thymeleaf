package com.example.learn;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:/config/configSpring.xml")
public class LearnApplication {

	public static void main(String[] args) {
//            ApplicationContext context =  SpringApplication.run(LearnApplication.class, args);
//            InjectViaConstructor halloSpringController = (InjectViaConstructor) context.getBean("injectViaConstructor");
//            halloSpringController.getMessage();
//            
//            InjectViaSetter injectViaSetter = (InjectViaSetter) context.getBean("injectViaSetter");
//            injectViaSetter.getMessage();
		SpringApplication.run(LearnApplication.class, args);
	}

}
