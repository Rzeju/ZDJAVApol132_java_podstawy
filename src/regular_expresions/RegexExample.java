package regular_expresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {

        //Utworzenie obiektu Pattern statyczna metodą 'complie()'
        Pattern pattern = Pattern.compile("a+bcd");
        //Utowrzenie obiektu Matcher staytczną metodą 'matcher' wywołaną na obiekcie pattern
        //Obiekt matcher bedzie porównywał wprowadzony ciąg znaków z regexem i porządany przez nas sposób
        Matcher matcher = pattern.matcher("aaaaabcd aaaaaaabbcd");
        //Metoda matches() sprawdza czy cały ciąg znaków pasuje do regexu
        boolean result = matcher.matches();
        System.out.println("Czy podany łancuch znaków spełnie regex? -> " + result);

        //Przypisanie do zmiennej nowego matchera (podany jest nowy ciąg znakow do sprawdzenia)
        matcher = pattern.matcher("aaaaabcd");
        //Sprawdzenie czy nowy ciąg znaków spełnia zadany regex
        result = matcher.matches();
        System.out.println("Czy podany łancuch znaków spełnie regex? -> " + result);

        //Przypisanie do zmiennej nowego matchera (podany jest nowy ciąg znakow do sprawdzenia)
        matcher = pattern.matcher("aaaaabcd aaaaaaabbcd");
        //Metoda find sprawdza czy w całym ciągu znaków wystepuje jaki podciąg znaków, który spełnia zadany regex
        result = matcher.find();
        System.out.println("Czy podany łancuch znaków spełnie regex? -> " + result);
    }
}
