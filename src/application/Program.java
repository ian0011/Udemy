package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args)  {
        Account acc = new Account(1001,"Ian",0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Victor", 0.0, 500.0);
        
        
        //UPCASTING
        
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"João", 0.0,0.01);
       
        
        //DOWNCASTING nem sempre vai dá certo, o compilador só vai avisar quando executar
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);
        
        //BusinessAccount acc5 = (BusinessAccount) acc3;
        
        if(acc2 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc2;
            acc5.loan(200.0);
            System.out.println("Empréstimo");
        }
        if(acc2 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc2;
            acc5.updateBalance();
            System.out.println("atualizado");
        }
        
        
    }
}
