package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(romanToInt("MMMCC"));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if ((s.length() - 2 == i)) {
                        if ((s.charAt(i + 1) == 'V')) {
                            sum = sum + 4;
                            if ((i + 1) == s.length() - 1) {
                                i = i + 1;
                            }
                            break;
                        }
                        if (s.charAt(i + 1) == 'X') {
                            sum = sum + 9;
                            i = i + 1;
                            break;
                        }
                    }
                    sum = sum + 1;
                    break;
                case 'V':
                    sum = sum + 5;
                    break;
                case 'X':
                    if (i == s.length() - 1) {
                        sum = sum + 10;
                        break;
                    }
                    if ((s.charAt(i + 1) == 'L')) {
                        sum = sum + 40;
                        i = i + 1;
                        break;
                    }
                    if ((s.charAt(i + 1) == 'C')) {
                        sum = sum + 90;
                        i = i + 1;
                        break;
                    } else {
                        sum = sum + 10;
                    }
                    break;
                case 'L':
                    sum = sum + 50;
                    break;
                case 'C':
                    if (i == s.length() - 1) {
                        sum = sum + 10;
                        break;
                    }
                    if (s.charAt(i + 1) == 'D') {
                        sum = sum + 400;
                        i = i + 1;
                        break;
                    }
                    if (s.charAt(i + 1) == 'M') {
                        sum = sum + 900;
                        i = i + 1;
                        break;
                    } else {
                        sum = sum + 100;
                    }
                    break;
                case 'D':
                    sum = sum + 500;
                    break;
                case 'M':
                    sum = sum + 1000;
                    break;
            }
        }
        return sum;
    }
}
