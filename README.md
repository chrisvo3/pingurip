# Geolocation 

## About

Geolocation is vital in today's digital world, and it's used in many applications: maps, advertising, country-specific video streaming, and many others.

Demonstrates how to create geolocation applications.
Every modern computer has the ability to find its location.

* HTML5 has the geolocation API
* Google Maps returns a location and accuracy radius for mobile phones, based on WiFi and cell towers.
* Some libraries map the computer's IP address to a longitude and latitude.

## Expectation

A geolocation app to show a location of the computer that running their code.
Their results should review latitude, longtitude, indicators of how accurate that location is.
Expressed as a radius from the revealed longtitude and latitude, measured in kilometeres.

## Requires

Find the location, convert from one data structure to another; and perhaps convert from one unity of measure to another.

## How this work

Write program that takes the current IP address of our computer and passes this value to a web interface provided by a geolocation service provider.
This service will return a JS notation document. Containing: city, country, latitude, and longtitude cooridnates, etc.
The result give a printout of the city of provided IP address, a link to a map showing the approximate location.

Will perform __two test cases__:
1. Current IP address
2. Well-known public IP address

### Notes
If you're running this program within a corporate network, your public IP address may not match your current location.
This is because you're accessing the internet through a private network and several layers of security such as routers, firewalls, and VPNs.



