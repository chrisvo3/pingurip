package com.github.chrisvo3;

import com.github.chrisvo3.service.IpService;
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
        String actual = IpService.pingIP(ip);

        // then
        Assert.assertEquals(expected, actual);
    }

    public String toString(String ip, String host, String city, String region, String country, String loc, String org, String postal, String timezone) {
        if (postal != null) {
            return "{"
                    + "  \"ip\": \"" + ip + "\","
                    + "  \"hostname\": \"" + host + "\","
                    + "  \"city\": \"" + city + "\","
                    + "  \"region\": \"" + region + "\","
                    + "  \"country\": \"" + country + "\","
                    + "  \"loc\": \"" + loc + "\","
                    + "  \"org\": \"" + org + "\","
                    + "  \"postal\": \"" + postal + "\","
                    + "  \"timezone\": \"" + timezone + "\","
                    + "  \"readme\": \"https://ipinfo.io/missingauth\""
                    + "}";
        } else {
            return "{"
                    + "  \"ip\": \"" + ip + "\","
                    + "  \"hostname\": \"" + host + "\","
                    + "  \"city\": \"" + city + "\","
                    + "  \"region\": \"" + region + "\","
                    + "  \"country\": \"" + country + "\","
                    + "  \"loc\": \"" + loc + "\","
                    + "  \"org\": \"" + org + "\","
                    + "  \"timezone\": \"" + timezone + "\","
                    + "  \"readme\": \"https://ipinfo.io/missingauth\""
                    + "}";
        }
    }

    String host = "";
    String city = "";
    String region = "";
    String country = "";
    String loc = "";
    String org = "";
    String postal = "";
    String timezone = "";

    @Test
    public void test1() {
        String ip = "8.8.8.8";
        this.host = "dns.google";
        this.city = "Mountain View";
        this.region = "California";
        this.country = "US";
        this.loc = "37.3860,-122.0838";
        this.org = "AS15169 Google LLC";
        this.postal = "94035";
        this.timezone = "America/Los_Angeles";

        String expected = toString(ip, host, city, region, country, loc, org, postal, timezone);
        test(ip, expected);
    }

    @Test
    public void test2() {
        String ip = "113.53.91.12";
        this.host = "node-hzg.pool-113-53.dynamic.totinternet.net";
        this.city = "Bangkok";
        this.region = "Bangkok";
        this.country = "TH";
        this.loc = "13.7540,100.5014";
        this.org = "AS23969 TOT Public Company Limited";
        this.postal = "10100";
        this.timezone = "Asia/Bangkok";
        String expected = toString(ip, host, city, region, country, loc, org, postal, timezone);
        test(ip, expected);
    }

    @Test
    public void test3() {
        String ip = "203.162.21.216";
        this.host = "static.vnpt.vn";
        this.city = "Quận Chín";
        this.region = "Ho Chi Minh";
        this.country = "VN";
        this.loc = "10.8397,106.7709";
        this.org = "AS45899 VNPT Corp";
        this.postal = null;
        this.timezone = "Asia/Ho_Chi_Minh";
        String expected = toString(ip, host, city, region, country, loc, org, postal, timezone);
        test(ip, expected);
    }

}
