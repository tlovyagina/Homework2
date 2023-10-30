package org.example.extratasks;

// Переименованный класс Cat из дополнительной задачи №5
public class TwoErrorsCat {
    // Ошибка №1 - публичные поля нарушают принцип инкапсуляции. Заменяю их на private
    private String name;
    private int age;
    private int weight;

    public TwoErrorsCat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Ошибка №2 - не реализованы Getter и Setter для поля weight
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}