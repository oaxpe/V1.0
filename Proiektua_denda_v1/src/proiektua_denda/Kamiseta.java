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
public class Kamiseta extends Produktuak {
    private String taila;
    private String sasoia; // uda, negua...
    
    public Kamiseta () {
        super();
        setTaila();
        setSasoia();
    }
    
    public Kamiseta (String kodea, String marka, double prezioa, String kolorea, String sexua, int kantStock, String taila, String sasoia) {
        super(kodea, marka, prezioa, kolorea, sexua, kantStock);
        this.taila=taila;
        this.sasoia=sasoia;
    }
    
    public Kamiseta (String kodea, String sexua, double prezioa, String sasoia) {
        super(kodea, sexua, prezioa);
        this.sasoia=sasoia;
    }
    
    /* METODOAK */
    @Override
    public void printDatuak() {
        super.printDatuak();
        System.out.println("Taila: "+taila);
        System.out.println("Sasoia: "+sasoia);
    }
    
    @Override
    public void prodKontsultatu() {
        super.prodKontsultatu();
        setTaila();
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

    public String getSasoia() {
        return sasoia;
    }

    public void setSasoia() {
        try {
            System.out.print("Sartu sasoia (uda, negua...): ");
            this.sasoia = br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }

    public void setTaila(String taila) {
        this.taila = taila;
    }

    public void setSasoia(String sasoia) {
        this.sasoia = sasoia;
    }

}
