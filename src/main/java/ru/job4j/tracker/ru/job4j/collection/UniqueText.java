package ru.job4j.tracker.ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String i: origin) {
            check.add(i);
        }
        for (String str: text) {
            if (!check.contains(str)) {
                return false;
            }
        }
        return true;
    }
}
