package lk.ijse;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1l;
    private String code;
    private int id;

    public Person(String code, int id) {
        this.code = code;
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", id=" + id +
                '}';
    }
}
