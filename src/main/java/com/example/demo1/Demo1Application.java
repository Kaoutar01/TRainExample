package com.example.demo1;

import com.example.demo1.controller.TrainController;
import com.example.demo1.model.Train;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

	@Autowired
	TrainController trainController;
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String...args) throws Exception {

		Train t = new Train(new Short("25"),"TN");
		trainController.createTrain(t);

	}
}
