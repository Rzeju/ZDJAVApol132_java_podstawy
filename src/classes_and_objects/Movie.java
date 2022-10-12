package classes_and_objects;

//nazwa klasy
public class Movie {

    //pola klasy (dane które opisują obiekty tej klasy)
    private String title;
    private String description;
    private int productionYear;

    //konstruktor bezargumentowy (tworzy obiekty tej klasy
    public Movie() {

    }

    //metoda wypisująca napis i wartośc pola
    public void play() {
        System.out.println("Displaying film -> " + title);
        System.out.println("Description -> " + description);
        System.out.println("Year of production -> " + productionYear);
    }

    //metoda (setter, ustawia wartośc pola obiektu na wartośc przekazaną w argumencie metody)
    public void setTitle(String title) {
        this.title = title;
    }

    //metoda (setter, ustawia wartośc pola obiektu na wartośc przekazaną w argumencie metody)
    public void setDescription(String description) {
        this.description = description;
    }

    //metoda (setter, ustawia wartośc pola obiektu na wartośc przekazaną w argumencie metody)
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
