package Liskov2;

public class Adult2 extends Person2{
    private String item;
    private Long dni;

    public Adult2(String name, String last_name, String item, Long dni) {
        super(name, last_name);
        this.item = item;
        this.dni = dni;
    }

    public void buy(){
        System.out.println("I can buy.");
    }
}
