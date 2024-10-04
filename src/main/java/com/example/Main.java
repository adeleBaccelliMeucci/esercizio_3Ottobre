package com.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world! INIZIO");

        Cestino c = new Cestino(0); //metto il cestino =0

        Persona p1 = new Persona(c, 1000); //persona con n monete
        Persona p2 = new Persona(c, 1000);
        //c è un oggetto, il cestino è in comune

        p1.start();
        p2.start();

        p1.join(); //aspetta che finiscano i thread
        p2.join();

        System.out.println( c.getCestino() );

    }
}