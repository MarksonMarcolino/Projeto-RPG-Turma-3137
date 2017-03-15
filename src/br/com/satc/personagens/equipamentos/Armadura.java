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
public class Armadura extends Personagem{
    
    int defesaArmor,defesaMagicaArmor,peso,lvlmin,vitalidademin,raridade;

    public Armadura(String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
    }
    
    public void ArmaduraLeve(int defesaArmor, int defesaMagicaArmor, int peso, int lvlmin, int vitalidademin, int raridade){
        this.defesaArmor = 13;
        this.defesaMagicaArmor = 5;
        this.peso = 7;
        this.lvlmin = 2;
        this.vitalidademin = 4;
        this.raridade = 2;
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
