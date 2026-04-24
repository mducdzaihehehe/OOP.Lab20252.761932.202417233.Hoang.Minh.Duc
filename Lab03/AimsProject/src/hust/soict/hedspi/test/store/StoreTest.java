package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");

        store.addDVD(dvd1);
        store.addDVD(dvd2);

        store.removeDVD(dvd1);
        store.removeDVD(dvd1);
    }
}
