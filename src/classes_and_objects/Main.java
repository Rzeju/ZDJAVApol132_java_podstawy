package classes_and_objects;

public class Main {

    public static void main(String[] args) {

        //Utowrzenie obiektu typu Movie
        Movie movie = new Movie();
        //Wywołania metody play() na obiekcie movie
        //w celu sprawdzenia wartości pola title = null
        //(pole zainicjalizowane wartością domyślną - default)
        movie.play();

        System.out.println("Wywoływanie pierwszego setter");

        //Wywołanie setter na obiekcie movie
        //i ustawienie wartości w oplu title
        movie.setTitle("8 pasażer nostromo");
        //Ponowne wywołanie metody play()
        //w celu zaobserwowania zmiany wartości pola title
        movie.play();

        System.out.println("Wywołanie pozostałych setterów");

        //Wywołanie settera i ustawienie wartosci pola description
        movie.setDescription("straszny kosmita, fuuuuj");
        //Wywołanie settera i ustawienie wartosci pola productionYear
        movie.setProductionYear(1972);
        //Sprawdzenie wartości pól w obiekcie
        movie.play();

        System.out.println("Poprawa wartości pola productionYear");
        //Ponowne ustawienie wartości pola productionYear
        movie.setProductionYear(1979);
        movie.play();





    }
}
