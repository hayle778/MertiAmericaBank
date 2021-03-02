// this program is  designed for a user to input his checking and saving account for bank of america.

package com.meritamerica.assignment1;
import java.util.Scanner;

public class MeritAmericaBankApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountHolder holder = new AccountHolder();

        double CheckingAccount = 0;
        holder.getInterestRate(CheckingAccount);

        boolean yes = true;
        while (yes) {
            double firstbalance = 0.0;
            double getBalance = 0.0;  //  make sure the user get double amount
            double getInterestRate = 0.0;  //  make sure the user get double amount
            boolean withdraw = true;
            double deposit = 0.0;
            double futureValue = 0.0;
            //...........................//
            String FirstName = "";
            String MiddleName = "";
            String LastName = "";
            String SSN = "";
            CheckingAccount = 0.0;
            double SavingAccount = 0.0;


            System.out.println("<<<<<<<<<<Welcome to MERIT America Bank   >>>>>>>>>");
            System.out.println("Please enter your first name: ");
            FirstName = input.nextLine();
            System.out.println("Please enter your middle name: ");
            MiddleName = input.nextLine();
            System.out.println("Please enter your last name: ");
            LastName = input.nextLine();
            System.out.println("Please enter your SSN name: ");
            SSN = input.nextLine();

            System.out.println("******How many checking accounts do you have?******* ");
            CheckingAccount = input.nextInt();

            if (CheckingAccount == 1) {                //A
                System.out.println("Lets keep forward ");
                System.out.println("Enter the firstBalance: ");
                firstbalance = input.nextDouble();
                System.out.println("Enter the getBalance: ");
                getBalance = input.nextDouble();
                System.out.println("getInteresteRate:");
                getInterestRate = 0.01;
                System.out.println(getInterestRate);
                System.out.println("do you need a withdraw true/false");
                boolean withDraw = true;

                if (withDraw == true) {
                    System.out.println(withDraw);
                } else {
                    System.out.println("no withdraw");
                }
                System.out.println("Enter the deposit");
                deposit = input.nextDouble();
                double totalCurrent = 0.0;
                totalCurrent = deposit + getBalance;
                System.out.println(totalCurrent);

                System.out.println("add number of years to know your future account : n =");
                int n = input.nextInt();
                futureValue = totalCurrent * (Math.pow(1 + 0.01, n));
                System.out.println("future value");
                System.out.println(futureValue);
                //   holder.getInterestRate(getInterestRate);
                System.out.println(getInterestRate);
                if (firstbalance > 0) {   //1
                    // System.out.println(" What can I help you today? ");
                    String help = input.nextLine();
                } else {                                                          //this is or the first if to close the statment:
                    System.out.println("Go to your saving account: ");
                }
            } else {
                System.out.println("no more than one");           //B
                //  break;
            }

            System.out.println("******How many saving accounts do you have?******* ");
            SavingAccount = input.nextInt();
            //boolean x = true;
            //while(x) {
            if (SavingAccount == 1) {                //A
                System.out.println("Lets keep forward! ");
                System.out.println("Enter the firstBalance: ");
                firstbalance = input.nextDouble();
                System.out.println("Enter the getBalance: ");
                getBalance = input.nextDouble();
                System.out.println("getInteresteRate:");
                getInterestRate = 1;
                System.out.println(getInterestRate);
                System.out.println("do you need a withdraw true/false");
                boolean withDraw = true;
                if (withDraw == true) {

                    System.out.println(withDraw);
                } else {
                    System.out.println("no withdraw");
                }
                System.out.println("Enter the deposit");
                deposit = input.nextDouble();

                System.out.println("Total current: ");
                double totalCurrent = 0.0;

                totalCurrent = deposit + getBalance;
                System.out.println("Total current" + totalCurrent);

                System.out.println("number of years n");
                int n = input.nextInt();
                futureValue = totalCurrent * (Math.pow(1 + 1, n));
                System.out.println("future value=");
                System.out.println(futureValue);
                //   holder.getInterestRate(getInterestRate);
                // System.out.println(getInterestRate);
                if (firstbalance > 0) {   //1
                    // System.out.println(" What can I help you today? ");
                    String help = input.nextLine();
                } else {                                                          //this is or the first if to close the statment:
                    System.out.println("Go to your saving account: ");
                }
            } else {
                System.out.println("no more than one");           //B
                //  break;
            }
/*System.out.println("Do you want to start from the beggining?");
Boolean  again = yes;

          if (again ==  yes ){
    System.out.println("ok!");
}
          else {

      }*/System.out.println("------------------------------------------------------------------");
        }
     //   System.out.println(yes);
    }

 //String gomen ;



}
