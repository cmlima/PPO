package aps;

public class Golpe {
    
    private String nome;
    private short poder;
    private TIPO tipo;
    private short remanescentes = 10;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public short getPoder() {
        return poder;
    }

    public void setPoder(short poder) {
        this.poder = poder;
    }


    public TIPO getTipo() {
        return tipo;
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }


    public short getRemanescentes() {
        return remanescentes;
    }
    
    public void usar() {
        if (this.remanescentes >= 1) {
            this.remanescentes--;
        }
    }

    
}
