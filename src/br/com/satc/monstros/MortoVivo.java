/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.monstros;

import br.com.satc.personagens.Personagem;

/**
 *
 * @author Brayan Bertan
 */
public class MortoVivo extends Monstros {

    public MortoVivo(int drop, String descricao, int exp, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte, int lvl) {
        super(drop, descricao, exp, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte, lvl);
        this.setNome("Morto Vivo");
        this.setDescricao("Um Morto vivo");
        this.setExp(164); 
        this.setLvl(6);
        this.setDrop(85);
        this.setForca(10);
        this.setAgilidade(10);
        this.setVitalidade(45);
        this.setInteligencia(1);
        this.setDestreza(1);
        this.setSorte(1);
    }



    @Override
    public void atacar(Personagem personagem) {
        System.out.println("Morto vivo usou Ataque Basico");
        personagem.receberDano(55);
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ataquesespeciais(Personagem personagem) {
        System.out.println("Morto Vivo usou Arranhar");
        //Habilidade ativa.
        personagem.receberDano(110);
        //Efeito: Provoca sangramento, removendo 5% da vida do oponente no fim de cada turno por 3 turnos.  
        //Cooldown: 3 turnos.
    }

    @Override
    public void habilidadesespeciais(Personagem personagem) {
        System.out.println("Morto Vivo usou Mordida");
        //Habilidade ativa.
        personagem.receberDano(240);
        //Requisitos:Só pode ser usado proximo a um cadaver.
        //Efeito: Se alimenta de um cadaver proximo recuperando 80 de vida por turno por até 3 turnos.
        //Cooldown: 5 turnos.
    }
    
}

