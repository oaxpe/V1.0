/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiektua_denda;

import java.io.IOException;

/**
 *
 * @author Administrador
 */
public class Prakak extends Produktuak {
    private int taila; //38, 40, 42, 44...
//    private String sasoia; // uda, negua...
    
    public Prakak () {
        super();
        setTaila();
//        setSasoia(sasoia);
    }
    
    public Prakak (String kodea, String marka, double prezioa, String kolorea, String sexua, int kantStock, int taila/*, String sasoia*/) {
        super(kodea, marka, prezioa, kolorea, sexua, kantStock);
        this.taila=taila;
        //this.sasoia=sasoia;
    }
    
    public Prakak (String kodea, String sexua, double prezioa/*, String sasoia*/) {
        super(kodea, sexua, prezioa);
//        this.sasoia=sasoia;
    }
    
    /* METODOAK */
    @Override
    public void printDatuak() {
        super.printDatuak();
        System.out.println("Taila: "+taila);
//        System.out.println("Sasoia: "+sasoia);
    }
    
    @Override
    public void prodKontsultatu() {
        super.prodKontsultatu();
        setTaila();
    }
    
    
    /* GETTER and SETTER */
    public int getTaila() {
        return taila;
    }

    public void setTaila() {
        try {
            System.out.print("Sartu taila (38,40,42,44,46): ");
            this.taila = Integer.parseInt(br.readLine());
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }

//    public String getSasoia() {
//        return sasoia;
//    }
//
//    public void setSasoia(String sasoia) {
//        this.sasoia = sasoia;
//    }
    
    
}
