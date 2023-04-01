package homework;

import homework.tasks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //Task1=============================================
        System.out.print("Введите длину массива N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Введите максимальное значение массива: ");
        int m = sc.nextInt();
        sc.close();
        Task1.bubbleSortAndLog(n, m);

        //Task2===============================================
        Task2.usingStringBuilding();

    }
}
