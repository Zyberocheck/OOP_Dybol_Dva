package SEM_1.SEM_5;

import SEM_1.SEM_5.models.TableModel;
import SEM_1.SEM_5.presenters.BookingPresenter;
import SEM_1.SEM_5.views.BookingView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);
        bookingPresenter.loadTables();
        bookingPresenter.updateTablesUI();

        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nВведите дату через '/' : ");
        String strDate = input.nextLine();
        Date date = formatter.parse(strDate);
        System.out.print("Введите номер столика: ");
        int tableNo = input.nextInt();
        input.nextLine();
        System.out.print("Введите Ваше имя: ");
        String name = input.nextLine();

        view.reservationTable(date, tableNo, name);

        System.out.print("\nВведите номер брони: ");
        int resNo = input.nextInt();
        input.nextLine();
        System.out.print("Введите дату: ");
        String strNewDate = input.nextLine();
        Date newDate = formatter.parse(strNewDate);
        System.out.print("Введите номер столика: ");
        int newTableNo = input.nextInt();
        input.nextLine();
        System.out.print("Введите Ваше имя: ");
        String newName = input.nextLine();
        view.changeReservationTable(resNo, newDate, newTableNo, newName);

        bookingPresenter.updateTablesUI();

        input.close();

        // view.reservationTable(new Date(), 3, "Станислав");

        // view.changeReservationTable(101, new Date(), 1, "Станислав");
    }

}
