/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiektua_denda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Administrador
 */
public abstract class Pertsona {
    /* ATRIBUTOAK */
    protected String izena;
    protected String abizena1;
    protected String abizena2;
    protected String nan;
    protected Date jaiotzeData;
    protected String sexua;
    protected String herria;
    protected String telefonoa;
    
    /* ERAIKITZAILEAK */
    public Pertsona () {
        setIzena();
        setAbizena1();
        setAbizena2();
        setNan();
        setJaiotzeData();
        setSexua();
        setHerria();
        setTelefonoa();
    }
    
    public Pertsona (String izena, String abizena1, String abizena2) {
        this.izena=izena;
        this.abizena1=abizena1;
        this.abizena2=abizena2;
    }
    
    public Pertsona (String izena, String abizena1, String abizena2, String nan, Date jaiotzeData, String sexua, String herria, String tlf) {
        this.izena=izena;
        this.abizena1=abizena1;
        this.abizena2=abizena2;
        this.nan=nan;
        this.jaiotzeData=jaiotzeData;
        this.sexua=sexua;
        this.herria=herria;
        telefonoa=tlf;
    }
    
    /* METODOAK */
    public void printDatuak() {
        System.out.println("Izen abizenak: "+izena+" "+abizena1+" "+abizena2);
        System.out.println("NAN: "+nan);
        System.out.println("Jaiotze data: "+jaiotzeData);
        System.out.println("Sexua: "+sexua);
        System.out.println("Herria: "+herria);
        System.out.println("Tlf: "+telefonoa);
    }

    
    /* GETTER and SETTER */
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    
    public String getIzena() {
        return izena;
    }

    public void setIzena() {
        try {
            System.out.print("Sartu izena: ");
            izena=br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }      
    }

    public String getAbizena1() {
        return abizena1;
    }

    public void setAbizena1() {
        try {
            System.out.print("Sartu lehenengo abizena: ");
            abizena1=br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }       
    }
    
    public String getAbizena2() {
        return abizena2;
    }

    public void setAbizena2() {
        try {
            System.out.print("Sartu bigarren abizena: ");
            abizena2=br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }
    
    public String getNan() {
        return nan;
    }

    public void setNan() {
        try {
            System.out.print("Sartu NAN zenbakia: ");
            nan=br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }         
    }

    public Date getJaiotzeData() {
        return jaiotzeData;
    }

    public void setJaiotzeData() {
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Sartu jaiotze data (ee/hh/uuuu): ");
            Date fetx = df.parse(br.readLine());
            jaiotzeData=fetx;
        }
        catch (ParseException gaizki) {
            System.out.println("Ez da kapaza sartutako datuak parseatzeko.");
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
            sexua=br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }

    public String getHerria() {
        return herria;
    }

    public void setHerria() {
        try {
            System.out.print("Sartu herria: ");
            herria=br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }  
    }

    public String getTelefonoa() {
        return telefonoa;
    }

    public void setTelefonoa() {
        try {
            System.out.print("Sartu telefono zenbakia: ");
            telefonoa=br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }

}
