package hw3t3;
import java.util.Arrays;


//Задача3 - перероблена з методами
//На вхід програми подається номер місяця(1-12), вартість години та вісоток податку.
//Розрахувати зарплатню за місяць з та без податку.
//Враховувати, що:
//будь-який місяць розпочинається з понеділка
//2 останні дні тижня це вихідні
//один робочий день це 8 годин.
public class Main {
    public static void main(String[] args) {
        // Визначаємо і подаємо номери місяців - створили массив місяців
        int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        // Порахували скільки робочих днів в місяцях і створили масив з днями (тут би об єднати краще ці масиви,
        // треба щоб Ви пояснили на наступному уроці ще раз, запишу собі)
        int[] workDays = {23, 20, 23, 22, 23, 22, 22, 23, 22, 23, 22, 22};
        //Визначили вартість години
        double hourCost = Double.parseDouble(args[0]);
        //Визначили податок
        double tax = Double.parseDouble(args[1]);
        //Визначили кількість робочих годин в дні
        int workHours = Integer.parseInt(args[2]);
        //Визначили місяць
        int monthNov = month[11] = Integer.parseInt(args[3]);
        // Виводимо номер місяця(1-12), вартість години та вісоток податку.
        System.out.println(Arrays.toString(month) + " -> передік номерів місяців");
        System.out.println(hourCost + " долларів за годину");
        System.out.println(tax + " % податку");

        //Розраховуємо зарплату на місяць без податку (для 11 місяця Листопада хай буде) метод1
        int daysNov = workDays[10];
        double salaryWithoutTax = calculateSalaryWithoutTax(daysNov, workHours, hourCost);
        System.out.println("Зарплата за Листопад, " + monthNov+ " місяць, без урахування податку = " + salaryWithoutTax);


        //Розраховуємо зарплату на місяць з податком (для 11 місяця Листопада також)метод2
        double salaryWithTax = calculateSalaryWithTax(salaryWithoutTax, tax);
        System.out.println("Зарплата за Листопад, " + monthNov+ " місяць, з урахуванням податку = " + salaryWithTax);
    }

    public static double calculateSalaryWithoutTax(int days, int workHours, double hourCost) {
        return days * workHours * hourCost;
    }

    public static double calculateSalaryWithTax(double salaryWithoutTax, double taxPercentage) {
        return salaryWithoutTax - (salaryWithoutTax * taxPercentage / 100);
    }}







