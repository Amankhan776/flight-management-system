package com.example.flightmanagement.dto;
 
public class FlightDTO {
 
    private String flightNumber;
    private String airlineName;
    private String source;
    private String destination;
    private double price;
 
    public String getFlightNumber() {
        return flightNumber;
    }
 
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
 
    public String getAirlineName() {
        return airlineName;
    }
 
    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
 
    public String getSource() {
        return source;
    }
 
    public void setSource(String source) {
        this.source = source;
    }
 
    public String getDestination() {
        return destination;
    }
 
    public void setDestination(String destination) {
        this.destination = destination;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
}