/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luckysevens;

/**
 *
 * @author kmlnd
 */

import java.util.Random;
import java.util.Scanner;
public class LuckySevens {
    public static void main(String[] args) {
        System.out.println("WELCOME to Lucky Sevens");
        System.out.println("How much cash yah got to play huh?");
        System.out.println("*Input how many dollars*");
        
        Scanner moneyAmount = new Scanner(System.in);
        int dollars = moneyAmount.nextInt();
        
        System.out.println("Alright lets play!!");
        
        int rollCount = 0;
        int maxMoney = 0;
  
  
        do{
            int diceRoll = dice();
            int secondDiceRoll = dice();
            
            int resultRolls = diceRoll + secondDiceRoll;
            
            if(resultRolls == 7){
                dollars+=4;
                rollCount++;
                maxMoney++;

            }else{
                dollars--;
                rollCount++;
            }
            
            
        }while(dollars > 0);
        
        System.out.println("Wow you are broke after " + rollCount + " rolls");
        System.out.println("The highest amount of money you made was $" + maxMoney + " before being broke");
      
    }
    
    public static int dice(){
        Random randomizer = new Random();
        int dice = randomizer.nextInt(7)+ 1;
        return dice;
    }
}
