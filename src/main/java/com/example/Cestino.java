package com.example;

public class Cestino {
    private int contatore;

    public int getCestino(){
        return contatore;
    }

    public Cestino(int contatore){
        this.contatore = contatore;
    }

    synchronized public void agiungiMoneta(){ //con synchronized non ci sono problemi di sincronizazione con i thread
        contatore = contatore + 1;
    }
}
