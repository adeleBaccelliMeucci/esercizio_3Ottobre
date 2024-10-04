package com.example;

public class Cestino {
    private int contatore;

    public int getCestino(){
        return contatore;
    }

    public Cestino(int contatore){
        this.contatore = contatore;
    }

    public void agiungiMoneta(){
        contatore = contatore + 1;
    }
}
