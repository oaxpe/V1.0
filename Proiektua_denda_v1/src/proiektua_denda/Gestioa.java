/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiektua_denda;

/**
 *
 * @author Administrador
 */
public class Gestioa {
    
    /* String bat bilatu adibidez kodPro eta taila (string danean)*/
    public static boolean bilatu(String[] arr, String balioa) {
        for (String elementua : arr) {
            if (elementua == balioa) {
                return true;
            }
        }
        return false;
    }
    
    /* int bat bilatu. adibidez taila*/
    public static boolean bilatu(int[] arr, int balioa) {
        for (int elementua : arr) {
            if (elementua == balioa) {
                return true;
            }
        }
        return false;
    }
    
}
