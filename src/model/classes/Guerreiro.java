package model.classes;

import game.habilidades.HabilidadeEspecial;
import model.Personagem;

public class Guerreiro extends Personagem implements HabilidadeEspecial {

    public Guerreiro(String nome, int vida, int magia, int forca, int mana){
        super(nome, vida, magia, forca, mana);
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
        this.vida -= 25;
        alvo.receberDano(dano);
    }
}
