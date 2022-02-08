package com.company;

import java.util.Scanner;
public class Task4 {
    public void task4() {
        String[][] cifri = new String[][]{{"***", "  *", "***", "***", "* *", "***", "*  ", "***", "***", "***"},
        {
            "* *", "* *", "  *", " * ", "* *", "*  ", "*  ", " * ", "***", "* *"
        },
        {
            "* *", "  *", " * ", "  *", "***", "***", "***", " * ", "* *", "***"
        },
        {
            "***", "  *", "***", "***", "  *", "***", "***", "*  ", "***", "  *"
        }};
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.next();
        String[][] out = new String[4][str.length()];
        for (int i = 0; i < str.length(); i++) {
            out[0][i] = cifri[0][str.charAt(i) - '0'];
            out[1][i] = cifri[1][str.charAt(i) - '0'];
            out[2][i] = cifri[2][str.charAt(i) - '0'];
            out[3][i] = cifri[3][str.charAt(i) - '0'];
        }
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(out[j][i]+" ");
            }
            System.out.println();
        }
    }
}
