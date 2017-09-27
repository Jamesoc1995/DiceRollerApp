package dicerollerapp;

import java.util.Random;


public class Dice {
                   
    Random rand = new Random();
        int a; //attack roll
        int d; //damage
        int hp = 60; //enemy hp
        int strBonus = 5; //strentgh bonus
        int prof = 2; //proficeny
        int ac = 15; //armor class 
        
        
        
    public void compute(){

        for (int i = 0; i < 50; i++) {
            a = rand.nextInt(20) + 1; //makes random number in the loop. making a new number every loop
            if (a == 20) {
                System.out.println("NAT 20! CRIT!");              
            } else {
                System.out.println("rolled a " + a + " Total roll is " + (a + strBonus + prof));
            }
            int roll = a + strBonus + prof;
            if (roll >= ac) {
                d = rand.nextInt(10) + 1;
                if (a == 20) {
                    d = d * 2; //double damage
                }

                //HIT
                System.out.println("HIT for " + d + " damage");
                hp = hp - d; //takeaway hp

                if (hp <= 0) {
                    System.out.println("Enemy is killed");
                    System.exit(0);
                }

                System.out.println("Enemy has " + hp);
            } 
            //MISS
            else {
                System.out.println("MISS!");
            }
    }
        
    }
}
