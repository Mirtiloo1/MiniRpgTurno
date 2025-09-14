package model;

import game.habilidades.HabilidadeEspecial;

public class Mago extends Personagem implements HabilidadeEspecial {

    public int pontosDeMana;
    public Mago(String nome, int pontosDeVida, int magia, int forca, int pontosDeMana) {
        super(nome, pontosDeVida, magia, forca);
        this.pontosDeMana = 50;
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.getMagia() * 2;
        System.out.println(nome + " dispara uma bola de fogo!");
        this.pontosDeMana -= 2;

        if(this.pontosDeMana <= 0){
            System.out.println(nome + "Tenta atacar mas não possui mana suficiente.");
        }
        alvo.receberDano(dano);
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        System.out.println(nome + " ativa a benção da cura. +20 de vida");
        this.pontosDeMana -= 8;
        this.pontoDeVida += 20;
    }
}
