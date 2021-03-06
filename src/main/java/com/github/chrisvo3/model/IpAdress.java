package com.github.chrisvo3.model;

/**
 * Created by vochr
 * 11 Mar, 2020 at 10 : 18
 *
 * @package com.github.chrisvo3
 * @project geolocation
 */

public class IpAdress {
    private String ip;
    private String city;
    private String region;
    private String country;

    public IpAdress() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "IpAdress {" +
                "\n\tip='" + ip + '\'' +
                ", \n\tcity='" + city + '\'' +
                ", \n\tregion='" + region + '\'' +
                ", \n\tcountry='" + country + '\'';
    }
}
