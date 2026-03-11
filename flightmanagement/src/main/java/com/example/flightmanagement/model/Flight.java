package com.example.flightmanagement.model;
 
import jakarta.persistence.*;
 
@Entity
public class Flight {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightId;
 
    private String flightNumber;
    private String airlineName;
    private String source;
    private String destination;
    private double price;
 
    public Flight() {}
 
    public int getFlightId() {
        return flightId;
    }
 
    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
 
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