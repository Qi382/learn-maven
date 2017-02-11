package learn.run;

import learn.module.Person;
import learn.util.GreetUtils;

/**
 * project : learn-release
 * author :  liyuqi
 * date : 2017-02-11 9:39
 */
public class PersonGreet {
    public static void main(String[] args) {
        System.out.println(GreetUtils.greet(new Person("David", 18)));
    }
}
