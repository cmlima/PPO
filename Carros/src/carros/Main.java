/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author lab801
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro fusca = new Carro(25.5, new Tamanho(10,10), "Azul", "Fusca", new Posicao(10,20));
        fusca.mover();
        System.out.println(fusca.toString());
    }
    
    
    
}
