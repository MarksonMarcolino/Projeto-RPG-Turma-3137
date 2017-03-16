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
public class ElementalDoFogoPequeno extends Monstros {

    public ElementalDoFogoPequeno(int drop, String descricao, int exp, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte, int lvl) {
        super(drop, descricao, exp, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte, lvl);
        this.setNome("Dragonete Raivoso");
        this.setDescricao("Dragonete enfurecido com mandibulas fortes, garras afiadas e escamas resistentes.");
        this.setExp(1353); 
        this.setLvl(9);
        this.setDrop(150);
        this.setForca(3);
        this.setAgilidade(5);
        this.setVitalidade(45);
        this.setInteligencia(10);
        this.setDestreza(8);
        this.setSorte(3);
    }

    @Override
    public void atacar(Personagem personagem) {
        System.out.println("Elemental Do Fogo Pequeno usou Ataque Basico");
        personagem.receberDano(70);
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ataquesespeciais(Personagem personagem) {
        System.out.println("Elemental Do Fogo Pequeno usou Lançar Chamas");
        //Habilidade ativa.
        personagem.receberDano(140);  
        //Cooldown: 3 turnos.
    }

    @Override
    public void habilidadesespeciais(Personagem personagem) {
        System.out.println("Elemental Do Fogo Pequeno usou Explosão de Fogo");
        //Habilidade ativa.
        personagem.receberDano(270);  
        //Cooldown: 3 turnos.
    }
    
}
