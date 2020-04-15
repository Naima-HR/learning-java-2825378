

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        String Q = "What is the capital of Algeria?";
        String RA1 = "algiers";
        String A2 = "oran";
        String A3 = "telemcan";
        boolean badA= true;
        while (badA)
        {
      
           System.out.println(Q);
           System.out.println(RA1);
           System.out.println(A2);
           System.out.println(A3);
           Scanner sc = new Scanner(System.in);
           String A = sc.next();
           if (RA1.equals(A.toLowerCase()))
           {
               System.out.println("Congratulations +1");
               badA= false;
              
           }  else
           {
               System.out.println("Opps!! you are wrong \nTry again ^^");
           } 
           
       
        }
        
    }
    
}
