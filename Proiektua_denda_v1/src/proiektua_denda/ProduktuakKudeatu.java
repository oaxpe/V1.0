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
public class ProduktuakKudeatu {

    /**
     * @throws java.io.IOException
     * @throws java.text.ParseException
     */
    public static void produktuakKudeatu() throws IOException, ParseException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int aukera = 0;        
        
        /* PRODUKTUAK SORTU */
        Jertseak jertsGiz1 = new Jertseak("1206596-8223", "Ternua", 44.99, "Beltza", "Gizona", 15, "M");
        Kamiseta kamiGiz1 = new Kamiseta("CE5205", "Adidas", 24.99, "Urdina", "Gizona", 15, "L", "Uda");
        Prakak prakGiz1 = new Prakak("1273283-9937", "Ternua", 99.99, "Beltza", "Gizona", 15, 38);
        
        do {
            System.out.print("\n"
                    + "************************************************\n"
                    + "*              PRODUKTUAK KUDEATU              *\n"
                    + "************************************************\n"
                    + "* Zer egin nahi duzu?                          *\n"
                    + "*    0.- Irten                                 *\n"
                    + "*    1.- Produktuak kontsultatu.               *\n"
                    + "*    2.- Produktuak gehitu.                    *\n"
//                    + "*    3.- Produktua saldu.                      *\n" // Salmentak
//                    + "*    4.- Inbentarioa (zer dagoen eta zenbat).  *\n"
//                    + "*    5.- Eskaerak egin.                        *\n"
                    + "************************************************\n\n"
                    + "  Aukeratu: ");
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
                //0.- Irten
                case 0:
                    System.exit(0);

                // 1.- Produktuak kontsultatu.
                case 1:
                {
                    System.out.print("Produktuak kontsultatu behar dituzu.\n\n"
                            + "*************************\n"
                            + "    0.- Irten.\n"
                            + "    1.- Jertsea.\n"
                            + "    2.- Kamiseta.\n"
                            + "    3.- Praka.\n"
                            + "*************************\n"
                            + "Aukeratu: ");
                    int prodMota = 0;
                    try {
                        prodMota = Integer.parseInt(br.readLine());
                    }
                    catch (NumberFormatException datuOkerrak) {
                        System.out.println("Zenbaki bat sartu behar zenuen.");
                    }
                    catch (IOException gaizki) {
                        System.out.println("Arazoak daude datuak sartzerakoan.");
                    }
                    
                    System.out.println();
                    switch (prodMota) {
                        case 1:
//                            jertsGiz1.prodKontsultatu();
                            jertsGiz1.printDatuak();
                            break;
                            
                        case 2:
                            kamiGiz1.printDatuak();
                            break;
                            
                        case 3:
                            prakGiz1.printDatuak();
                            break;
                    }
                    break;
                } // case 1-en bukaera
                
                // 2.- Produktuak gehitu.    
                case 2:
                {
                    System.out.print("Produktu berri bat gehitu behar duzu.\n\n"
                            + "*************************\n"
                            + "    0.- Irten.\n"
                            + "    1.- Jertsea.\n"
                            + "    2.- Kamiseta.\n"
                            + "    3.- Praka.\n"
                            + "*************************\n"
                            + "Aukeratu: ");
                    int prodMota=0;
                    try {
                        prodMota = Integer.parseInt(br.readLine());
                    }
                    catch (NumberFormatException datuOkerrak) {
                        System.out.println("Zenbaki bat sartu behar zenuen.");
                    }
                    catch (IOException gaizki) {
                        System.out.println("Arazoak daude datuak sartzerakoan.");
                    }
                    System.out.println();
                    switch (prodMota) {
                        // Produktua, JERTSEA bada:
                        case 1:
                            System.out.println("Jertse berriaren datuak sartu behar dituzu.");
                            Jertseak jerts1 = new Jertseak();
                            do {
                                System.out.println("Produktua: JERTSEA");
                                jerts1.printDatuak();
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
                                            + "(2) Marka.\n"
                                            + "(3) Prezioa.\n"
                                            + "(4) Kolorea.\n"
                                            + "(5) Sexua.\n"
                                            + "(6) Taila.\n"
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
                                            jerts1.setKodPro();
                                            break;
                                        case 2:
                                            jerts1.setMarka();
                                            break;
                                        case 3:
                                            jerts1.setPrezioa();
                                            break;
                                        case 4:
                                            jerts1.setKolorea();
                                            break;
                                        case 5:
                                            jerts1.setSexua();
                                            break;
                                        case 6:
                                            jerts1.setTaila();
                                            break; 
                                    }
                                }
                                
                            } while (balidazioa == 'e');  
                            break;
                           
                        // Produktua, KAMISETA bada:
                        case 2:
                            System.out.println("Kamiseta berriaren datuak sartu behar dituzu.");
                            Kamiseta kami1 = new Kamiseta();
                            do {
                                System.out.println("Produktua: KAMISETA");
                                kami1.printDatuak();
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
                                            + "(2) Marka.\n"
                                            + "(3) Prezioa.\n"
                                            + "(4) Kolorea.\n"
                                            + "(5) Sexua.\n"
                                            + "(6) Taila.\n"
                                            + "(7) Sasoia.\n"
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
                                            kami1.setKodPro();
                                            break;
                                        case 2:
                                            kami1.setMarka();
                                            break;
                                        case 3:
                                            kami1.setPrezioa();
                                            break;
                                        case 4:
                                            kami1.setKolorea();
                                            break;
                                        case 5:
                                            kami1.setSexua();
                                            break;
                                        case 6:
                                            kami1.setTaila();
                                            break; 
                                        case 7:
                                            kami1.setSasoia();
                                    }
                                }
                                
                            } while (balidazioa == 'e');
                            break;
                        // Produktua, PRAKA bada:
                        case 3:
                            System.out.println("Praka berriaren datuak sartu behar dituzu.");
                            Prakak prak1 = new Prakak();
                            do {
                                System.out.println("Produktua: PRAKA");
                                prak1.printDatuak();
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
                                            + "(2) Marka.\n"
                                            + "(3) Prezioa.\n"
                                            + "(4) Kolorea.\n"
                                            + "(5) Sexua.\n"
                                            + "(6) Taila.\n"
                                            + "(7) Sasoia.\n"
                                            + "Aukeratu: ");
                                    int aldaketa = Integer.parseInt(br.readLine());
                                    switch (aldaketa) {
                                        case 0:
                                            System.out.println("\nEz duzu aldaketarik egin.");
                                            break;
                                        case 1:
                                            prak1.setKodPro();
                                            break;
                                        case 2:
                                            prak1.setMarka();
                                            break;
                                        case 3:
                                            prak1.setPrezioa();
                                            break;
                                        case 4:
                                            prak1.setKolorea();
                                            break;
                                        case 5:
                                            prak1.setSexua();
                                            break;
                                        case 6:
                                            prak1.setTaila();
                                            break; 
//                                        case 7:
//                                            prak1.setSasoia();
//                                            break;
                                    }
                                }
                                
                            } while (balidazioa == 'e');
                            break;
                            
                        default:
                            System.out.println("Zenbaki okerra sartu duzu. Saiatu berriro!");
                    }
                    pausa();
                    break;
                } // case 2-en bukaera
                
                // 3.- Produktua saldu.
//                case 3:
//                {
//                    System.out.print("Produktu bat saldu behar duzu.\n\n"
//                            + "*************************\n"
//                            + "    0.- Irten.\n"
//                            + "    1.- Jertsea.\n"
//                            + "    2.- Kamiseta.\n"
//                            + "    3.- Praka.\n"
//                            + "*************************\n"
//                            + "Aukeratu: ");
//                    prodMota = Integer.parseInt(br.readLine());
//                    System.out.println();
//                    switch (prodMota) {
//                        case 0:
//                            System.exit(0);
//                        case 1:
//                            
//                            break;
//                            
//                        case 2:
//                            
//                            break;
//                        case 3:
//                            
//                            break;
//                    }
//                    break;
//                }   
                // 4.- Inbentarioa.
//                case 4:
//                    
//                    break;
                    
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



