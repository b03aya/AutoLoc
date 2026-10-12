package tn.esprit.autoloc.controller;

import jakarta.servlet.http.PushBuilder;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.interfaces.IReservationService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
    public final IReservationService reservationService;

    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations(){
        List<Reservation> listReservations = reservationService.retrieveAllReservations();
        return listReservations;
    }

    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") Long reservationId) {
        Reservation reservation = reservationService.retrieveReservation(reservationId);
        return reservation;
    }

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r, PushBuilder pushBuilder){
        Reservation reservation = reservationService.addReservation(r);
        return reservation;
    }

    @DeleteMapping("/remove-reservation")
    public void removeReservation(@RequestBody Long reservationId){
        reservationService.removeReservation(reservationId);
    }

    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation r){
        Reservation reservation = reservationService.modifyReservation(r);
        return reservation;
    }
}
