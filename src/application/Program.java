package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        //Instanciando o Java Scanner
        Scanner sc = new Scanner(System.in);
        //aqui ficavam as variáveis  an
        
        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.println("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.println(product.name + ", " + product.price + "," + product.quantity);
        
        
        
        
        sc.close();
        
    }
}
