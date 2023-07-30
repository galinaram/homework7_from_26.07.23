// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
        System.out.println("Задача 1:");
        int sum = 0;
        int n = 0;
        while (sum <= 2459000) {
            n++;
            sum += 15000;
            System.out.println("Месяц " + n + " сумма накоплений равна " + sum);
        }
    }

    public static void task2() {
        System.out.println("Задача 2:");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3:");
        int population = 12000000;
        int growth;
        for (int i = 1; i <= 10; i++) {
            population = population + (population/1000*17) - (population/1000*8);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4:");
        int sum = 15000;
        int month = 1;
        while (sum < 12000000) {
            sum *= 1.07;
            System.out.println("Месяц " + month + ". Сумма накоплений: " + sum);
            month ++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5:");
        int sum = 15000;
        int month = 1;
        while (sum < 12000000) {
            sum *= 1.07;
            if (month%6==0 && month<=24) {
                System.out.println("Месяц " + month + ". Сумма накоплений: " + sum);
            }
            month ++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6:");
        int sum = 15000;
        int month = 1;
        while (month <= 9*12) {
            sum *= 1.07;
            if (month%6==0) {
                System.out.println("Месяц " + month + ". Сумма накоплений: " + sum);
            }
            month ++;
        }
        System.out.println("За 9 лет сумма накоплений равна " + sum);
    }

    public static void task7() {
        System.out.println("Задача 7:");
        int fridayNumb = 4;
        for (int i = 1; i <= 31; i++) {
            if ((i-fridayNumb)%7==0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8() {
        System.out.println("Задача 8:");
        int year = 2023;
        int yearBefore200 = year - 200;
        int yearAfter100 = year + 100;
        for (year = yearBefore200; year <= yearAfter100; year++) {
            if ((year%79)==0) {
                System.out.println(year);
            }
        }
    }
}