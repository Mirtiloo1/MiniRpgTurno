package model;

import game.habilidades.HabilidadeEspecial;

public class Guerreiro extends Personagem implements HabilidadeEspecial {

    public Guerreiro(String nome, int pontosDeVida, int magia, int forca) {
        super(nome, pontosDeVida, magia, forca);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.getForca() * 2;
        System.out.println(nome + " ataca com sua espada!");
        alvo.receberDano(dano);
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        int dano = this.getForca() * 4;
        System.out.println(nome + " executa um ataque furioso!");
        this.pontoDeVida -= 25;
        alvo.receberDano(dano);
    }
}
