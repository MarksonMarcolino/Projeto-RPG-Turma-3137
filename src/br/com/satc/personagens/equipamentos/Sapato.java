/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.equipamentos;

import br.com.satc.personagens.Personagem;

/**
 *
 * @author Usuario
 */
public class Sapato extends Personagem{
    
    int peso,velocidadeMovimentoArmor,agilidadeArmor,lvlmin,raridade;

    public Sapato(String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
    }
    
    public void BotasLigeiras(int velocidadeMovimentoArmor, int peso, int agilidadeArmor, int lvlmin, int raridade){
        this.agilidadeArmor = 4;
        this.velocidadeMovimentoArmor = 20;
        this.peso = 2;
        this.lvlmin = 1;
        this.raridade = 1;
    }
    

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
