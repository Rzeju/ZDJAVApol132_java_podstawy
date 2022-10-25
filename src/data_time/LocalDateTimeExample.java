package data_time;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        //Utowrzenie obiektu klasy LocalDateTime metodą statyczną 'now()'
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //Wywołanie metoda do prezentacji określonej części daty lub czasu
        System.out.println(localDateTime.toLocalDate() + " " + localDateTime.toLocalTime());
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth() + " -> " + localDateTime.getMonth().getValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
    }
}
