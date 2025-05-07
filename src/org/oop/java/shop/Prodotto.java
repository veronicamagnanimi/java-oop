package org.oop.java.shop;
import java.util.Random;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public int iva;

    //costruttore
    public Prodotto(String nome, String descrizione, double prezzo, int iva){
        Random r = new Random();
        this.codice = r.nextInt(3000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //metodi
    public void nomeEsteso() {
        System.out.println("Il nome completo è " + this.codice + this.nome);
    }

    public void prezzoBase() {
        System.out.println("Il prezzo base è " + this.prezzo);
    }

    public void prezzoIva() {
        double prezzoConIva = this.prezzo + (this.prezzo * this.iva / 100);
        System.out.println("Prezzo con iva: " + prezzoConIva);
    }


}
