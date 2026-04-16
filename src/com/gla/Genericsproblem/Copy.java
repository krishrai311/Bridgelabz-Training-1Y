package com.gla.Genericsproblem;
import java.util.*;
public class Copy {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) {
            dest.add(n);
        }
    }
}
