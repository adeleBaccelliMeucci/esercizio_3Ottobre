package com.example;

public class Persona extends Thread{
    private Cestino cestino;
    private int monete;

    public Persona(Cestino c, int monete){
        this.cestino = c;
        this.monete = monete;
    }

    public void run (){
        for(int i = 0; i< monete; i++){
            cestino.agiungiMoneta();
        }

    }

    

}
