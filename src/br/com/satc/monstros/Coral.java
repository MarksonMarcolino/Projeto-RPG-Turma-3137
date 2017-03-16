/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.monstros;

/**
 *
 * @author Brayan Bertan
 */
public class Coral extends Monstros {

    public Coral(int drop, String descricao, int exp, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(drop, descricao, exp, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
    }

   
    
    public void Atributos() {
        //Nome: Coral
        //Drop: 500000 Gold
        //Lvl: 101
        //Exp: 2500
        //Força: 100
        //Agilidade: 50
        //Vitalidade: 200
        //Inteligência: 150
        //Destreza: 150
        //Sorte: 50
    }

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Tapão Nas Costas
        //Habilidade ativa.
        //Dano base: 40.
        //Efeito: Se Coral está atras do oponente ele inflige o dobro de dano com o Tapão nas Costas.  
        //Custo de mana: 50.
        //Cooldown: 3 turnos.
    }

    @Override
    public void habilidadesespeciais() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Tããããh Sonico
        //Habilidade ativa.
        //Dano base: 100.
        //Efeito: Todos os oponentes proximos perdem o proximo turno.  
        //Custo de mana: 100.
        //Cooldown: 5 turnos.
    }
    
}

