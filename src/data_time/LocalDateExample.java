package data_time;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {

    public static void main(String[] args) {

        //Utworzenie obiektu klasy LocalDate metodą statyczną 'now()'
        LocalDate now = LocalDate.now();
        //Wyświetleni utworzonej daty
        System.out.println(now);

        //Utworzenie obiektu typu LocalDate metodą statyczną
        LocalDate myDate = LocalDate.of(1993, Month.FEBRUARY, 27);
        //Wyświetlenie daty i elementow daty poprzez różne sposoby, metody
        System.out.println(myDate);
        System.out.println("Rok -> " + myDate.getYear());
        System.out.println("Miesiąc -> " + myDate.getMonth() + " = " + myDate.getMonthValue());
        System.out.println("Dzień -> " + myDate.getDayOfMonth());

        //Wyświetlenie dnia tygodnia dla daty zawartej w zmiennej myDate
        System.out.println("Jest to dzień -> " + myDate.getDayOfWeek());

        //Wyświetlenie dnia w roku dla daty zawartej w zmiennej myDate
        System.out.println("Był to dzień roku -> " + myDate.getDayOfYear());

        //Wyświetlenie dnia miesiąca dla daty zawartej w zmiennej myDate
        System.out.println("Był to dzień miesiąca -> "+ myDate.getDayOfMonth());



    }

}
