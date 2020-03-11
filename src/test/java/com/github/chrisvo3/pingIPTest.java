package com.github.chrisvo3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vochr
 * 11 Mar, 2020 at 10 : 39
 *
 * @package com.github.chrisvo3
 * @project geolocation
 */

public class pingIPTest {

    public void test(String ip, String expected) { // given
        // when
        String actual = Application.pingIP(ip);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        String ip = "8.8.8.8";
        String expected = "{"
                + "  \"ip\": \"8.8.8.8\","
                + "  \"hostname\": \"dns.google\","
                + "  \"city\": \"Mountain View\","
                + "  \"region\": \"California\","
                + "  \"country\": \"US\","
                + "  \"loc\": \"37.3860,-122.0838\","
                + "  \"org\": \"AS15169 Google LLC\","
                + "  \"postal\": \"94035\","
                + "  \"timezone\": \"America/Los_Angeles\","
                + "  \"readme\": \"https://ipinfo.io/missingauth\""
                + "}";
        test(ip, expected);
    }

    @Test
    public void test2() {
        String ip = "113.53.91.12";
        String expected = "{"
                + "  \"ip\": \"113.53.91.12\","
                + "  \"hostname\": \"node-hzg.pool-113-53.dynamic.totinternet.net\","
                + "  \"city\": \"Bangkok\","
                + "  \"region\": \"Bangkok\","
                + "  \"country\": \"TH\","
                + "  \"loc\": \"13.7540,100.5014\","
                + "  \"org\": \"AS23969 TOT Public Company Limited\","
                + "  \"postal\": \"10100\","
                + "  \"timezone\": \"Asia/Bangkok\","
                + "  \"readme\": \"https://ipinfo.io/missingauth\""
                + "}";
        test(ip, expected);
    }

    @Test
    public void test3() {
        String ip = "203.162.21.216";
        String expected = "{"
                + "  \"ip\": \"203.162.21.216\","
                + "  \"hostname\": \"static.vnpt.vn\","
                + "  \"city\": \"Quận Chín\","
                + "  \"region\": \"Ho Chi Minh\","
                + "  \"country\": \"VN\","
                + "  \"loc\": \"10.8397,106.7709\","
                + "  \"org\": \"AS45899 VNPT Corp\","
                + "  \"timezone\": \"Asia/Ho_Chi_Minh\","
                + "  \"readme\": \"https://ipinfo.io/missingauth\""
                + "}";
        test(ip, expected);
    }

}
