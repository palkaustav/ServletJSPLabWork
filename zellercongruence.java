package com.training.project;
import java.util.Scanner;
/**
 *
 * @author kpal
 */
public class zellercongruence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String response;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Year(YYYY) / 'quit' to exit : ");
            response = sc.nextLine();
       //     System.out.print(response);
            if (response.equalsIgnoreCase("quit")) {
                System.out.println("Thank you.");
            }
            else {
          //      System.out.print("Moving on..");
                int year = Integer.valueOf(response);
                System.out.print("Month(1-12) : ");
                int mon = Integer.valueOf(sc.nextLine());
                int m;
                switch(mon){
                    case 1:
                        m=13;
                        year--;
                        break;
                    case 2:
                        m=14;
                        year--;
                        break;
                    default:
                        m=mon;
                        break;
                }
                int K=year%100;
                int J=(year-K)/100;

                System.out.print("Day (1-31) : ");
                int q = Integer.valueOf(sc.nextLine());

                int h = (int) ( q + (int)(13*(m+1)/5) + K + (int)(K/4) + (int)(J/4) - (2*J) ) % 7;

                String[] day = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
                System.out.println("Day of the week is : "+day[h]);
            }
        }
        while (!response.equalsIgnoreCase("quit"));
    }
    
}
