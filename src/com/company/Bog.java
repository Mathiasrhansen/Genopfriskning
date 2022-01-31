package com.company;

public class Bog {
    private String titel;
    private int udgivelsesår;
    private int ISBN;

    public Bog(String titel, int udgivelsesår, int ISBN){
        this.ISBN = ISBN;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public String getTitel() {
        return titel;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    @Override
    public String toString(){

    }
}
