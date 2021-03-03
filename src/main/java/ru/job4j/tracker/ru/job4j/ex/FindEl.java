package ru.job4j.tracker.ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Элемент не найден");
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] n = {" ", "h", "d"};
        String ni = "a";
        try {
            System.out.println(indexOf(n, ni));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
