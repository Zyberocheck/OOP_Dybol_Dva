package SEM_1.SEM_5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public class Table {

    private static int counter;
    private final int no;
    private final Collection<Reservation> reservations = new ArrayList<>();

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public int getNo() {
        return no;
    }

    {
        no = ++counter;
    }

    public Reservation getSelectedReservation(int idReservation) {
        for (Reservation reservation : reservations) {
            if (reservation.getId() == idReservation)
                return reservation;
        }
        return null;
    }

    public void deleteReservation(Collection<Reservation> reservations, int idReservation) {
        Iterator<Reservation> iterator = reservations.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == idReservation)
                iterator.remove();
        }
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", no);
    }
    
}
