import java.util.*;
import java.io.*;

public class Banking {
    int AccNo;
    String Name;
    float Amount;
    // constructor
     Banking() {
        System.out.println("Welcome to Banking!");
        System.out.println();
    }
    public static void menu(){
        System.out.println("1. Open New Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. WithDraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. EXIT ❌");
    };
    // Set up Details
    void setDetails(int no,String name, float amt){
        AccNo = no;
        Name = name;
        Amount = amt;
        System.out.println("Congratulations "+ name+" your Account has been created");
    }
    // Deposit Balance
    void deposit(float amt){
        Amount += amt;
        System.out.println("Amount Deposited");
    }
    // WithDraw Amount
    void withDraw(float amt){
        if(Amount < amt) {
            System.out.println("Insufficient Balance");
        }else{
            Amount -= amt;
            System.out.println("Amount Withdrawl Successfull");
        }
    }
    // CheckBalance
    public void checkBalance(){
        System.out.println("Balance : " + Amount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banking a1 = new Banking();

        while(true) {
            menu();
            System.out.println();
            System.out.println("Enter Number : ");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter ITS Number");
                    int no = sc.nextInt();
                    System.out.println("Enter your Full Name");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Please Deposit Minimum amount for opening an Account");
                    float amt = sc.nextInt();
                    while(amt<1000){
                        System.out.println("Please Deposit Minimum ₹1000/- or More to Open New Account.");
                        amt = sc.nextInt();
                    }
                    a1.setDetails(no, name, amt);

                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter the Amount you want to Deposit :");
                    float dep = sc.nextInt();
                    a1.deposit(dep);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter the Amount you want to WithDraw :");
                    int withDraw = sc.nextInt();
                    a1.withDraw(withDraw);
                    System.out.println();
                    break;

                case 4:
                    a1.checkBalance();
                    System.out.println();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Number Please Enter the Correct Choice");
                    System.out.println();
            }
        }
    }
}
