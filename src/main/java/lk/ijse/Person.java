package lk.ijse;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1l;
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getCode() {
        return name;
    }

    public void setCode(String code) {
        this.name = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person {" +
                " name=" + name +
                ", id=" + id +
                '}';
    }
}
