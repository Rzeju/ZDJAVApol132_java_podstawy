package statics.inner_outter.static_example;

public class Main {

    public static void main(String[] args) {

        //Utworzenie obiektu klasy zewnętrznej
        MyOuterClass myOuterClass = new MyOuterClass();
        //Utworzenie obiektu klasy wewnętrznej przy użyciu obiektu klasy zewnętrznej
        //(tak jak w poprzednim przykładzie-> pakiet 'inner_outter')
        MyOuterClass.MyInnerClass myInnerClass1 = myOuterClass.init();

        //Utowrzenie obiektu klasy wewnętrznej bez tworzenia obiektu klasy zewnętrznej
        //Takie podejście umożliwia nam zadeklarowanie klasy wewnętrznej jaki static
        MyOuterClass.MyInnerClass myInnerClass = new MyOuterClass.MyInnerClass();
    }
}
