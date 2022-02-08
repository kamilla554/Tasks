package com.company;

import java.util.Scanner;

public class Task1 {
    public void Task1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum = sum + Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println("Сумма цифр в строке:");
        System.out.println(sum);
    }
}
