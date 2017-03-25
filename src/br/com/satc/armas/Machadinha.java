/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.armas;

import static br.com.satc.armas.EnumCategoria.MACHADO;
import static br.com.satc.armas.EnumRaridade.COMUM;

/**
 *
 * @author andre
 */
public class Machadinha extends Arma{
    
    public Machadinha(String nome, String descricao, EnumCategoria categoria, EnumRaridade raridade, int peso, int dano, int critico, int lvlNecessario) {
        super(nome, descricao, categoria, raridade, peso, dano, critico, lvlNecessario);
        this.setNome("Machadinha");
        this.setDescricao("Um pequeno machado, podendo ser manuseado com apenas uma mão, se tornando mais ágil, porém causando menos dano.");
        this.setCategoria(MACHADO);
        this.setRaridade(COMUM);
        this.setPeso(5);
        this.setDano(10);
        this.setCritico(1.666f);// infernal
        this.setLvlNecessario(1);
    }

    @Override
    public void adicionarPenalidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void adicionarBonus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
