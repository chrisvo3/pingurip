package com.github.chrisvo3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vochr
 * 11 Mar, 2020 at 10 : 56
 *
 * @package com.github.chrisvo3
 * @project geolocation
 */

public class getDataTest {

    public void test(String ip, String expected) { // given
        // when
        String actual = Application.getData(ip);

        // then
        Assert.assertEquals(expected, actual);
    }


}
