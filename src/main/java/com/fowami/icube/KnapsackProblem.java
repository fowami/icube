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
public class KnapsackProblem {
    /*
    This method returns the max weight
    */
    static int max(int a, int b) 
    { 
        return (a > b)? a : b; 
    }
    
    
    static int knapSack(int maxCapacity, int wi[], int vi[], int n)
    {
        int i, w;
        int [][]K = new int[n+1][maxCapacity+1];
 
        for (i = 0; i <= n; i++)
        {
            for (w = 0; w <= maxCapacity; w++)
            {
                if (i==0 || w==0){
                    K[i][w] = 0;
                }else if (wi[i-1] <= w){
                    K[i][w] = max(vi[i-1] + K[i-1][w-wi[i-1]],  K[i-1][w]);
                }else{
                    K[i][w] = K[i-1][w];
                }
            }
        }
 
        return K[n][maxCapacity];
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int size = sc.nextInt();
        System.out.println("Enter the items weights: ");
        int []weight = new int[size];
        for(int i=0; i<size; i++)
            weight[i] = sc.nextInt();
 
        System.out.println("Enter the items values: ");
        int []value = new int[size];
        for(int i=0; i<size; i++)
            value[i] = sc.nextInt();
 
        System.out.println("Enter the maximum capacity: ");
        int maxWeight = sc.nextInt();
 
        System.out.println("The maximum value that can be put in a knapsack of capacity Weight is: " + knapSack(maxWeight, weight, value, size));
        sc.close();
    }
    
}
