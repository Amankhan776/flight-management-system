package com.example.flightmanagement.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.flightmanagement.model.Flight;
import com.example.flightmanagement.repository.FlightRepository;
 
@Service
public class FlightService {
 
    @Autowired
    private FlightRepository repository;
 
    public void addFlight(Flight flight) {
        repository.save(flight);
    }
 
    public List<Flight> viewFlights() {
        return repository.findAll();
    }
 
    public Flight getFlight(int id) {
        return repository.findById(id).orElse(null);
    }
 
    public void updateFlight(Flight flight) {
        repository.save(flight);
    }
 
    public void deleteFlight(int id) {
        repository.deleteById(id);
    }
}