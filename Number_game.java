package org.example;

import java.text.Format;
import java.util.Scanner;

class range{
      public int generate (int max,int min){
          return (int) (Math.random()*(max-min+1)+min);
      }
  }
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Number_game{
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      range rg = new range();
      int TA=0;
      int win=0;
      while(true){
          System.out.println("Enter Minimum number:");
          int min = scan.nextInt();
          System.out.println("Enter Maximum number:");
          int max = scan.nextInt();
          scan.nextLine();
          int c = rg.generate(max,min);
          int A=0;
          while(true){
              System.out.println("guess a number between "+min+" and "+max+" ");
              int g = scan.nextInt();
              A++;
              if (g>c){
                  System.out.println("Its Greater ");
              }
              else if (g<c){
                  System.out.println("Its Lower");
              }
              else{
                  System.out.println("Correct answer!!!!!!!!!!!");
                  win++;
                  break;
              }
          }
          TA =TA+A;
          System.out.println("Attempt+"+A);
          System.out.println("wins+"+win);
          double winrate = (double) win/TA*100;
          System.out.printf("your winrate is %.2f%%/n",winrate);
          System.out.println("Do you want to play again (Y/n)");String PA = scan.nextLine();
          if(!PA.equalsIgnoreCase("y")){
              scan.close();
              System.exit(0);
          } scan.nextLine();
      }
    }
  }