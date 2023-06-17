package com.hw.maxim;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        int goal = 2459000;
        int monthSum = 15000;
        int monthCount = 1;
        int sum = monthSum;

        while (sum < goal) {
            System.out.println("Месяц " + monthCount + " сумма накоплений равна " + sum + " рублей");
            sum += monthSum;
            monthCount++;
        }

        System.out.println("Итоговая сумма: " + sum + ". Потребовалось месяцев: " + monthCount);
    }

    public static void task2() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
    }

    public static void task3() {
        int population = 12000000;
        int birth = 17;
        int dead = 8;
        int yearCount = 10;

        int year = 0;

        while (year < yearCount) {
            population += (population / 1000) * (birth - dead);
            year++;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        int goal = 12000000;
        double sum = 15000.00;
        int monthPercent = 7;

        int monthCount = 0;

        while (sum <= goal) {
            sum += sum * monthPercent / 100;
            monthCount++;
            System.out.printf("Месяц %s сумма накоплений равна %.2f%n", monthCount, sum);
        }

        System.out.printf("Итоговая сумма: %.2f. Потребовалось месяцев: %s%n", sum, monthCount);
    }

    public static void task5() {
        int goal = 12000000;
        double sum = 15000.00;
        int monthPercent = 7;

        int monthCount = 0;

        while (sum <= goal) {
            sum += sum * monthPercent / 100;
            monthCount++;
            if (monthCount % 6 == 0) {
                System.out.printf("Месяц %s сумма накоплений равна %.2f%n", monthCount, sum);
            }
        }

        System.out.printf("Итоговая сумма: %.2f. Потребовалось месяцев: %s%n", sum, monthCount);
    }

    public static void task6() {
        double sum = 15000.00;
        int monthPercent = 7;
        int yearCount = 9;

        int monthCount = 0;

        while (monthCount < yearCount * 12) {
            sum += sum * monthPercent / 100;
            monthCount++;
            if (monthCount % 6 == 0) {
                System.out.printf("Месяц %s сумма накоплений равна %.2f%n", monthCount, sum);
            }

            System.out.printf("Итоговая сумма: %.2f. Потребовалось месяцев: %s%n", sum, monthCount);
        }
    }

    public static void task7() {
        int fridayCount = 1;
        int dayInMonth = 31;

        while (fridayCount <= dayInMonth) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет%n", fridayCount);
            fridayCount += 7;
        }
    }

    public static void task8() {
        int currentYear = 2023;
        int yearsBefore = 200;
        int yearsAfter = 100;
        int cometPeriod = 79;

        for (int i = 0; i < currentYear + yearsAfter; i += cometPeriod) {
            if (i > currentYear - yearsBefore) {
                System.out.println(i);
            }
        }
    }
}
