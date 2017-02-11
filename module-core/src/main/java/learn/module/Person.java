package learn.module;

import java.io.Serializable;

/**
 * project : learn-release
 * author :  liyuqi
 * date : 2017-02-11 9:25
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -5669515299726550041L;

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
