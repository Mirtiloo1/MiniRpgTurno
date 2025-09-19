package model;

public abstract class Personagem {

    public String nome;
    public int vida;
    public int magia;
    public int forca;
    public int mana;

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getMagia() {
        return magia;
    }

    public int getForca() {
        return forca;
    }

    public int getMana() {
        return mana;
    }

    public Personagem(String nome, int vida, int magia, int forca, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.magia = magia;
        this.forca = forca;
        this.mana = mana;
    }

    public void receberDano(int dano){
            this.vida -= dano;
    }

    public boolean isVivo(){
        return this.vida > 0;
    }

    public abstract void atacar(Personagem alvo);
}
