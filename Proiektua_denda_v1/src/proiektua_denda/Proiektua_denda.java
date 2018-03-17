/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiektua_denda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import static proiektua_denda.LangBezDenKudeatu.langBezDenKudeatu;
import static proiektua_denda.ProduktuakKudeatu.produktuakKudeatu;

/**
 *
 * @author Administrador
 */
public class Proiektua_denda {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int aukera = 0;
        
        do {
            System.out.print(""
                    + "'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''\n"
                    + "''                     MENU  NAGUSIA                     ''\n"
                    + "'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''\n"
                    + "''  Zer egin nahi duzu?                                  ''\n"
                    + "''    1.- Langileak, bezeroak eta denda kudeatu.         ''\n"
                    + "''    2.- Produktuak kudeatu.                            ''\n"
//                    + "''    3.- Hornitzaileak kudeatu.                         ''\n"
                    + "'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''\n\n"
                    + " Aukeratu: ");
            try {
                aukera = Integer.parseInt(br.readLine());
            }
            catch (NumberFormatException datuOkerrak) {
                System.out.println("Zenbaki bat sartu behar zenuen.");
            }
            catch (IOException gaizki) {
                System.out.println("Arazoak daude datuak sartzerakoan.");
            }
            System.out.println();
            
            switch (aukera) {
                //0.- Irten
                case 0:
                    System.exit(0);

                // 1.- Langileak, bezeroak eta denda kudeatu.
                case 1:
                    langBezDenKudeatu();
                    break;
                    
                // 2.- Produktuak kudeatu.
                case 2:
                    produktuakKudeatu();
                    break;
                    
                case 3:
                    char balidazioa='e';
                    System.out.println("Hornitzaile berriaren datuak sartu behar dituzu.");
                    Hornitzaileak horn1 = new Hornitzaileak();
                    do {
                        horn1.printDatuak();
                        System.out.print("Datu hauek sartu dituzu. Egokiak dira? (Bai(b)/Ez(e)) ");
                        do {
                            if (balidazioa != 'b' && balidazioa != 'e')
                                System.out.print("Datu hauek sartu dituzu. Egokiak dira? (Bai(b)/Ez(e)) ");
                            try {
                                balidazioa = br.readLine().toLowerCase().charAt(0);
                            }
                            catch (IOException gaizki) {
                                System.out.println("Arazoak daude datuak sartzerakoan.");
                            }
                        } while (balidazioa != 'b' && balidazioa != 'e');

                        if (balidazioa=='e') {
                            System.out.print("Zer aldatu nahi duzu?\n"
                                    + "(0) Ezer.\n"
                                    + "(1) Kodea.\n"
                                    + "(2) Izena.\n"
                                    + "(3) Herria.\n"
                                    + "(4) Telefonoa.\n"
                                    + "(5) Email-a.\n"
                                    + "Aukeratu: ");
                            int aldaketa = 0;
                            try {
                                aldaketa = Integer.parseInt(br.readLine());
                            }
                            catch (NumberFormatException datuOkerrak) {
                                System.out.println("Zenbaki bat sartu behar zenuen.");
                            }
                            catch (IOException gaizki) {
                                System.out.println("Arazoak daude datuak sartzerakoan.");
                            }
                            switch (aldaketa) {
                                case 0:
                                    System.out.println("\nEz duzu aldaketarik egin.");
                                    break;
                                case 1:
                                    horn1.setKodHor();
                                    break;
                                case 2:
                                    horn1.setIzena();
                                    break;
                                case 3:
                                    horn1.setHerria();
                                    break;
                                case 4:
                                    horn1.setTelefonoa();
                                    break;
                                case 5:
                                    horn1.setEmail();
                                    break;
                            }
                        }
                       
                    } while (balidazioa == 'e');  
                    
                    break;
                
                default:
                    System.out.println("Zenbaki okerra sartu duzu! Irakurri ondo aukerak eta aukeratu.");
                    pausa();
                    break;
            }
        } while (aukera!=0);
        
    }

    // PAUSA bat egiteko funtzioa
    public static void pausa() throws IOException {
        System.out.println("\nSakatu 'Enter' jarraitzeko...");
        System.in.read();
    }
    
}



