package quizTwo;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(2, 5, 1, 16, 43, 32, 31, 21, 4);
        int maxNumber = findMaximumNumber(arrayList);
        int minNumber=findMinNumber(arrayList);
        Integer[] sortedList = sortTheNumbersByAssendingOrder(arrayList);
        printMinAndMaxNumbers(minNumber,maxNumber);
        printSortedList(sortedList);
    }

    private static void printSortedList(Integer[] sortedList) {
        System.out.println("--Sorted List --");
        Arrays.stream(sortedList).forEach(n->{
            System.out.println(n);
        });
    }

    private static Integer[] sortTheNumbersByAssendingOrder(List<Integer> arrayList) {
        return arrayList.stream().sorted((p,q)->{
            return p-q;
        }).toArray(Integer[]::new);
    }

    private static void printMinAndMaxNumbers(int minNumber, int maxNumber) {
        System.out.println("Min Number "+ maxNumber);
        System.out.println("Max Number "+maxNumber);
    }

    private static int findMinNumber(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(n->n).max().orElse(0);
    }

    private static int findMaximumNumber(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(n->n).max().orElse(0);
    }
}
