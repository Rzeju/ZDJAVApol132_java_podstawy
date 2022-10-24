package statics.inner_outter;

public class Main {

    public static void main(String[] args) {

        //Utworzenie obiektu klasy zewnętrznej
        MyOuterClass myOuterClass_1 = new MyOuterClass();
        //Utworzenie obiektu klasy wewnetrznej metodą init
        MyOuterClass.MyInnerClass myInnerClass_1 = myOuterClass_1.init();
        //Wywołanie metody na obiekcie klasy wewnętrznej
        myInnerClass_1.printNumber();

        //DODATKOWY PRZYKŁAD
        //Utworzenie klasy zewnętrzenej z inicjalizacją zmiennej przez konstruktor
        MyOuterClass myOuterClass_2 = new MyOuterClass(10);
        MyOuterClass.MyInnerClass myInnerClass_2 = myOuterClass_2.init();

        myInnerClass_1.extra();
        myInnerClass_2.extra();
    }
}
