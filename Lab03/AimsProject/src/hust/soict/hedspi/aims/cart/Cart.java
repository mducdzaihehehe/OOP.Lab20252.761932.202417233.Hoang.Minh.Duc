package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (disc == null) {
            System.out.println("Cannot add a null disc.");
            return;
        }

        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full.");
            return;
        }

        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added.");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (dvdList == null) {
            System.out.println("Cannot add a null DVD list.");
            return;
        }

        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    /*
     * Note for Lab03:
     * A varargs version would look like this:
     *
     * public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
     *     for (DigitalVideoDisc dvd : dvdList) {
     *         addDigitalVideoDisc(dvd);
     *     }
     * }
     *
     * However, DigitalVideoDisc[] and DigitalVideoDisc... have the same
     * method signature after compilation, so both cannot exist together
     * in this class. This submitted version keeps the array overload.
     */

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }

                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                return;
            }
        }

        System.out.println("The disc is not found.");
    }

    public float totalCost() {
        float total = 0;

        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }

        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i]);
        }

        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println(itemsOrdered[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No match found for id: " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println(itemsOrdered[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No match found for title: " + title);
        }
    }
}
