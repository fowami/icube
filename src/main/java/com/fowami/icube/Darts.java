/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fowami.icube;

import java.util.Scanner;

/**
 *
 * @author fowami
 */
public class Darts {
    
   static int scores(int x,int y){
        double distance;
        int scores =0;
        
        distance=Math.sqrt(x*x+y*y);
        
        if(distance<=1){
          scores=  10;
        }else if(distance<=5){
          scores=5;
         }else if(distance<=10){
            scores=1;     
          }
        return scores;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X ");
        int x= sc.nextInt();
         System.out.println("Enter Y ");
         
         int y = sc.nextInt();
       System.out.println("You have Scored: "+scores(x,y));
    }
}
