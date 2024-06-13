package com.amisitysu.gmail;

import java.util.Random;

public class ArrayOper {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }


        System.out.print("Елементи масиву: [");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        int negSum = 0;
        for (int num : array) {
            if (num < 0) {
                negSum += num;
            }
        }
        System.out.println("Сума від'ємних чисел: " + negSum);


        int evenCount = 0, oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);


        int maxElement = array[0], minElement = array[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                maxIndex = i;
            }
            if (array[i] < minElement) {
                minElement = array[i];
                minIndex = i;
            }
        }
        System.out.println("Найбільший елемент: " + maxElement + " (з індексом " + maxIndex + ")");
        System.out.println("Найменший елемент: " + minElement + " (з індексом " + minIndex + ")");


        int firstNegIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegIndex = i;
                break;
            }
        }

        if (firstNegIndex != -1) {
            int sum = 0;
            int count = 0;
            for (int i = firstNegIndex + 1; i < array.length; i++) {
                sum += array[i];
                count++;
            }
            double average = (count > 0) ? (double) sum / count : 0;
            System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + average);
        } else {
            System.out.println("В масиві немає від'ємних чисел.");
        }
    }
}