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
public class Jertseak extends Produktuak {
    private String taila; //38, 40, 42, 44...
    
    public Jertseak () {
        super();
        setTaila();
    }
    
    public Jertseak (String kodea, String marka, double prezioa, String kolorea, String sexua, int kantStock, String taila) {
        super(kodea, marka, prezioa, kolorea, sexua, kantStock);
        this.taila=taila;
    }
    
    public Jertseak (String kodea, String sexua, double prezioa, String sasoia) {
        super(kodea, sexua, prezioa);
    }
    
    /* METODOAK */
    @Override
    public void printDatuak() {
        
        super.printDatuak();
        System.out.println("Taila: "+taila);
        System.out.println();
    }
    public void prodKontsultatu() {
        super.prodKontsultatu();
        setTaila();
//        if (this.kodPro != null)
//            System.out.println(this.kodPro);
    }
    
    /* GETTER and SETTER */
    public String getTaila() {
        return taila;
    }

    public void setTaila() {
        try {
            System.out.print("Sartu taila (S,M,L,XL,XXL): ");
            this.taila = br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    } 
    
}
