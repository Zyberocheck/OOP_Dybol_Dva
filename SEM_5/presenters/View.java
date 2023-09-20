package SEM_1.SEM_5.presenters;

import java.util.Collection;

import SEM_1.SEM_5.models.Table;

public interface View {

     /**
     * Отобразить список столиков в представлении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    void showAllReservations(Collection<Table> tables);


    
    /**
     * Регистрация наблюдателя
     * @param observer
     */
    void setObserver(ViewObserver observer);

    /**
     * Распечатать результат бронирования столика
     * @param reservationNo
     */
    void printReservationTableResult(int reservationNo);
    
}
