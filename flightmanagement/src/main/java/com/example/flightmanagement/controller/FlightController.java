package com.example.flightmanagement.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 
import com.example.flightmanagement.model.Flight;
import com.example.flightmanagement.service.FlightService;
 
@Controller
public class FlightController {
 
    @Autowired
    private FlightService service;
 
    @GetMapping("/addFlight")
    public String addFlightPage(Model model) {
        model.addAttribute("flight", new Flight());
        return "addFlight";
    }
 
    @PostMapping("/saveFlight")
    public String saveFlight(@ModelAttribute Flight flight) {
        service.addFlight(flight);
        return "redirect:/viewFlights";
    }
 
    @GetMapping("/viewFlights")
    public String viewFlights(Model model) {
        model.addAttribute("flights", service.viewFlights());
        return "viewFlights";
    }
 
    @GetMapping("/deleteFlight/{id}")
    public String deleteFlight(@PathVariable int id) {
        service.deleteFlight(id);
        return "redirect:/viewFlights";
    }
 
    @GetMapping("/updateFlight/{id}")
    public String updateFlightPage(@PathVariable int id, Model model) {
        model.addAttribute("flight", service.getFlight(id));
        return "updateFlight";
    }
 
    @PostMapping("/updateFlight")
    public String updateFlight(@ModelAttribute Flight flight) {
        service.updateFlight(flight);
        return "redirect:/viewFlights";
    }
}