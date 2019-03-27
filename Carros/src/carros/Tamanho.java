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
public class Tamanho {
    private double largura;
    private double altura;

    public Tamanho(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }
    
    public double getLargura() {
        return largura;
    }

    public final void setLargura(double largura) {
        if (largura < 0) {
            System.err.println("Largura inválida");
        } else {
            this.largura = largura;            
        }
    }

    public double getAltura() {
        return altura;
    }

    public final void setAltura(double altura) {
        if (altura < 0) {
            System.err.println("Largura inválida");
        } else {
            this.altura = altura;            
        }
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Tamanho{" + "largura=" + largura + ", altura=" + altura + '}';
    }
        
}
