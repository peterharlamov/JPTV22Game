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
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        int attempts = 3;
        System.out.println("-----Game-----");

        Random rand = new Random();
        int averange = 11;
        int userInput = 0;
        int numberRandom = rand.nextInt(averange);
        int coins = 10;
        do {
            if (numberRandom == 0) {
                numberRandom = rand.nextInt(averange);
            }
            System.out.println(numberRandom);
            System.out.print("Угадай число от 0 до 10: ");
            do {
                try {
                    userInput = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.print("Недопустимый ввод, попробуй еще раз: ");
                    scanner.nextLine();
                }
            } while (true);

            if (userInput == numberRandom) {
                System.out.println("Ты угадал!");
                numberRandom = rand.nextInt(averange);
                coins++;
            } else {
                if (numberRandom > userInput) {
                    System.out.println("Загаданное число больше твоего");
                    coins--;
                }
                if (numberRandom < userInput) {
                    System.out.println("Загаданное число меньше твоего");
                    coins--;
                }
                attempts = attempts - 1;
                if (coins < 0) {
                    coins = 0;
                }
                System.out.println("Попыток осталось: " + attempts);
                System.out.println("Твой баланс монет: " + coins);
            }

            if (attempts <= 0) {
                System.out.println("Твои попытки закончились! Было задуманно число: " + numberRandom);
                numberRandom = rand.nextInt(averange);
                System.out.print("Хотите завершить игру? 1 - да: ");
                int flag = scanner.nextInt();
                if (flag == 1) {
                    repeat = false;
                } else {
                    attempts = 3;
                }
            }
        } while (repeat);
    }
}