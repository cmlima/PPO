/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

/**
 *
 * @author lab801
 */
public class APS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TIPO eletrico = TIPO.ELETRICO;
        TIPO voador = TIPO.VOADOR;
        TIPO grama = TIPO.GRAMA;
        TIPO agua = TIPO.AGUA;
        TIPO fogo = TIPO.FOGO;
        
        System.out.println(eletrico);
        System.out.println(voador);
        System.out.println(grama);
        System.out.println(agua);
        System.out.println(fogo);
        System.out.println(eletrico.ordinal());
        System.out.println(voador.ordinal());
        System.out.println(grama.ordinal());
        System.out.println(agua.ordinal());
        System.out.println(fogo.ordinal());
    }
    
}
