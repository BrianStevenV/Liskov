import Liskov1.Boy1;
import Liskov1.Person1;
import Liskov2.Adult2;
import Liskov2.Boy2;


public class Main {
    public static void main(String[] args) {

//        Person1 adult = new Person1(1234,"Balduino", "Cuarto", 457567L);
//       Boy1 boy = new Boy1();    //El parametro no funciona

        Adult2 adultBuy = new Adult2("Emmanuel", "Usme", "Una vida", 456456456L);
        Boy2 boyBuy = new Boy2("Brian", "Steven",adultBuy);
        boyBuy.buy();
    }
}