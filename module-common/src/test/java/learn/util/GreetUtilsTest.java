package learn.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * project : learn-release
 * author :  liyuqi
 * date : 2017-02-11 9:37
 */
public class GreetUtilsTest {
    @Test
    public void greet() throws Exception {
        Assert.assertEquals("null", GreetUtils.greet(null));
        Assert.assertEquals("String", GreetUtils.greet("String"));
    }

}