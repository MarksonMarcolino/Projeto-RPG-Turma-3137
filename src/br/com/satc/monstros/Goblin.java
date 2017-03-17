/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.monstros;

import br.com.satc.personagens.Personagem;
import java.util.Random;

/**
 *
 * @author Edutec
 */
public class Goblin extends Monstros{

    public Goblin(int drop, String descricao, int exp, int lvl, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(drop, descricao, exp, lvl, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
        this.setDrop(5);
        this.setDescricao("Um Goblin equipado com uma forte lança");
    this.setExp(19);
    this.setLvl(1);
    this.setNome("Goblin Lanceiro");
    this.setForca(3);
    this.setAgilidade(2);
    this.setVitalidade(9);
    this.setInteligencia(1);
    this.setDestreza(2);
    this.setSorte(1);
    }

     
    @Override
    public void atacar(Personagem personagem) {
          System.out.println("O Goblin deu um ataque básico:");
          personagem.receberDano(25);     }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ataquesespeciais(Personagem personagem) {
        System.out.println("Investida com a lança");
        personagem.receberDano(80);   
    }

    @Override
    public void habilidadesespeciais(Personagem personagem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
