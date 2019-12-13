package com.lesson7;
/* 3) Написать метод который принимает массив случайных чисел.
        Метод должен вернуть массив(меньшего размера) который состоит из элементов, которые больше среднего арифметического.
        4) В банк положили S денег. Какой станет сумма вклада через N лет, если процент 1,5% добавляется к сумме вклада ежемесячно.
        *) Результат скинуть как ссылка на github, без лишних файлов где каждое задание отдельным коммитом*/

import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(underAvgArrayGen(arrayGenerator())));
    }

    private static final Random RANDOM = new Random();

    private static int[] arrayGenerator() {
        int[] arr = new int[RANDOM.nextInt(30) + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(100);
        }
        System.out.println("Оригинальный массив " + Arrays.toString(arr));
        return arr;
    }

    private static int[] underAvgArrayGen(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println("Среднее " + avg);
        int[] result = new int[RANDOM.nextInt(arr.length)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(100 + avg) + avg;
        }
        return arr;
    }
}