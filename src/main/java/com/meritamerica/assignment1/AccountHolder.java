package com.meritamerica.assignment1;

  public class AccountHolder  {
      private String FirstName ;
       private String MiddleName ;
       private String LastName ;
       private String  SSN;
       private double CheckingAccount;
       private double SavingAccount;

      private double firstBalance;
      private double getBalance;   //  make sure the user get double amount
      double  getInterestRate;   //  make sure the user get double amount
      private boolean withdraw;
      private double deposit;
      private double futureValue;   //  make sure the user to have an input for  int years



      public AccountHolder(      ){

       }
      public AccountHolder(String FirstName, String MiddleName, String LastName, String  SSN, double CheckingAccount, double SavingAccount){
          this.FirstName=FirstName;
          this.MiddleName = MiddleName;
          this.LastName = LastName;
          this.SSN = SSN;
          this.CheckingAccount = CheckingAccount;
          this.SavingAccount = SavingAccount;
      }
      public String getFirstName() {
          return FirstName;
      }

      public void setFirstName(String firstName) {
          FirstName = firstName;
      }

      public String getMiddleName() {
          return MiddleName;
      }

      public void setMiddleName(String middleName) {
          MiddleName = middleName;
      }

      public String getLastName() {
          return LastName;
      }

      public void setLastName(String lastName) {
          LastName = lastName;
      }

      public String getSSN() {
          return SSN;
      }

      public void setSSN(String SSN) {
          this.SSN = SSN;
      }

      public double getCheckingAccount() {
          return CheckingAccount;
      }

      public void setCheckingAccount(double checkingAccount) {
          CheckingAccount = checkingAccount;
      }

      public double getSavingAccount() {
          return SavingAccount;
      }

      public void setSavingAccount(double savingAccount) {
          SavingAccount = savingAccount;
      }


      @Override
      public String toString() {
          return "AccountHolder{" +
                  "FirstName='" + FirstName + '\'' +
                  ", MiddleName='" + MiddleName + '\'' +
                  ", LastName='" + LastName + '\'' +
                  ", SSN=" + SSN +
                  ", CheckingAccount=" + CheckingAccount +
                  ", SavingAccount=" + SavingAccount +
                  '}';
      }


      public void getInterestRate(double getInterestRate) {
      }
  }


