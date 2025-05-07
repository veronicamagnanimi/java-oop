package org.oop.java.shop;

import java.util.Random;

public class Prodotto {
    private int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public int iva;

    // costruttore
    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        Random r = new Random();
        this.codice = r.nextInt(3000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // costruttore 2
    public Prodotto(String nome, String descrizione, double prezzo) {
        this(nome, descrizione, prezzo, 22);
    }

    // getter per il codice (lettura)
    public int getCodice() {
        return this.codice;
    }

    // getter e setter (lettura e scrittura)
    // nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // descrizione
    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    // prezzo
    public double getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    // iva
    public int getIva() {
        return this.iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    // metodi base
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
