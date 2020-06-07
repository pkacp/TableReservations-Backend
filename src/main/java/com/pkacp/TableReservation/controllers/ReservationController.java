package com.pkacp.TableReservation.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/reservations")
public class ReservationController {

//    @GetMapping()
//    @PreAuthorize("hasRole('CUSTOMER')")
//    public String getReservationsForCustomer() {
//        return "List of reservations";
//    }
//
//    @PostMapping()
//    @PreAuthorize("hasRole('CUSTOMER')")
//    public String createReservationsForCustomer() {
//        return "Added successfully";
//    }

}
