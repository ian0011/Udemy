package application;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        //Instanciando o Java Scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //aqui ficavam as variáveis  an
        Triangle x,y;
        //instanciando o objeto
        x = new Triangle();
        y = new Triangle();
         

        System.out.println("Digite as medidas do triângulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite as medidas do triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        //chamada do metodo
        double areaX = x.area();
        
        //chamada do metodo
        double areaY = y.area();
        System.out.printf("Triângulo x area: %.4f%n", areaX);
        System.out.printf("Triângulo y area: %.4f%n", areaY);
        
        if(areaX > areaY){
            System.out.println("Area largura: X");
        }else{
            System.out.println("Area largura: Y");
        }
       
        sc.close();
        
    }
}
