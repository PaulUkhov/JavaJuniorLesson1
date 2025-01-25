package ru.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Напишите программу, которая использует Stream API для обработки списка чисел.
//Программа должна вывести на экран среднее значение всех четных чисел в списке.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 55, 26, 52, 33, 44, 66, 22, 42, 445, 745, 583, 455, 555, 888, 333, 444);
        List<Integer> evenNumberValue = list.stream().filter(el -> el % 2 == 0).collect(Collectors.toList());
        List<Integer> sumAllNumbers = List.of(evenNumberValue.stream().mapToInt(Integer::intValue).sum());
        int sumAllNumbers2 = sumAllNumbers.stream().mapToInt(Integer::intValue).sum();
        int theAverageValueOfAllNumbers = sumAllNumbers2 / evenNumberValue.size();
        System.out.println("Нахождение всех четных чисел в массивe - " + evenNumberValue);
        System.out.println("Нахождение суммы всех чисел, первый вариант с преобразованием в int c помощью List.of() - " + sumAllNumbers);
        System.out.println("Нахождение суммы всех чисел, второй вариант с преобразованием в int - " + sumAllNumbers2);

        System.out.println("Нахождение среднего значения всех чисел " + theAverageValueOfAllNumbers);
    }
}