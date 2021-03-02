package com.meritamerica.assignment1;

public class CheckingAccount extends AccountHolder {
    // put the instance variable to our class. It help us to know what the account need to include
    private double firstBalance;
    private double getBalance;   //  make sure the user get double amount
    private double  getInterestRate;   //  make sure the user get double amount
    private boolean withdraw;
    private double deposit;
    private double futureValue;   //  make sure the user to have an input for  int years


    public void CheckingAccount (){
        //super();
    }

    public CheckingAccount (double firstBalance, double getBalance, double getInterestRate, boolean withdraw  , double deposit, double futureValue  ) {
        this.firstBalance = firstBalance;
        this.getBalance=getBalance;
        this.getInterestRate = getInterestRate;
        this.withdraw = withdraw;
        this.deposit = deposit;
        this.futureValue = futureValue;
    }
    public void setFutureValue(double futureValue) {
        this.futureValue = futureValue;
    }  public double getFirstbalance() {
        return firstBalance;
    }

    public void setFirstbalance(double Firstbalance) {
        this.firstBalance = firstBalance;

    }

    public double getGetBalance() {
        return getBalance;

    }

    public void setGetBalance(double getBalance) {
        this.getBalance = getBalance;
    }

    public double getInterestRate() {
        double getInterestRate = 0.01* firstBalance;
        return getInterestRate;
    }

    public void setGetInterestRate(double getInterestRate) {
        this.getInterestRate = getInterestRate;
    }

    public boolean isWithdraw() {
        return withdraw;
    }

    public void setWithdraw(boolean withdraw) {
        this.withdraw = withdraw;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getFutureValue() {
        return futureValue;
    }
    public void setFutureValue() {
        this.futureValue=firstBalance;
    }
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "firstBalance=" + firstBalance +
                ", getBalance=" + getBalance +
                ", getInterestRate=" + getInterestRate +
                ", withdraw=" + withdraw +
                ", deposit=" + deposit +
                ", futureValue=" + futureValue +
                '}';
    }

}