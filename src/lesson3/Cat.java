package lesson3;

import java.io.Serializable;

public class Cat implements Serializable {
    private static final long serialVersionUID = 5748984224549470379L;//для корректной сиреализации

    private String name;
    private String color;
    private int age;
//    private int liveCount;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
