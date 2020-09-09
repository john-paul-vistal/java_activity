/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author 1styrGroupC
 */
public class Card {

    private int remainingCards = 52;
    private final int[] deck = new int[52];
    private final String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    private final String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private Boolean created = false;
    int count = 0;

    public void create() {
        count = 0;
        remainingCards = 52;
        for (int i = 0; i < 52; i++) {
            deck[i] = i;
        }
        created = true;
        System.out.println("\nDeck of Cards Created!\n");
    }

    public void shuffle() {
        if (created == false) {
            System.out.println("\nDeck is Empty!\n");
        } else {
            for (int i = 0; i < deck.length; i++) {
                int index = (int) (Math.random() * deck.length);
                int temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }
            System.out.println("\nCards Shuffled!\n");
        }
    }

    public void deal(int numCards) {
        if (created == false) {
            System.out.println("\nDeck is Empty!\n");
        } else {
            if (numCards > remainingCards) {
                if(remainingCards == 0){
                    System.out.println("\nDeck is Empty!\n");
                }else{
                System.out.println("\nCard in Deck is lesser than you want!\n");
                }
            } else {
                System.out.print("\n");
                int numberOfCards = numCards + count;
                for (int i = count; i < numberOfCards; i++) {
                    String suit = suits[deck[i] / 13];
                    String rank = ranks[deck[i] % 13];
                    System.out.println(rank + " of " + suit);
                    count++;
                    remainingCards--;
                }
                System.out.println("\nRemaining Cards: " + remainingCards+"\n");
            }
        }
    }
    
//This is to display all cards including the cards that has been dealed
//    public void display() {
//        if (created == false) {
//            System.out.println("Deck is Empty!");
//        } else {
//            for (int i = 0; i < 52; i++) {
//                String suit = suits[deck[i] / 13];
//                String rank = ranks[deck[i] % 13];
//                System.out.println(rank + " of " + suit);
//            }
//            System.out.println("Number of Cards: " + deck.length);
//        }
//
//    }
    
 
//This is display all cards in deck not included the dealed cards
    public void display() {
        if (created == false) {
            System.out.println("\nDeck is Empty!\n");
        } else {
            if (remainingCards != 0) {
                System.out.print("\n");
                for (int i = count; i < 52; i++) {
                    String suit = suits[deck[i] / 13];
                    String rank = ranks[deck[i] % 13];
                    System.out.println(rank + " of " + suit);
                    remainingCards--;
                }
                System.out.println("\nRemaining Cards: " + remainingCards+"\n");
            }else{
                System.out.println("\nDeck is Empty!\n");
            }
        }

    }
}
