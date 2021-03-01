package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.util.Objects;

public class Item {
    private LocalDateTime created = LocalDateTime.now();
    private int id;
    private String name;

    public Item() {
    }
    public Item(String name) {
        this.name = name;
    }
    public Item(int id) {
        this.id = id;
    }
    public Item(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getTime() {
        return created;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void getNameAndId(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(created, item.created) && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(created, id, name);
    }
}