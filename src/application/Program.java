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
        System.out.println("");
        System.out.println("Product data: " + product.toString());
        System.out.println("");
        System.out.println("Entre com a quantidade produstos a serem adicionados ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("");
        System.out.println("Updated data: " + product.toString());

        System.out.println("");
        System.out.println("Entre com a quantidade produstos a serem removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("");
        System.out.println("Product data: " + product.toString());

        sc.close();

    }
}
