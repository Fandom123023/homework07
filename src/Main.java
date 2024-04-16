import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("test1");
        double targetAmout = 2_459_000;
        double monthlyContribution = 15_000;
        double savings = 0;
        int month = 1;

        while (savings < targetAmout) {
            savings += monthlyContribution;
            System.out.printf("Месяц %d: сумма накопления ровна %.2f рублей \n", month, savings);
            month++;
        }
        System.out.println("Достигнута цель! вам потребовалось " + (month - 1) + "месяцев чтобы накопить 2 459 000 рублей");

        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int people = 12_000_000;
        int birthrate = 17;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
            people += people * (birthrate - mortality) / 1000;
            System.out.println("Год " + year + ": численность населения составляет " + people + " человек");
        }
        System.out.println("задача 4");
        double deposit = 15_000;
        double totalAmount = 12_000_000;
        double percent = 0.07;
        int moon = 1;
        while (deposit < totalAmount) {
            deposit += deposit * percent;
            System.out.printf("месяц %d: сумма накопления ровна %.2f рублей\n", moon, deposit);
            moon++;
        }
        System.out.println("цель достигнута. вам потребовалось " + (moon - 1) + " месяцев, чтобы накопить 12 000 000 рублей");

        System.out.println("задача 5");
        double depositTwo = 15_000;
        double monthlyInterestRate = 7.0 / 100;
        int totalMoons = 9 * 12;
        for (int moons = 1; moons <= totalMoons; moons++) {
            depositTwo *= (1 + monthlyInterestRate);
            if (moons % 6 == 0) {
                System.out.printf("%d месяц: %.2f рублей\n", moons, depositTwo);

                System.out.println("задача 6");
                int pledgeMoon = 15000;
                double percentageMonth = 0.07;
                int monthPurpose = 9 * 12;
                int monthNumber = 1;

                while (monthNumber <= monthPurpose) {
                    pledgeMoon += (int) (pledgeMoon * percentageMonth);

                    if (monthNumber % 6 == 0) {
                        System.out.printf("Месяц %d, сумма накоплений: %d%n", monthNumber, pledgeMoon);
                    }
                    monthNumber++;
                    System.out.println("Задача 7");
                    int firstFriday = 5;
                    int daysInMonth = 31;

                    for (int day = firstFriday; day <= daysInMonth; day += 7) {
                        System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
                    }
                    System.out.println("Задача 8");
                    int currentYear = 2096;
                    int startYear = currentYear - 200;
                    int endYear = currentYear + 100;
                    int cometPeriod = 79;

                    for (int year = startYear; year <= endYear; year += cometPeriod) {
                        System.out.println(year);
                    }

                }
                }
            }
        }
    }