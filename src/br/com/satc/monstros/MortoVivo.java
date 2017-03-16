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
public class MortoVivo extends Monstros {

    public MortoVivo(int drop, String descricao, int exp, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(drop, descricao, exp, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
    }

   
  
       public void Atributos() {
        //Nome: Morto Vivo
        //Drop: 45 Gold
        //Lvl: 5
        //Exp: 21
        //Força: 10
        //Agilidade: 5
        //Vitalidade: 20
        //Inteligência: 1
        //Destreza: 2
        //Sorte: 2
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
        //Arranhar
        //Habilidade ativa.
        //Dano base: 20.
        //Efeito: Provoca sangramento, removendo 5% da vida do oponente no fim de cada turno por 3 turnos.  
        //Custo de mana: 50.
        //Cooldown: 3 turnos.
    }

    @Override
    public void habilidadesespeciais() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Regenerar Vida
        //Habilidade ativa.
        //Requisitos:Só pode ser usado proximo a um cadaver.
        //Efeito: Se alimenta de um cadaver proximo recuperando 20% de vida por turno por até 3 turnos.
        //Custo de Mana: 100.
        //Cooldown: 5 turnos.
    }
    
}

