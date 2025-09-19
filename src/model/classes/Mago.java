package model.classes;

import game.habilidades.HabilidadeEspecial;
import model.Personagem;

public class Mago extends Personagem implements HabilidadeEspecial {

    public Mago(String nome, int vida, int magia, int forca, int mana) {
        super(nome, vida, magia, forca, mana);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.getMagia() * 2;
        System.out.println(nome + " dispara uma bola de fogo!");
        this.mana -= 2;
        if(this.mana <= 0){
            System.out.println(nome + "Tenta atacar mas não possui mana suficiente.");
        }
        alvo.receberDano(dano);
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        System.out.println(nome + " ativa a benção da cura. +20 de vida");
        this.mana -= 8;
        this.vida += 20;
    }
}
