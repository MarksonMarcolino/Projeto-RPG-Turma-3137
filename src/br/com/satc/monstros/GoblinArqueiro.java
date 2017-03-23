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
public class GoblinArqueiro extends Monstros {
    
        public GoblinArqueiro(int drop, String descricao, int exp, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte, int lvl) {
        super(drop, descricao, exp, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte, lvl);
        this.setNome("Goblin Arqueiro");
        this.setDescricao("Um goblin equipado com um Arco de madeira reforçado.");
        this.setExp(471); 
        this.setLvl(7);
        this.setDrop(102);
        this.setForca(3);
        this.setAgilidade(15);
        this.setVitalidade(45);
        this.setInteligencia(3);
        this.setDestreza(15);
        this.setSorte(8);
    }

    @Override
    public void atacar(Personagem personagem) {
        System.out.println("Goblin Arqueiro usou Ataque Basico");
        personagem.receberDano(60);
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ataquesespeciais(Personagem personagem) {
        System.out.println("Goblin Arqueiro usou Chuva de Flechas");
        //Habilidade ativa.
        personagem.receberDano(120);  
        //Cooldown: 3 turnos.
    }

    @Override
    public void habilidadesespeciais(Personagem personagem) {
        System.out.println("Goblin Arqueiro usou Concentração de Atirador");
        //Habilidade ativa.
        //Aumenta a chance de acerto e o dano das flechas em 50% por 3 turnos.
        //Cooldown: 5 turnos.
    }
}
