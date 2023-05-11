package com.gt;

import java.util.ArrayList;
import java.util.Collections;

public class CardsApp {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Hand hand1 = new Hand();

        for(int i=0;i<5;i++){
            Card card = deck.deal();
            hand1.deal(card);
        }
        int handValue = hand1.getValue();
        System.out.println(handValue);
    }
}

class Card{
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        if(isFaceUp){
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue() {
        if(isFaceUp){
            return value;
        } else {
            return "#";
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public int getPointValue(){
        if(isFaceUp){
            if(this.value.equals("A")){
                return 11;
            } else if(
                this.value.equals("K") ||
                this.value.equals("Q") ||
                this.value.equals("J")
            ){
                return 10;
            } else {
                return Integer.parseInt(this.value);
            }
            // determine point value and return it
            // A = 11
            // K, Q, J = 10
            // all numeric cards are equal to their face value
        } else {
            return 0;
        }
    }

    public void flip(){
        this.isFaceUp = !this.isFaceUp;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", value='" + value + '\'' +
                ", isFaceUp=" + isFaceUp +
                '}';
    }
}

class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void deal(Card card){
        cards.add(card);
    }

    public int getSize(){
        return this.cards.size();
    }

    public int getValue(){
        int value = 0;

        for(Card card: cards){
            card.flip();
            value += card.getPointValue();
            card.flip();
        }

        return value;
    }
}

class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
        String[] suits = {"Hearts","Spades","Diamonds","Clubs"};
        String[] values = {"2","3","4","5","6","7","8",
                "9","10","J","Q","K","A"};

        for(String suit: suits){ // "Hearts","Spades","Diamonds","Clubs"
            for(String value: values){
                this.cards.add(new Card(suit, value));
            }
        }

    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }
    public Card deal(){
        if(this.cards.size() > 0){
            Card card = this.cards.remove(0);
            return card;
        } else {
            return null;
        }
    }
    public int getSize(){
        return this.cards.size();
    }

}