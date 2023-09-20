package SEM_1.SEM_5.views;

import SEM_1.SEM_5.models.Reservation;
import SEM_1.SEM_5.models.Table;
import SEM_1.SEM_5.presenters.View;
import SEM_1.SEM_5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {
    
     private ViewObserver observer;

    public void showTables(Collection<Table> tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void printReservationTableResult(int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
        else
            System.out.println("Не удалось забронировать столик. Попробуйте выполнить операцию позже.");
    }

    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo, name);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку отмены бронирования)
     * @param oldReservation идентификатор бронирования (старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        //TODO: Реализовать самостоятельно в рамках домашней работы
    }

    @Override
    public void showAllReservations(Collection<Table> tables) {
        System.out.println("\nВсе бронирования:");
        for (Table table : tables) {
            for (Reservation reservation : table.getReservations()) {
                System.out.println(table);
                System.out.println("  " + reservation);
            }
        }
    }
    
}