
package estrera.b;

import java.util.Scanner;
public class EstreraB {

    public static void main(String[] args) {
       
       Scanner input = new  Scanner(System.in);
               
               String fname;
               
         int  byear;
        System.out.println("Enter your name:");
        fname =input.nextLine();
        System.out.println("Enter birthyear:");        
        byear =input.nextInt();        
        System.out.println("HeLLo" + fname+"\nYour age is "+(2024-byear));
        
      
                
  }
    
}
