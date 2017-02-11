package learn.util;

/**
 * project : learn-release
 * author :  liyuqi
 * date : 2017-02-11 9:35
 */
public abstract class GreetUtils {

    public static String greet(Object w) {
        if (w == null) {
            return "null";
        }

        return w.toString();
    }
}
