package piggyBank;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<AbstractClass> piggyBank = new ArrayList<AbstractClass>();

        piggyBank.add(new Quarter(1));

        piggyBank.add(new Dime(1));

        piggyBank.add(new Dollar(5));

        piggyBank.add(new Nickel(3));

        piggyBank.add(new Dime(7));

        piggyBank.add(new Dollar(1));

        piggyBank.add(new Penny(10));




        for (AbstractClass a : piggyBank) {
           if(a.getQuant() == 1){
               System.out.println(a);
           } else {
            System.out.println(a + "s");
           }
        }


        double total = 0.00;    
    
        for (AbstractClass a : piggyBank){
           total = total + a.getWorth() * a.getQuant();

        }

        System.out.println("total amount in piggy bank: $" + total + 0);

        
    }
}
