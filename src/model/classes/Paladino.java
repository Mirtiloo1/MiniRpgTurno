package model.classes;

import game.habilidades.HabilidadeEspecial;
import model.Personagem;

public class Paladino extends Personagem implements HabilidadeEspecial {

    public Paladino(String nome, int vida, int magia, int mana, int forca) {
        super(nome, vida, magia, forca, mana);
    }

    @Override
    public void usarHabilidade(Personagem alvo) {

    }

    @Override
    public void atacar(Personagem alvo) {

    }
}
