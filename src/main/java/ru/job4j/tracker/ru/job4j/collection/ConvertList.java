package ru.job4j.tracker.ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        int i = 0;
        for (int[] row : list) {
            for (int cell: row) {
                rsl.add(i, cell);
                i++;
            }
        }
        return rsl;
    }
}
