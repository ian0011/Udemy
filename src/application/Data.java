package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data{
    
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        
        Date y1 = sdf1.parse("14/07/2020");
        Date y2 = sdf2.parse("14/07/2020 00:35:10");
        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
    }
    
}