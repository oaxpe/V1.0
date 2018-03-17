/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiektua_denda;

import java.io.IOException;
import java.util.Date; 

/**
 *
 * @author Administrador
 */
public class Bezeroa extends Pertsona {
    /* ATRIBUTOAK */
    private String kodBez;
    
    /* ERAIKITZAILEAK */
    public Bezeroa () {
        super();
        setKodBez();
    }
    
    public Bezeroa (String izena, String abizena1, String abizena2, String nan, Date jaiotzeData, String sexua, String herria, String tlf, String kodea) {
        super(izena, abizena1, abizena2, nan, jaiotzeData, sexua, herria, tlf);
        this.kodBez=kodea;
    }
    
    /* METODOAK */
    @Override
    public void printDatuak() {
        System.out.println("Kodea: "+kodBez);
        super.printDatuak();
    }
    
    /* GETTER and SETTER */
    public String getKodBez() {
        return kodBez;
    }

    public void setKodBez() {
        try {
            System.out.print("Sartu bezeroaren kodea (XXX0000000): ");
            kodBez=br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }
    
}
