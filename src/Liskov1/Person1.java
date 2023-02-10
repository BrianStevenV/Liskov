package Liskov1;

public class Person1 {
    private int dni;
    private String name;
    private String last_name;
    private Long card;

    public Person1(int dni, String name, String last_name, Long card) {
        this.dni = dni;
        this.name = name;
        this.last_name = last_name;
        this.card = card;
    }

    public void pagar(){
        System.out.println("The Person can buy because they have DNI and Card");
    }
}
