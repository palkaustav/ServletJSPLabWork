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
public class ConvertTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit Temparature:");
        String line = sc.nextLine();
        double f = Double.valueOf(line);
        float c = (float) (5*(f-32)/9);
        System.out.println("Celcius Temparature is "  +c);
    }
    
}
