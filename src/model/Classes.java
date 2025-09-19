package model;

import model.classes.Arqueiro;
import model.classes.Guerreiro;
import model.classes.Mago;
import model.classes.Paladino;

public enum Classes {
    MAGO(35, 2, 10, 50) {
        @Override
        public Personagem criarPersonagem(String nome) {
            return new Mago(nome, this.getVida(), this.getMagia(), this.getForca(), this.getMana());
        }
    },
    GUERREIRO(60, 8, 0, 0) {
        @Override
        public Personagem criarPersonagem(String nome) {
            return new Guerreiro(nome, this.getVida(), this.getMagia(), this.getForca(), this.getMana());
        }
    },
    PALADINO(50, 6, 5, 25) {
        @Override
        public Personagem criarPersonagem(String nome) {
            return new Paladino(nome, this.getVida(), this.getMagia(), this.getForca(), this.getMana());
        }
    },
    ARQUEIRO(40, 7, 0, 0) {
        @Override
        public Personagem criarPersonagem(String nome) {
            return new Arqueiro(nome, this.getVida(), this.getMagia(), this.getForca(), this.getMana());
        }
    };

    private final int vida;
    private final int forca;
    private final int magia;
    private final int mana;

    Classes(int vida, int forca, int magia, int mana) {
        this.vida = vida;
        this.forca = forca;
        this.magia = magia;
        this.mana = mana;
    }

    public int getVida() {
        return vida;
    }
    public int getForca() {
        return forca;
    }
    public int getMagia() {
        return magia;
    }
    public int getMana() {
        return mana;
    }

    public abstract Personagem criarPersonagem(String nome);
}