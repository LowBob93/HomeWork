import java.util.Scanner;

public class HomeWorkLesson2 {
    public static void main(String[] args) {
        boolean booleanCheck = (sumCheck(10, 5));
        System.out.println("Задание 1:");
        System.out.println(booleanCheck);
        System.out.println("_______________________________");
        System.out.println("Задание 2:");
        int tempInt = -20;
        checkSign(tempInt);
        System.out.println("_______________________________");
        System.out.println("Задание 3:");
        int typeCheckArgument = 300;
        boolean tempCheck = (typeCheck(typeCheckArgument));
        System.out.println(tempCheck);
        System.out.println("_______________________________");
        System.out.println("Задание 4:");
        stringPrint(9, "я печатаю эту строку ");
        System.out.println("_______________________________");
        System.out.println("Задание 5:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год для проверки");
        int age = sc.nextInt();
        boolean ageCheck = ageTypeCheck(age);
        System.out.print(ageCheck);
        if (!ageCheck){
            System.out.println(" - Год не високосный"); }
        else
            System.out.println(" - Год високосный");
        sc.close();
    }

    private static boolean sumCheck(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkSign(int tempInt) {
        if (tempInt >= 0) {
            System.out.println("Число положительное");
        } else
            System.out.println("Число отрицательное");
    }

    private static boolean typeCheck(int typeCheckArgument) {
        if (typeCheckArgument < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void stringPrint(int a, String temp) {
        int b = 1;
        do {
            System.out.println(temp + "в " + b + " раз");
            b++;
        }
        while (b <= a);
    }
    public static boolean ageTypeCheck(int age) {
        return (age % 400 == 0 || (age % 4 == 0 && age % 100 != 0));
    }
}