package com.company;

import java.util.Scanner;

public class Task5 {
    public void task5(){        Scanner in = new Scanner(System.in);
        System.out.print("Введите объем сейфа: ");
        int value = Integer.parseInt(in.next());
        System.out.print("Введите количество предметов: ");
        int b = Integer.parseInt(in.next());
        Items[] items = new Items[b];
        for (int i = 0; i < b; i++) {
            System.out.print("Введите объем предмета: ");
            int tempValue = Integer.parseInt(in.next());
            System.out.print("Введите цену предмета: ");
            int tempPrice = Integer.parseInt(in.next());
            System.out.print("Введите имя предмета: ");
            String tempName = in.next();
            items[i] = new Items(tempValue, tempPrice, tempName);
        }
        Safe safe = new Safe(value);
        safe.enumeration(items);
        safe.solution();
    }
}
