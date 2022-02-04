package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Bog Narnia = new Bog("Narnia", 1998, 1234);
        Bog HP1 = new Bog("Harry Potter 1", 2001, 1352);
        Bog HP2 = new Bog("Harry Potter 2", 2002, 1777);
        Bog test1 = new Bog("Java", 2005, 1352);
        Bog test2 = new Bog("Niels", 2019, 1999);

        Bibliotek library = new Bibliotek(new ArrayList<Bog>());
        library.addToLib(HP1);
        library.addToLib(Narnia);
        library.addToLib(HP2);

        library.sameISBN(test1);
        library.sameISBN(test2);*/



    }

    public static void kvadrat(int antalGange, char tegn){

        for (int i = 1; i <= antalGange; i++){
            for (int j = 1; j <= antalGange; j++){
                System.out.print(tegn + " ");
            }
            System.out.println();
        }
    }

    public static void properCase(String ord){
        if (ord.length() <= 3){
            System.out.println(ord.toLowerCase(Locale.ROOT));
        }
        else if (ord.equals(ord.toUpperCase(Locale.ROOT))){
            System.out.println(ord);
        }
        else{
            String output = ord.substring(0,1).toUpperCase(Locale.ROOT) + ord.substring(1);
            System.out.println(output);
        }
    }

    public static void sortering(){
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++){
            String
        }
    }
}
