/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.project;
import java.util.Scanner;

/**
 *
 * @author kpal
 */
public class dataAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("# of Integers?: ");
        int iNum = Integer.valueOf(sc.nextLine());
        int[] numbers = new int[iNum];
        for (int i =0 ; i<iNum ;i++ ) {
            System.out.print("Enter Integer "+(i+1)+": ");
            numbers[i]=sc.nextInt();
        }
        
        //Calculate Mean
        int sum=0;
        int big=numbers[0];
        int small=numbers[0];
        for (int j : numbers){
            sum += j;
            if (big < j)
                big = j;
            if (small > j)
                small = j;
        }
        System.out.println("----\nMean of Numbers is: "+(float)(sum/iNum));
        System.out.println("Biggest Numbers is: "+big);
        System.out.println("Smallest Numbers is: "+small);
        
        // 
    }
    
}
