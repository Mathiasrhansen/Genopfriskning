package com.company;

import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Bog> liste;

    public Bibliotek(ArrayList<Bog> bibliotek){
        this.liste = liste;
    }

    public void addToLib(Bog bog){
        liste.add(bog);
    }

    public boolean sameISBN(Bog other){
        if (liste.contains(other.getISBN())){
            System.out.println("Bingo");
            return true;
        }
        else {
            System.out.println("Forkert");
            return false;
        }
    }
}
