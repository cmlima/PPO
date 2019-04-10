package aps;

public class Monstro {

    private TIPO tipo;
    private String nome;
    private short vida;
    private short ataque;
    private short defesa;
    private short velocidade;
    private Golpe[] golpes;

    public TIPO getTipo() {
        return tipo;
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getVida() {
        return vida;
    }

    public void setVida(short vida) {
        this.vida = vida;
    }

    public short getAtaque() {
        return ataque;
    }

    public void setAtaque(short ataque) {
        this.ataque = ataque;
    }

    public short getDefesa() {
        return defesa;
    }

    public void setDefesa(short defesa) {
        this.defesa = defesa;
    }
    
    public short getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(short velocidade) {
        this.velocidade = velocidade;
    }
    
    public Golpe[] getGolpes() {
        return golpes;
    }

    public void setGolpes(Golpe[] golpes) {
        this.golpes = golpes;
    }

    public Golpe getGolpes(int index) {
        return this.golpes[index];
    }

    public void setGolpes(int index, Golpe golpe) {
        this.golpes[index] = golpe;
    }
    
}
