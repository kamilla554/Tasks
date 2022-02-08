package com.company;

import java.util.Scanner;

public class Task2 {
    public void task2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String a = in.next();
        if (isNumber(a)) {
            int num = Integer.parseInt(a);
            for (int i = 2; i <= num; i++) {
                while (num >= i) {
                    if (num % i == 0) {
                        System.out.print(i+" ");
                        num = num / i;
                    } else {
                        break;
                    }
                }
            }
        } else {
            System.out.println("Введено не целое число!");
        }

    }

    private static boolean isNumber(String str) throws NumberFormatException {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
