package com.lesson7;
/*1) Электронные часы показывают время в формате от 00:00 до 23:59.
        Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
        что справа от двоеточия (например, 02:20, 11:11 или 15:51).

    */

public class task1 {
    public static void main(String[] args) {

        System.out.println("\nВсего " + time() + " раз");
    }

    public static int time() {
        String hour = "0";
        String minute = "0";
        int counter = 0;
        for (int hrs = 0; hrs <= 24; hrs++) {
            hour = "0";
            for (int mnts = 0; mnts <= 60; mnts++) {
                minute = "0";
                if (hrs < 10) {
                    hour = "0" + String.valueOf(hrs);
                } else {
                    hour = String.valueOf(hrs);
                }
                if (mnts < 10) {
                    minute = "0" + String.valueOf(mnts);
                } else {
                    minute = String.valueOf(mnts);
                }
                StringBuilder tmp = new StringBuilder(hour);
                if (tmp.reverse().toString().equals(minute.toString())) {
                    System.out.println(hour + ":" + minute);
                    counter++;
                }
            }

        }
        return counter;
    }
}
