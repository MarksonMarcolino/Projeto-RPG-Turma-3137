/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.armas;

import static br.com.satc.armas.EnumCategoria.ARCO;
import static br.com.satc.armas.EnumRaridade.COMUM;

/**
 *
 * @author andre
 */
public class ArcoRecurvo extends Arma {
    
    public ArcoRecurvo(String nome, String descricao, EnumCategoria categoria, EnumRaridade raridade, int peso, int dano, int critico, int lvlNecessario) {
        super(nome, descricao, categoria, raridade, peso, dano, critico, lvlNecessario);
        this.setNome("Arco Recurvo");
        this.setDescricao("Um arco simples e leve, feito para arqueiros iniciantes.");
        this.setCategoria(ARCO);
        this.setRaridade(COMUM);
        this.setPeso(3);
        this.setDano(3);
        this.setLvlNecessario(1);
        this.setCritico(2);        
    }
    
        

    
    
    
}
