package tn.esprit.autoloc.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.repository.ReservationRepository;
import tn.esprit.autoloc.service.interfaces.IReservationService;

import java.util.List;

@Service
@AllArgsConstructor

public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository reservationRepository;

    public List<Reservation> retrieveAllReservations(){
        return reservationRepository.findAll();
    }

    public Reservation retrieveReservation(Long reservationId){
        return reservationRepository.findById(reservationId).get();
    }

    public Reservation addReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public void removeReservation(Long reservationId){
        reservationRepository.deleteById(reservationId);
    }

    public Reservation modifyReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }
}
