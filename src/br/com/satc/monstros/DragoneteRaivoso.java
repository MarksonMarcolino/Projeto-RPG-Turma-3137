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
public class DragoneteRaivoso extends Monstros {

    public DragoneteRaivoso(int drop, String descricao, int exp, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte, int lvl) {
        super(drop, descricao, exp, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte, lvl);
        this.setNome("Dragonete Raivoso");
        this.setDescricao("Dragonete enfurecido com mandibulas fortes, garras afiadas e escamas resistentes.");
        this.setExp(798); 
        this.setLvl(8);
        this.setDrop(150);
        this.setForca(8);
        this.setAgilidade(8);
        this.setVitalidade(50);
        this.setInteligencia(1);
        this.setDestreza(4);
        this.setSorte(1);
    }

    @Override
    public void atacar(Personagem personagem) {
        System.out.println("Dragonete Raivoso usou Ataque Basico");
        personagem.receberDano(65);
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ataquesespeciais(Personagem personagem) {
        System.out.println("Dragonete Raivoso usou Mordida");
        //Habilidade ativa.
        personagem.receberDano(130);  
        //Cooldown: 3 turnos.
    }

    @Override
    public void habilidadesespeciais(Personagem personagem) {
        System.out.println("Dragonete Raivoso usou Investida Laceradora");
        //Habilidade ativa.
        //Chance de atacar duas vezes
        personagem.receberDano(200);  
        //Cooldown: 5 turnos.
    }
    
}
