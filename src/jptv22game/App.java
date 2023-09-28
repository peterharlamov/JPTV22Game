/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    
    void run() {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        int attempts = 3;
        System.out.println("-----Game-----");
        do {
            Random rand = new Random();
            int averange = 11;
            int userInput = 0;
            int numberRandom = rand.nextInt(averange);
            System.out.print("Угадай число от 0 до 10: ");
            do {
                try {
                    userInput = scanner.nextInt(); scanner.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.print("Недопустимый ввод, попробуй еще раз: ");
                    scanner.nextLine();
                }
            } while(true);
            
            if (userInput == numberRandom) {
                System.out.println("Ты угадал!");
                System.out.println("Тебе добавлена еще 1 попытка!");
                attempts++;
            } else {
                System.out.println("Ты проиграл!");
                if (numberRandom > userInput) {
                    System.out.println("Подсказка: Загаданное число больше твоего");
                }
                if (numberRandom < userInput) {
                    System.out.println("Подсказка: Загаданное число меньше твоего");
                }
                attempts =  attempts - 1;
                System.out.println("Попыток осталось: " + attempts);
            }
            
            if (attempts <= 0) {
                System.out.println("Твои попытки закончились!");
                System.out.print("Хотите завершить игру? 1 - да: ");
                int flag = scanner.nextInt();
                if (flag == 1) {
                    repeat = false;
                } else {
                    attempts = 3;
                }
            }
        }while(repeat);
    }
    
}
