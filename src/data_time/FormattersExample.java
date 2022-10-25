package data_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattersExample {

    public static void main(String[] args) {

        //Utworzenie obiektu LocalTime statyczna metodą now
        LocalTime localTime = LocalTime.now();
        //Utworzenie Stringa poprzez formater (reprezentuje czas zgodnie z podaną normą, sposobem prezentacji)
        String formattedLocalTime = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(formattedLocalTime);

        //Utworzenie obiektu LocalDateTime statyczna metodą now
        LocalDateTime localDateTime = LocalDateTime.now();
        //Utworzenie Stringa poprzez formater (reprezentuje datę i czas zgodnie z podaną normą, sposobem prezentacji)
        String localDateTimeString = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(localDateTimeString);
    }
}
