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

/**
 *
 * @author Administrador
 */
public class LangBezDenKudeatu {

    /**
     * @throws java.io.IOException
     * @throws java.text.ParseException
     */
    public static void langBezDenKudeatu() throws IOException, ParseException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int aukera = 0;        
        Denda denda1 = new Denda(); // Dendaren datuak sortu.    
        
        // Bezeroak, langileak eta denda kudeatu.
        do {
            System.out.print("\n"
                    + "*****************************************\n"
                    + "*     LANGILEAK, BEZEROAK eta DENDA     *\n"
                    + "*                KUDEATU                *\n"
                    + "*****************************************\n"
                    + "* Zer egin nahi duzu?                   *\n"
                    + "*    0.- Irten.                         *\n"
                    + "*    1.- Bezero berri bat gehitu.       *\n"
                    + "*    2.- Langile berri bat gehitu.      *\n"
                    + "*    3.- Dendaren datuak kontsultatu.   *\n"
                    + "*    4.- Dendaren datuak aldatu.        *\n"
                    + "*****************************************\n"
                    + "Aukeratu: ");
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
            
            char balidazioa='e';
            
            switch (aukera) {
                // 0.- Irten
                case 0:
                    pausa();
                    System.exit(0);
                    break;

                // 1.- Bezero berri bat gehitu
                case 1:
                    Bezeroa bez1 = new Bezeroa();
                    do {
                        System.out.println("\nEremua: Bezeroa");
                        bez1.printDatuak();
                        System.out.print("Datu hauek sartu dituzu. Egokiak dira? (Bai(b)/Ez(e)) ");
                        do {
                            if (balidazioa != 'b' && balidazioa != 'e')
                                System.out.print("Datu hauek sartu dituzu. Egokiak dira? (Bai(b)/Ez(e)) ");
                            balidazioa = br.readLine().toLowerCase().charAt(0);
                        } while (balidazioa != 'b' && balidazioa != 'e');

                        if (balidazioa=='e') {
                            System.out.print("Zer aldatu nahi duzu?\n"
                                    + "(0) Ezer.\n"
                                    + "(1) Kodea.\n"
                                    + "(2) Izen Abizenak.\n"
                                    + "(3) NAN-a.\n"
                                    + "(4) Jaiotze data.\n"
                                    + "(5) Sexua.\n"
                                    + "(6) Herria.\n"
                                    + "(7) Telefonoa.\n"
                                    + "Aukeratu: ");
                            int aldaketa=0;
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
                                    System.out.println("Ez duzu aldaketarik egin.");
                                    break;
                                case 1:
                                    bez1.setKodBez();
                                    break;
                                case 2:
                                    bez1.setIzena();
                                    bez1.setAbizena1();
                                    bez1.setAbizena2();
                                    break;
                                case 3:
                                    bez1.setNan();
                                    break;
                                case 4:
                                    bez1.setJaiotzeData();
                                    break;
                                case 5:
                                    bez1.setSexua();
                                    break;
                                case 6:
                                    bez1.setHerria();
                                    break;
                                case 7:
                                    bez1.setTelefonoa();
                                    break; 
                            }
                        }

                    } while (balidazioa == 'e');
                    pausa();
                    break;

                // 2.- Langile berri bat gehitu    
                case 2:
                    System.out.print("Langile berri bat gehitu behar duzu.\n\n"
                            + "*************************\n"
                            + "    0.- Irten.\n"
                            + "    1.- Saltzailea.\n"
                            + "    2.- Garbitzailea.\n"
                            + "*************************\n"
                            + "Aukeratu: ");
                    int langMota=0;
                    try {
                        langMota = Integer.parseInt(br.readLine());
                    }
                    catch (NumberFormatException datuOkerrak) {
                                System.out.println("Zenbaki bat sartu behar zenuen.");
                    }
                    catch (IOException gaizki) {
                        System.out.println("Arazoak daude datuak sartzerakoan.");
                    }
                    System.out.println();
                    switch (langMota) {
                        // Langilea, saltzailea bada:
                        case 1:
                            System.out.println("Saltzaile berriaren datuak sartu behar dituzu.");
                            Saltzailea saltz = new Saltzailea();
                            do {
                                System.out.println("\nEremua: Saltzailea");
                                saltz.printDatuak();
                                System.out.print("Datu hauek sartu dituzu. Egokiak dira? (Bai(b)/Ez(e)) ");
                                do {
                                    if (balidazioa != 'b' && balidazioa != 'e')
                                        System.out.print("Datu hauek sartu dituzu. Egokiak dira? (Bai(b)/Ez(e)) ");
                                    balidazioa = br.readLine().toLowerCase().charAt(0);
                                } while (balidazioa != 'b' && balidazioa != 'e');
                                
                                if (balidazioa=='e') {
                                    System.out.print("Zer aldatu nahi duzu?\n"
                                            + "(0) Ezer.\n"
                                            + "(1) Kodea.\n"
                                            + "(2) Izen Abizenak.\n"
                                            + "(3) NAN-a.\n"
                                            + "(4) Jaiotze data.\n"
                                            + "(5) Sexua.\n"
                                            + "(6) Herria.\n"
                                            + "(7) Telefonoa.\n"
                                            + "(8) Soldata.\n"
                                            + "Aukeratu: ");
                                    int aldaketa=0;
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
                                            saltz.setKodLan();
                                            break;
                                        case 2:
                                            saltz.setIzena();
                                            saltz.setAbizena1();
                                            saltz.setAbizena2();
                                            break;
                                        case 3:
                                            saltz.setNan();
                                            break;
                                        case 4:
                                            saltz.setJaiotzeData();
                                            break;
                                        case 5:
                                            saltz.setSexua();
                                            break;
                                        case 6:
                                            saltz.setHerria();
                                            break;
                                        case 7:
                                            saltz.setTelefonoa();
                                            break;
                                        case 8:
                                            saltz.setSoldata();
                                            break;  
                                    }
                                }
                                
                            } while (balidazioa == 'e'); 
                            break;
                           
                        // Langilea, garbitzailea bada:
                        case 2:
                            System.out.println("Garbitzaile berriaren datuak sartu behar dituzu.");
                            Garbitzailea garb = new Garbitzailea();
                            do {
                                System.out.println("\nEremua: Garbitzailea");
                                garb.printDatuak();
                                System.out.print("Datu hauek sartu dituzu. Egokiak dira? (Bai(b)/Ez(e)) ");
                                do {
                                    if (balidazioa != 'b' && balidazioa != 'e')
                                        System.out.print("Datu hauek sartu dituzu. Egokiak dira? (Bai(b)/Ez(e)) ");
                                    balidazioa = br.readLine().toLowerCase().charAt(0);
                                } while (balidazioa != 'b' && balidazioa != 'e');
                                if (balidazioa=='e') {
                                    System.out.print("Zer aldatu nahi duzu?\n"
                                            + "(0) Ezer.\n"
                                            + "(1) Kodea.\n"
                                            + "(2) Izen Abizenak.\n"
                                            + "(3) NAN-a.\n"
                                            + "(4) Jaiotze data.\n"
                                            + "(5) Sexua.\n"
                                            + "(6) Herria.\n"
                                            + "(7) Telefonoa.\n"
                                            + "(8) Soldata.\n"
                                            + "Aukeratu: ");
                                    int aldaketa=0;
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
                                            garb.setKodLan();
                                            break;
                                        case 2:
                                            garb.setIzena();
                                            garb.setAbizena1();
                                            garb.setAbizena2();
                                            break;
                                        case 3:
                                            garb.setNan();
                                            break;
                                        case 4:
                                            garb.setJaiotzeData();
                                            break;
                                        case 5:
                                            garb.setSexua();
                                            break;
                                        case 6:
                                            garb.setHerria();
                                            break;
                                        case 7:
                                            garb.setTelefonoa();
                                            break;
                                        case 8:
                                            garb.setSoldata();
                                            break;
                                    }
                                }
                                
                            } while (balidazioa == 'e');
                            break;
                            
