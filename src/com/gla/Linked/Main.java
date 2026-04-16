package com.gla.Linked;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverseList(list);
        System.out.println(list);

        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverseList(linkedList);
        System.out.println(linkedList);
    }

    public static <T> void reverseList(List<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}