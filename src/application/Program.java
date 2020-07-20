
package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Program {
   
    public static void main(String[] args) throws ParseException{
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Entre com o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Insira dados do trabalhador:");
        System.out.print("Nome:");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Cargo:");
        String cargoTrabalhador = sc.nextLine();
        System.out.print("Salário Base:");
        double salarioTrabalhador = sc.nextDouble();
        
        Worker worker = new Worker (nomeTrabalhador, WorkerLevel.valueOf(cargoTrabalhador), salarioTrabalhador,new Department(nomeDepartamento));
        
        System.out.print("Quantos contratos o trabalhador tem?");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println("Entre com o contrato #"+ i + " data:");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora:");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração em horas");
            int hours = sc.nextInt();
            HourContract contrato = new HourContract(dataContrato,valorPorHora,hours);
            worker.addContract(contrato);
        }
        
        System.out.println();
        System.out.print("Entre com o mês e o ano (MM/YY): ");
        String mes_Ano = sc.next();
        int mes = Integer.parseInt(mes_Ano.substring(0,2));
        int ano = Integer.parseInt(mes_Ano.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Renda " + mes_Ano + ": " + String.format("%.2f", worker.income(mes, ano)));
        
        sc.close();
    }
}
