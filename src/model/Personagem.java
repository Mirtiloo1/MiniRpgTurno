package model;

public abstract class Personagem {

    protected String nome;
    protected int pontoDeVida;
    protected int magia;
    protected int forca;

    public String getNome() {
        return nome;
    }

    public int getPontoDeVida() {
        return pontoDeVida;
    }

    public int getMagia() {
        return magia;
    }

    public int getForca() {
        return forca;
    }

    public Personagem(String nome, int pontoDeVida, int magia, int forca) {
        this.nome = nome;
        this.pontoDeVida = pontoDeVida;
        this.magia = magia;
        this.forca = forca;
    }

    public void receberDano(int dano){
            this.pontoDeVida -= dano;
    }

    public boolean isVivo(){
        return this.pontoDeVida > 0;
    }

    public abstract void atacar(Personagem alvo);
}
