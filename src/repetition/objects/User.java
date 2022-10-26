package repetition.objects;

//moja klasa
public class User {

    //pola klasy (każdy obiekt tej klasy zawiera swój własny zestaw tych pól)
    private String login;
    private String password;
    private String emailAddress;

    //konstruktor bezargumentowy (domyślny)
    //Tworzy obiekt klasy bez przypisywania polom obiektu konkretnych wartości (wartości pól będą domyślne)
    public User() {

    }

    //Konstruktor parametrowy, przyjmuje wartości i przypisuje je do pól obiektu (inicjalizuje pola obiektu konkretnymi wartościami)
    public User(String login, String password, String emailAddress) {
        this.login = login;
        this.password = password;
        this.emailAddress = emailAddress;
    }


}
