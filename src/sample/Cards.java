/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author 1styrGroupC
 */
import java.util.ArrayList;
import java.util.Collections;

public class Cards {

    ArrayList<String> cards = new ArrayList<String>();
    private final String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public void create() {
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(suit + " of " + rank);
            }
        }
        System.out.println("\nDeck of Cards is Created\n");
    }

    public void shuffle() {
        if (!cards.isEmpty()) {
            Collections.shuffle(cards);
            System.out.println("\nCard Shuffled\n");
        } else {
            System.out.println("\nDeck is Empty!\n");
        }
    }

    public void deal(int num) {
        if (!cards.isEmpty()) {
            if (num < cards.size()) {
                System.out.println("\n");
                for (int i = 0; i < num; i++) {
                    System.out.println(cards.get(0));
                    cards.remove(0);
                }
                System.out.print("\n");
                System.out.println("Remaining Cards: "+cards.size()+"\n");
            }else{
                System.out.println("\nNot enough cards in deck!\n");
            }
        } else {
            System.out.println("\nDeck is Empty!\n");
        }
    }

    public void display() {
        if (!cards.isEmpty()) {
            System.out.print("\n");
            cards.forEach((card) -> {
                System.out.println(card);
            });
            System.out.print("\n");
        } else {
            System.out.println("\nDeck is Empty\n");
        }
    }

}
