package application;

import entities.Shape;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.enums.Color;
import entities.Rectangle;
import entities.Circle;


public class Program{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Shape> list = new ArrayList<>(); 
        
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            System.out.println("Shape #" + i + "data:");
            System.out.print("Rectangle or Cicle (r/c)?");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED: ");
            Color color = Color.valueOf(sc.next());
            if(ch == 'r'){
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(width, height, color));
            }else{
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(radius, color));
            }
        }
        
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : list){
            System.out.println(shape.area());
        }
        
        sc.close();
    }
}