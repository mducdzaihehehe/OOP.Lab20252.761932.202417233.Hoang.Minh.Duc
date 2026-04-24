package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "The Lion King",
                "Animation",
                "Roger Allers",
                87,
                19.95f
        );

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Star Wars",
                "Science Fiction",
                "George Lucas",
                87,
                24.95f
        );

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Aladin",
                "Animation",
                18.99f
        );

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        System.out.println();
        cart.print();

        System.out.println();
        System.out.println("Search by id:");
        cart.searchById(dvd1.getId());

        System.out.println();
        System.out.println("Search by title:");
        cart.searchByTitle("war");

        System.out.println();
        System.out.println("Search not found:");
        cart.searchByTitle("unknown");

        System.out.println();
        System.out.println("Remove one disc and print again:");
        cart.removeDigitalVideoDisc(dvd2);
        cart.print();
    }
}
