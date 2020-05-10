package com.github.chrisvo3;

import com.github.chrisvo3.service.IpService;
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
        String actual = IpService.getData(ip);

        // then
        Assert.assertEquals(expected, actual);
    }

    public String toString(String ip, String city, String region, String country, String loc) {
        return "IpAdress {" +
                "\n\tip='" + ip + '\'' +
                ", \n\tcity='" + city + '\'' +
                ", \n\tregion='" + region + '\'' +
                ", \n\tcountry='" + country + '\'' +
                "\n\tmap: https://www.google.com/maps/?q=" + loc + "\n}";
    }

    String city = "";
    String region = "";
    String country = "";
    String loc = "";

    @Test
    public void test1() {
        String ip = "8.8.8.8";
        this.city = "Mountain View";
        this.region = "California";
        this.country = "US";
        this.loc = "37.3860,-122.0838";

        String expected = toString(ip, city, region, country, loc);
        test(ip, expected);
    }

    @Test
    public void test2() {
        String ip = "113.53.91.12";
        this.city = "Bangkok";
        this.region = "Bangkok";
        this.country = "TH";
        this.loc = "13.7540,100.5014";
        String expected = toString(ip, city, region, country, loc);
        test(ip, expected);
    }

    @Test
    public void test3() {
        String ip = "203.162.21.216";
        this.city = "Quận Chín";
        this.region = "Ho Chi Minh";
        this.country = "VN";
        this.loc = "10.8397,106.7709";
        String expected = toString(ip, city, region, country, loc);
        test(ip, expected);
    }

}
