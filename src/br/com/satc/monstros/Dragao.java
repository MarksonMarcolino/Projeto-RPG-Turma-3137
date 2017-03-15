/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.monstros;

import br.com.satc.personagens.*;

/**
 *
 * @author Brayan Bertan
 */
public class Dragao extends Monstros{

    public Dragao(int drop, String descricao, int exp, int lvl, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(drop, descricao, exp, lvl, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
    }

   //Drop:200
    //Descrição:Os dragões são criaturas miticas, muitas vezes descritas como a primeira raça que aparece no mundo. com vidas que duram milhares de anos.
    //Este aspecto dos Dragões faz deles muito mais que um combatente desafiador. Eles são sábios e oráculos, fontes de sabedoria e profetas do que ainda está por vir. Seu próprio surgimento pode ser um presságio de sorte ou azar.
    //int exp:Exp do nivel *0,45

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    @Override
    public void ataquesespeciais() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //Nome:Bafo Flamejante
        //Habilidade ativa
         //Efeito:Solta uma bola de fogo no oponente
         //Inflinge 32 de dano   mais 40% caso o oponente use armadura metalica
         //Custo de mana:20
    }

    @Override
    public void habilidadesespeciais() {
        throw new UnsupportedOperationException("Not supported yet."); 
            //Habilidade area:voar
    }
   

}
