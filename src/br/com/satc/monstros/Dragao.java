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
        this.setDrop(232);
        this.setDescricao("Os dragões são criaturas misticas, muitas vezes descritas como a primeira raça que aparece no mundo. com vidas que duram milhares de anos.\n" +
  "Este aspecto dos Dragões faz deles muito mais que um combatente desafiador. Eles são sábios e oráculos, fontes de sabedoria e profetas do que ainda está por vir. Seu próprio surgimento pode ser um presságio de sorte ou azar.");
    this.setExp(2292);
    this.setLvl(10);
    this.setNome("Dragão Negro Rei Filhote");
    this.setForca(21);
    this.setAgilidade(8);
    this.setVitalidade(80);
    this.setInteligencia(15);
    this.setDestreza(12);
    this.setSorte(4);
    
    }
    

   
   

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    @Override
    public void ataquesespeciais(Personagem personagem) {
        System.out.println("Dragão Negro Rei Filhote soltou um bafo de fogo");
        personagem.receberDano(180);
      
         
    }

    @Override
    public void habilidadesespeciais(Personagem personagem) {
            //Rajada de vento
            //Efeito atordoa por 3 turnos
            
    }

    @Override
    public void atacar(Personagem personagem) {
        personagem.receberDano(70);
    }
   

}
