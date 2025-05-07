package org.oop.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto shampoo = new Prodotto("Pantene", "Lisci perfetti", 3.99, 20);
        Prodotto balsamo = new Prodotto("Sunsilk", "Ricci definiti", 4.99, 15);

        // metodi
        shampoo.nomeEsteso();
        balsamo.nomeEsteso();

        shampoo.prezzoBase();
        balsamo.prezzoBase();

        shampoo.prezzoIva();
        balsamo.prezzoIva();
    }

}
