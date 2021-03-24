package com.example.demo;

import Beans.Prototype;
import Beans.RequestClass;
import Beans.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		/*
		Dependency Injection: зависимости передаются в объект извне.
		Dependency Lookup: зависимости объекту не передаются извне. Объект сам решает как и когда ему запросить зависимости.
		 */


		//Singleton example
		/*
		Создается один бин на всё приложение.
		 */
		ApplicationContext context =  new AnnotationConfigApplicationContext("Beans");

		var bean = (Singleton) context.getBean("singleton");
		bean.setMessage("Hello. It is singleton.");
		System.out.println(bean.getMessage());

		var secondBean = (Singleton) context.getBean("singleton");
		System.out.println(secondBean.getMessage());
		System.out.println(bean == secondBean);
		System.out.println("End of singleton example");

		//Prototype example
		/*
		Каждый раз создает совершенно новый бин в отличии от singleton.
		 */
		context =  new AnnotationConfigApplicationContext("Beans");

		var b = (Prototype) context.getBean("prototype");
		b.setMessage("Hello. It is prototype.");
		System.out.println(b.getMessage());

		var secondB = (Prototype) context.getBean("prototype");
		System.out.println(secondB.getMessage());
		System.out.println(b == secondB);
		System.out.println("End of prototype example");


		//Request example
		/*
		Создаётся один бин на каждый HTTP запрос.
		Не знаю как показать разницу с сингллтоном так как не знаю как создать http запрос.
		Поэтому оставлю данный пример в таком виде.
		 */
		context =  new AnnotationConfigApplicationContext("Beans");

		var r = (RequestClass) context.getBean("requestClass");
		r.message = "Hello. It is request.";
		System.out.println(r.message);

		var secondR = (RequestClass) context.getBean("requestClass");
		System.out.println(secondR.message);
		System.out.println(r == secondR);
		System.out.println("End of request example");
	}
}
