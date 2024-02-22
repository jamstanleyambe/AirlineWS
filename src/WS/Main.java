package WS;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        String url = "http://localhost:8088/ws/airlineservice";
        Endpoint.publish(url, new AirlineWS());
        System.out.println(url); }
}