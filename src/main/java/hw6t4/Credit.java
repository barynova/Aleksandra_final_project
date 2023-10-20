package hw6t4;

import java.math.BigDecimal;

public class Credit {
    public String accountNumber;
    public BigDecimal body;
    private double percentage;
    public int period;

    // Конструктор
    public Credit(String accountNumber, BigDecimal body, double percentage, String period) {
        this.accountNumber = accountNumber;
        this.body = body;
        this.percentage = percentage;
        this.period = 6;
    }

    // Геттер accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Сеттер accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    // Геттер period
    public int getPeriod() {
        return period;
    }

    // Сеттер period
    public void setPeriod(int period) {
        this.period = period;
    }

    // Метод щоб показати аккаунт інфо
    public void displayAccountInfo() {
        System.out.println("Account Number is: " + accountNumber);
        System.out.println("Body of credit is: " + body);
        System.out.println("Percentage of credit: " + percentage + "%");
    }

    // Метод щоб розрахувати ставку в місяць
    public double calculatePercentage(double months) {
        if (months > 0) {
            double monthlyPercentage = percentage / 12.0;
            return monthlyPercentage;
        } else {
            System.out.println("Percentage is 0.0");
            return 0.0;
        }

    }

    public double calculatePayment(int months) {
        if (months > 0) {
            double monthlyPercentage = percentage / 12.0 / 100.0;
            double monthlyPayment = body.doubleValue() * (monthlyPercentage / (1 - Math.pow(1 + monthlyPercentage, -months)));
            return monthlyPayment;
        } else {
            System.out.println("Invalid number of months.");
            return 0.0;
        }
    }


    public static void totalResult(String[] args) {
        Credit creditAccount = new Credit("22111990", new BigDecimal("100.0"), 20.0, "2 months");
        creditAccount.displayAccountInfo();

        double monthlyPercentage = creditAccount.calculatePercentage(2);
        System.out.println("Monthly Percentage for 2 months: " + monthlyPercentage + "%");

        double monthlyPayment = creditAccount.calculatePayment(2);
        System.out.println("Monthly Payment for 2 months: $" + monthlyPayment);
    }
}

