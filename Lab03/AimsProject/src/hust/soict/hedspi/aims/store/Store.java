package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS_ITEMS = 100;

    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_ITEMS];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd == null) {
            System.out.println("Cannot add a null DVD.");
            return;
        }

        if (qtyInStore >= MAX_NUMBERS_ITEMS) {
            System.out.println("The store is almost full.");
            return;
        }

        itemsInStore[qtyInStore] = dvd;
        qtyInStore++;
        System.out.println("The DVD has been added to the store.");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }

                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("The DVD has been removed from the store.");
                return;
            }
        }

        System.out.println("The DVD is not found in the store.");
    }
}
