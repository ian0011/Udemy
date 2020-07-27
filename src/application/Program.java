package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001, "alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1003, "Jorge", 1500.0, 0.01));
        list.add(new BusinessAccount(1005, "Marcos", 1500.0, 500.0));

        double soma = 0.0;
        for (Account acc : list) {
            soma += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", soma);

        for (Account acc : list) {
            acc.deposit(10.0);
        }
        for (Account acc : list){
            System.out.println(acc.getBalance());
        }
    }
}
