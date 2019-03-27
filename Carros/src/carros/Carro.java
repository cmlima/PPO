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
public class Carro {
    private double velocidade;
    private Tamanho tamanho;
    private String cor;
    private String forma;
    private Posicao posicao;

    public Carro(double velocidade, Tamanho tamanho, String cor, String forma, Posicao posicao) {
        this.velocidade = velocidade;
        this.tamanho = tamanho;
        this.cor = cor;
        this.forma = forma;
        this.posicao = posicao;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    public String getForma() {
        return forma;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
    
    public void mover() {
        this.posicao.setX(this.posicao.getX() + this.velocidade);
        this.posicao.setY(this.posicao.getY());
    }

    @Override
    public String toString() {
        return "Carro{" + "velocidade=" + velocidade + ", tamanho=" + tamanho + ", cor=" + cor + ", forma=" + forma + ", posicao=" + posicao + '}';
    }
        
}
