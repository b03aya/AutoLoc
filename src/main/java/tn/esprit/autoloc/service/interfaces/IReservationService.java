package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Reservation;

import java.util.List;

public interface IReservationService {

    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(Long reservationId);
    public Reservation addReservation(Reservation reservation);
    public void removeReservation(Long reservationId);
    public Reservation modifyReservation(Reservation reservation);
}
