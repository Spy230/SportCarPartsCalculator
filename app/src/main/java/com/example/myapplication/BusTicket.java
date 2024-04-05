package com.example.myapplication;

import java.io.Serializable;

public class BusTicket implements Serializable {
    private int userId;
    private String departure;
    private String departureTime; //   время отправления

    private String arrivalTime; //  время прибытия
    private double price;

    public BusTicket(int userId, String departure,  String departureTime, String arrivalTime, double price) {
        this.userId = userId;
        this.departure = departure;
        this.departureTime = departureTime;

        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    public int getUserId() {
        return userId;
    }


    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }



    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
