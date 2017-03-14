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
public class Escudo extends Personagem{
    
    int defesaArmor, zim, defesaMagicaArmor;

    public Escudo(String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
    }
    
    public void Broquel(int defesaArmor,int defesaMagicaArmor, int zim){
        this.defesaArmor = 10;
        this.defesaMagicaArmor = 5;
        this.zim = 2;
        //Requisitos mínimos:
        //LVL = 1
        //Vitalidade = 3
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
