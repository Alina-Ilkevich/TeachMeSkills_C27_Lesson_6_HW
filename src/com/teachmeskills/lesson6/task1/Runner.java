package com.teachmeskills.lesson6.task1;
public class Runner {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(123, 150.20);
        CreditCard card2 = new CreditCard(456, 270.70);
        CreditCard card3 = new CreditCard(789, 540.35);
        card1.increaseAmount(20.70);
        card2.increaseAmount(140.58);
        card3.reduceAmount(540.70);
        card1.info();
        card2.info();
        card3.info();
    }
}