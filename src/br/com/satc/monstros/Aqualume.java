/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.monstros;

import br.com.satc.personagens.Personagem;

/**
 *
 * @author Edutec
 */
public class Aqualume extends Monstros {

    public Aqualume(int drop, String descricao, int exp, int lvl, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(drop, descricao, exp, lvl, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
        
        this.setDrop(5);
        this.setDescricao("Meio peixe meio vagalume");
    this.setExp(33);
    this.setLvl(2);
    this.setNome("Aqualume");
    this.setForca(5);
    this.setAgilidade(4);
    this.setVitalidade(18);
    this.setInteligencia(2);
    this.setDestreza(5);
    this.setSorte(2);
    }

    @Override
    public void atacar(Personagem personagem) {
          System.out.println("O Aqualume deu um ataque básico:");
          personagem.receberDano(30);         }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ataquesespeciais(Personagem personagem) {
        System.out.println("Jato");
        personagem.receberDano(90);       }

    @Override
    public void habilidadesespeciais(Personagem personagem) {
            //Feixe de luz
            //Efeito: atordoa por 1 turno    }
    
    }
}
