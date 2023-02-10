package Liskov1;

public class Boy1 extends Person1{

    public Boy1(int dni, String name, String last_name, Long card) {
        super(dni, name, last_name, card);
    }

    public void pagar(){
        System.out.println("The Person can buy because they have DNI and Card");
    }
}
