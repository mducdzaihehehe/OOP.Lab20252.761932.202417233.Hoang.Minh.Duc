import java.util.GregorianCalendar;

public class Aims {
    public static void main(String[] args){
        DigitalMedia dvd1 = new DigitalMedia("sieunhan", "hoathinh", "jack97", 97, 36.18f);
        System.out.println(dvd1.gettitle());
        System.out.println(dvd1.getCost());
        Cart order = new Cart();
        order.add(dvd1);
        System.out.println(order.totalcost());
    }
}

