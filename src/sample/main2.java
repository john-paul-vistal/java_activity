/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.Scanner;

/**
 *
 * @author 1styrGroupC
 */
public class main2 {

    public static void main(String[] args) {
        Cards card = new Cards();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("What do you want to do?");
            System.out.println("\n  1 - Create\n  2 - Shuffle\n  3 - Deal\n  4 - Dispaly");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    card.create();
                    break;
                case 2:
                    card.shuffle();
                    break;
                case 3:
                    System.out.print("How many cards do you want?: ");
                    int num = scan.nextInt();
                    card.deal(num);
                    break;
                case 4:
                    card.display();
                    break;
                default:
                    System.out.println("\nInvalid Action! Try again!\n");
                    break;
            }

        }
    }

}