                        default:
                            System.out.println("Zenbaki okerra sartu duzu. Saiatu berriro!");
                    }
                    pausa();
                    break;
                // Dendaren datuak kontsultatu.
                case 3:
                    denda1.printDatuak();
                    pausa();
                    break;
                
                // Dendaren datuak aldatu.
                case 4:
                    System.out.print("Zer aldatu nahi duzu?\n"
                            + "(0) Ezer.\n"
                            + "(1) Izena.\n"
                            + "(2) Helbidea.\n"
                            + "(3) Herria.\n"
                            + "(4) Posta kodea.\n"
                            + "(5) Email-a.\n"
                            + "(6) Telefonoa.\n"
                            + "Aukeratu: ");
                    int aldaketa=0;
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
                            denda1.setIzena();
                            break;
                        case 2:
                            denda1.setHelbidea();
                            break;
                        case 3:
                            denda1.setHerria();
                            break;
                        case 4:
                            denda1.setKodPostala();
                            break;
                        case 5:
                            denda1.setEmail();
                            break;
                        case 6:
                            denda1.setTelefonoa();
                            break;
                    }
                    pausa();
                    if (aldaketa>0 && aldaketa<=6) {
                        System.out.println("Aldaketak egin ondoren, dendaren datuak honako hauek dira.");
                        denda1.printDatuak();
                        pausa();
                    }
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



