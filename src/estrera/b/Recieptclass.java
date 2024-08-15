

package estrera.b;
import java.util.Scanner;

public class Receiptc {
    public  void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter Customer Name:");
        String customerName = input.nextLine();
        System.out.println("Enter Product Name:");
        String productName = input.nextLine();
        System.out.println("Enter Quantity:");
        int quantity = input.nextInt();
        System.out.println("Enter Price per Unit:");
        double price = input.nextDouble();
        System.out.println("Enter Cash Amount:");
        double cash = input.nextDouble();

       
        double total = quantity * price;
        double change = cash - total;

        
        System.out.println("---------------------");
        System.out.println("RECEIPT");
        System.out.println("---------------------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
        System.out.println("Cash: $" + cash);
        System.out.println("---------------------");
        System.out.println("Total: $" + total);
        System.out.println("Change: $" + change);
        System.out.println("---------------------");
        System.out.println("Thank You!");
    }

    
    
}
