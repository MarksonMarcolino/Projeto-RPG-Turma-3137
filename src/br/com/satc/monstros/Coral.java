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
public class Coral extends Monstros {

    public Coral(int drop, String descricao, int exp, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte, int lvl) {
        super(drop, descricao, exp, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte, lvl);
        this.setNome("Coral");
        this.setDescricao("Um professor de informatica que bate nos alunos e planeja dominar o mundo");
        this.setExp(500000);
        this.setLvl(101);
        this.setDrop(9000000);
        this.setForca(100);
        this.setAgilidade(100);
        this.setVitalidade(200);
        this.setInteligencia(150);
        this.setDestreza(150);
        this.setSorte(100);
    }


    @Override
    public void atacar(Personagem personagem) {
        System.out.println("Coral usou Ataque Basico");
        personagem.receberDano(500);
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ataquesespeciais(Personagem personagem) {
        System.out.println("Coral usou Tapão nas Costas");
        //Habilidade ativa.
        personagem.receberDano(2000);
        //Efeito: Se Coral for o primeiro a atacar, o dano de Tapão nas costas aumenta em 50%
        //Cooldown: 3 turnos.
    }

    @Override
    public void habilidadesespeciais(Personagem personagem) {
        System.out.println("Coral usou Tããããh Sonico");
        //Habilidade ativa.
        personagem.receberDano(4000);
        //Efeito: Todos os oponentes proximos perdem o proximo turno.  
        //Cooldown: 5 turnos.
    }
    
}

