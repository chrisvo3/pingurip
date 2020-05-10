package com.github.chrisvo3.service;

import com.github.chrisvo3.model.IpAdress;
import org.json.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * Created by vochr
 * 10 Mar, 2020 at 10 : 36
 *
 * @package com.github.chrisvo3
 * @project geolocation
 */

public class IpService {

    static Scanner sc = new Scanner(System.in);

    public static void main( String[] args){
        System.out.println("Which IP address you want to look up?");
        String user = choice("a", "b");

        System.out.println(getData(user));
    }

    public static String choice(String op1, String op2) {
        System.out.println(op1 + ". mine \t" + "\t" + op2 + ". other");
        String user = sc.nextLine();
        if (user.equalsIgnoreCase(op1))
            return "";
        else if (user.equalsIgnoreCase(op2)) {
            return inputIP();
        } else {
            System.out.println("Invalid input. Please try again:");
            return choice(op1, op2);
        }
    }

    public static String inputIP() {
        System.out.println("Enter the IP address:");
        String user = sc.nextLine();
        return user;
    }

    public static String getData(String ip) {
        String printout = "";

        String location = "";
        JSONObject obj = null;
        String maplink ="";

        // test case
        location = pingIP(ip); // get our current IP Address
        obj = new JSONObject(location);

        String ipaddress = obj.getString("ip");
        String city = obj.getString("city");
        String region = obj.getString("region");
        String country = obj.getString("country");
        String loc = obj.getString("loc");

        IpAdress address = new IpAdress();
        address.setIp(ipaddress);
        address.setCity(city);
        address.setRegion(region);
        address.setCountry(country);

        maplink = "https://www.google.com/maps/?q=" + loc;

        printout += address.toString() + "\n\tmap: " + maplink + "\n}";
        return printout;
    }

    public static String pingIP(String ip) {
        URL url;
        String response = "";
        if (!ip.equals(""))
            ip = "/" + ip ;

        try {
            // get URL content
            String a="https://ipinfo.io" + ip + "/json";
            url = new URL(a);
            URLConnection conn = url.openConnection();

            // open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                response += inputLine;
            }
            br.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
//        System.out.println(response);
        return response;
    }
}
