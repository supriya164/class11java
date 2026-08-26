import java.util.Scanner;

class Account {
      double balance;

      void deposit(double amount){
       if (amount >  0){
          
        balance = balance + amount;
      System.out.println("amount deposited successfully");


       }else{
        System.out.println("invalid deposit amount");
       }
      
      }
        void withdraw (double amount ){
        if (amount <=0){
          System.out.println("invalid withdrawn"  + amount);
        }
        else if (amount > balance){
      System.out.println("insufficient balance");

        } else{
          balance = balance-amount;
          System.out.println("amount withdrawn successfully");
        }
    }

      void displayBalance(){
        System.out.println("current Balance: Rs." +balance);
      }
  }
    public class Question{
    public static void main(String[] args){


    Scanner input = new Scanner(System.in);
    Account account = new Account();

    System.out.print("enter deposit amount: ");
    double depositAmount = input.nextDouble();

    account.deposit(depositAmount);
    account.displayBalance();

    System.out.print("enter withdrawl amount: ");
    double withdrawAmount = input.nextDouble();

    account.withdraw(withdrawAmount);
    account.displayBalance();

    }
}