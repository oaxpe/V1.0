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
public class Hornitzaileak {
    private String kodHor;
    private String izena;
    private String herria;
    private String telefonoa;
    private String email;
    
    public Hornitzaileak () {
        setKodHor();
        setIzena();
        setHerria();
        setTelefonoa();
        setEmail();
    }
    
    public Hornitzaileak (String kodHor, String izena, String herria, String tlf, String email) {
        this.kodHor=kodHor;
        this.izena=izena;
        this.herria=herria;
        this.telefonoa=tlf;
        this.email=email;
    }
    
    /* METODOAK */
    public void printDatuak() {
        System.out.println("Hornitzailearen datuak:");
        System.out.println("\tKodea: "+this.kodHor);
        System.out.println("\tIzena: "+this.izena);
        System.out.println("\tHerria: "+this.herria);
        System.out.println("\tTelefonoa: "+this.telefonoa);
        System.out.println("\tEmail-a: "+this.email);
    }
    
    
    /* GETTER and SETTER */
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

    public String getKodHor() {
        return kodHor;
    }

    public void setKodHor() {
        try {
            System.out.print("Sartu hornitzailearen kodea: ");
            this.kodHor = br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }   
    }
    
    public String getIzena() {
        return izena;
    }

    public void setIzena() {
        try {
            System.out.print("Sartu izena: ");
            this.izena = br.readLine();
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
            this.herria = br.readLine();
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
            System.out.print("Sartu telefonoa: ");
            this.telefonoa = br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        try {
                System.out.print("Sartu email-a: ");
            this.email = br.readLine();
        }
        catch (IOException gaizki) {
            System.out.println("Arazoak daude datuak sartzerakoan.");
        }
    }
}
