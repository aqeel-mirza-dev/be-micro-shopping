package com.mohammad.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ShoppingApplication {

	public static void main(String[] args) {
		A a = new A();
		a.add();
		SpringApplication.run(ShoppingApplication.class, args);
	}

}

class A extends B{

	public void add(){
		System.out.println("calling add sequence super class method using super keyword");
		super.addSequence();
	}


}

class B{

	public void addSequence(){
		System.out.println("add sequence method from parent class is called");
	}

}
