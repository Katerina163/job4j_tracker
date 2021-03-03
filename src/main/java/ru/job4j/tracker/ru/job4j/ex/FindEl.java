package ru.job4j.tracker.ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (String i : value) {
            rsl++;
            if (i.equals(key)) {
                break;
            } else if (rsl == value.length - 1) {
                throw new ElementNotFoundException("Элемент не найден");
            }
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] n = {" ", "h", "d"};
        String ni = "n";
        try {
            System.out.println(indexOf(n, ni));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
