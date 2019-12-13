package com.lesson7;
/*
        4) В банк положили S денег. Какой станет сумма вклада через N лет, если процент 1,5% добавляется к сумме вклада ежемесячно.
        *) Результат скинуть как ссылка на github, без лишних файлов где каждое задание отдельным коммитом*/


import java.util.Random;
import java.util.SortedMap;

public class task4 {
    public static void main(String[] args) {
        float deposit = RANDOM.nextInt(1000);
        System.out.println("Изначальный вклад " + deposit + " тугриков");
        int years = RANDOM.nextInt(100);
        for (int i = 0; i < years * 12; i++) {
            deposit += interest(deposit);
        }
        System.out.printf("На " + years + " лет");
        if (years == 69) {
            System.out.println(" nice");
        } else {
            System.out.println();
        }
        System.out.printf("Ваш вклад превратился в состояние %f\n", deposit);
        System.out.println("Но из-за инфляции на эти деньги теперь даже нельзя оплатить курсы в hillel ;(");
    }

    private static long interest(float deposit) {
        float interest = (float) (deposit * 0.015);
        long result = (long) (Math.round(interest));
        return result;
    }

    private static final Random RANDOM = new Random();


}