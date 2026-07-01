/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nbala
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public void eatAffordably() {
        double price = 2.60;
        if (this.balance >= price) {
            this.balance -= price;
        }
    }

    public void eatHeartily() {
        double price = 4.60;
        if (this.balance >= price) {
            this.balance -= price;
        }
    }

    public void addMoney(double money) {
        if(money < 0) {return ;}
        if(this.balance + money < 150.0){
            this.balance += money;
        }else{
            this.balance = 150.0;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + (double) balance + " euros";
    }
}
