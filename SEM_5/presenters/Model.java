package SEM_1.SEM_5.presenters;

import SEM_1.SEM_5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();
    int reservationTable(Date reservationDate, int tableNo, String name);
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
