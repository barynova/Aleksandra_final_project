package hw6t2;

import java.math.BigDecimal;
import java.util.Arrays;
//Описати клас Employee з полями (методи описуєте самостійно):
//- Прізвище
//- Ім'я
//- Посада
//- Заробітня платня за годину

//Створили класс
public class Employee {
    private String lastName;
    private String firstName;
    private String job;
    private double hourCost;
    public SalaryCalculator calculator = new SalaryCalculator();


// Конструктор
private Employee (String lastName, String firstName, String job, double hourCost) {
this.lastName = lastName;
this.firstName = firstName;
this.job = job;
this.hourCost = hourCost;
}
    //Геттер lastName
    public String lastName() {
        return this.lastName;
    }
    //Сеттер lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Геттер firstName
    public String getFirstName(String firstName) {
        return this.firstName;
    }
    //Сеттер firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Геттер job
    public String getJob() {
        return this.job;
    }
    //Сеттер job
    public void setJob(String job) {
        this.job = job;
    }

    // Геттер hourCost
    public double getHourCost(double taxPercentage, int workHours, int month) {
        return calculator.calculateMonthlySalary(this.hourCost, taxPercentage, workHours, month);
    }
    // Сеттер hourCost
    public void setHourCost(double hourCost) {
        this.hourCost = hourCost;
    }

    //Тут я взяла з минулої домашки як визначати зарплату хоча не впевнена що я їх з єднала нормально
    private class SalaryCalculator {
        public double calculateMonthlySalary(double hourCost, double tax, int workHours, int monthNov) {
            int[] workDays = {23, 20, 23, 22, 23, 22, 22, 23, 22, 23, 22, 22};
            int daysForMonth = workDays[monthNov - 1];
            double salaryWithoutTax = calculateSalaryWithoutTax(daysForMonth, workHours, hourCost);
            return calculateSalaryWithTax(salaryWithoutTax, tax);
        }

        private double calculateSalaryWithoutTax(int days, int workHours, double hourCost) {
            return days * workHours * hourCost;
        }

        private double calculateSalaryWithTax(double salaryWithoutTax, double taxPercentage) {
            return salaryWithoutTax - (salaryWithoutTax * taxPercentage / 100);
        }
    }
}
