package ru.job4j.tracker.ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put("почта@yandex.ru", "Фамилия Имя Отчество");
        for (Map.Entry<String, String> i : hash.entrySet()) {
            System.out.println(i);
        }
    }
}
