/*
 * The new "Avengers" movie has just been released! There are a lot of people at
 * the cinema box office standing in a huge line. Each of them has a single 100,
 * 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.
 * 
 * Vasya is currently working as a clerk. He wants to sell a ticket to every
 * single person in this line.
 * 
 * Can Vasya sell a ticket to every person and give change if he initially has
 * no money and sells the tickets strictly in the order people queue?
 * 
 * Return YES, if Vasya can sell a ticket to every person and give change with
 * the bills he has at hand at that moment. Otherwise return NO.
 */

public class Line {
    public static String Tickets(int[] peopleInLine){
        int bill25 = 0, bill50 = 0;
        for (int payment : peopleInLine){
            if(payment == 25){
                bill25++;
            } else if(payment == 50){
                bill25--;
                bill50++;
            } else if(payment == 100){
                if(bill50 > 0){
                    bill50--;
                    bill25--;
                } else {
                    bill25-=3;
                }
            }
            if(bill25<0 || bill50 <0){
                return "NO";
            }
        }
        return "YES";
    }
}
