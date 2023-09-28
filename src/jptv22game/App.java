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
        do {
            System.out.println("-----Game-----");
            Random rand = new Random();
            int upperbound = 11;
            int numberRandom = rand.nextInt(upperbound);
            System.out.print("Угадай число от 0 до 10: "); 
            int userInput = scanner.nextInt(); scanner.nextLine();
        
            if (userInput == numberRandom) {
                System.out.println("Ты угадал!");
            } else {
                System.out.println("Ты проиграл!");
                
            }
            
            System.out.print("Желаете продолжить? 1 - да, 0 - нет: ");
            int flag = scanner.nextInt();
            if (flag == 1) {
                repeat = true;
            } else {
                repeat = false;
            }
        }while(repeat);
    }
    
}
