package com.example.demo;

import com.example.demo.member.controller.AuthController;
import com.example.demo.oop.controller.OopController;
import com.example.demo.quiz.controller.QuizController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		OopController oopController = new OopController();
		AuthController authController = new AuthController();
		QuizController quizController = new QuizController();
		quizController.execute(scanner);
		authController.execute(scanner);
		oopController.execute(scanner);
		while (true){
			System.out.println(" 메뉴를 입력하세요\n " +
					" 0.EXIT " + " 1. 알고리즘 " + " 2. 핸드폰 " + " 3. 멤버 " + " 4. 퀴즈 ");
			switch (scanner.next()){
				case "0" :
					System.out.println(" 종료 ");
					return;
				case "1" :
					System.out.println(" 1. 알고리즘 ");break;
				case "2" :
					System.out.println(" 2. 핸드폰 ");break;
				case "3" :
					System.out.println(" 3. 멤버 ");break;
				case "4" :
					System.out.println(" 4. 퀴즈 ");break;
				default:
					System.out.println("잘못된 번호");break;
			}
		}
	}
}
