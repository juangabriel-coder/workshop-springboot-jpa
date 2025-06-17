package com.educandoweb.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
		
		try {
            Class.forName("org.h2.Driver");
            System.out.println("Driver H2 carregado com sucesso!");
        } catch (ClassNotFoundException e) {
            System.err.println("Erro: Driver H2 não encontrado no classpath.");
            e.printStackTrace();
        }
	}

}
