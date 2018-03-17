/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiektua_denda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
/**
 *
 * @author Administrador
 */
public abstract class Langilea extends Pertsona {
    /* ATRIBUTOAK */
    protected String kodLan;
    protected double soldata;
    
    /* ERAIKITZAILEAK */
    public Langilea () {
        super();
        setKodLan();
        setSoldata();
    }
    
    public Langilea (String kodLan, String izena, String abizena1, String abizena2) {
        super(izena, abizena1, abizena2);
        this.kodLan=kodLan;
    }
    
    public Langilea (String kodLan, String izena, String abizena1, String abizena2, String nan, Date jaiotzeData, String sexua, String herria, String tlf, int soldata) {
        super(izena, abizena1, abizena2, nan, jaiotzeData, sexua, herria, tlf);
        this.soldata=soldata;
        this.kodLan=kodLan;
    }
    
    /* METODOAK */
    @Override
    public void printDatuak() {
        System.out.println("Kodea: "+kodLan);
        super.printDatuak();
        System.out.println("Soldata: "+soldata+"€");
    }    
    
    /* GETTER and SETTER */
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    
    public double getSoldata() {
        return soldata;
    }

    public void setSoldata() {
        try {
            System.out.print("Sartu soldata: ");
            soldata=Double.parseDouble(br.readLine());
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
        catch (NumberFormatException datuOkerrak) {
            System.out.println("Zenbaki dezimala bat sartu behar zenuen.");
        }
    }

    public String getKodLan() {
        return kodLan;
    }

    public void setKodLan() {
        try {
            System.out.print("Sartu langilearen kodea (XXX0000000): ");
            kodLan=br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }

}
