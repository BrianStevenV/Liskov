package Liskov2;

public class Boy2 extends Person2{

    private Adult2 adult2;
    public Boy2(String name, String last_name, Adult2 adult2) {
        super(name, last_name);
        this.adult2 = adult2;
    }
    public void buy(){
        adult2.buy();
    }
}
