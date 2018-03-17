/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiektua_denda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public abstract class Produktuak {
    /* ATRIBUTOAK */
    protected String kodPro; // arropak daukan erreferentzia. Adib:  231532-499
    protected String marka;
    protected double prezioa;
    protected String kolorea;
    protected String sexua;
    protected int kantStock;
    protected boolean eskuragai=false;    
    
    
    /* ERAIKITZAILEAK */
    public Produktuak () {
        setKodPro();
        setMarka();
        setPrezioa();
        setKolorea();
        setSexua();
        setKantStock();                
    }
    
    public Produktuak (String kodea, String sexua, double prezioa) {
        this.kodPro=kodea;
        this.sexua=sexua;
        this.prezioa=prezioa;
    }
    
    public Produktuak (String kodea, String marka, double prezioa, String kolorea, String sexua, int kantStock) {
        this.kodPro=kodea;
        this.marka=marka;
        this.prezioa=prezioa;
        this.kolorea=kolorea;
        this.sexua=sexua;
        this.kantStock=kantStock;
    }
    
    /* METODOAK */
    public void printDatuak() {
        System.out.println("\nKodea: "+kodPro);
        System.out.println("Marka: "+marka);
        System.out.println("Prezioa : "+prezioa+"€");
        System.out.println("Kolorea: "+kolorea);
        System.out.println("Sexua: "+sexua);
        System.out.println("Stock-ean: "+kantStock);
    }
    
    public void prodKontsultatu() {
        setKodPro();
    }
    

    /* GETTER and SETTER */
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    
    public String getKodPro() {
        return kodPro;
    }

    public void setKodPro() {
        try {
                System.out.print("Sartu produktuaren kodea (erreferentzia): ");
            this.kodPro=br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka() {
        try {
            System.out.print("Sartu marka: ");
            this.marka=br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }   
    }

    public double getPrezioa() {
        return prezioa;
    }

    public void setPrezioa() {
        try {
            System.out.print("Sartu prezioa: ");
            this.prezioa = Double.parseDouble(br.readLine());
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }

    public String getKolorea() {
        return kolorea;
    }

    public void setKolorea() {
        try {
           System.out.print("Sartu kolorea: ");
            this.kolorea = br.readLine(); 
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }

    public String getSexua() {
        return sexua;
    }

    public void setSexua() {
        try {
            System.out.print("Emakumea edo gizona?: ");
            this.sexua = br.readLine();
        }
        catch (IOException gaizki){
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }  
    }  

    public int getKantStock() {
        return kantStock;
    }

    public void setKantStock() {
        try {
            System.out.print("Sartu Kantitatea: ");
            this.kantStock = Integer.parseInt(br.readLine());
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }

    public boolean isEskuragai() {
        if (getKantStock()>0)
            this.eskuragai=true;
        return this.eskuragai;
    }

    public void setEskuragai(boolean eskuragai) {
        this.eskuragai = eskuragai;
    }
}
