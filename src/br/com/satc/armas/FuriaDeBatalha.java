/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.armas;

import static br.com.satc.armas.EnumCategoria.MACHADO;
import static br.com.satc.armas.EnumRaridade.RARO;

/**
 *
 * @author Edutec
 */
public class FuriaDeBatalha extends Arma {
    
    public FuriaDeBatalha(String nome, String descricao, EnumCategoria categoria, EnumRaridade raridade, int peso, int dano, int critico, int lvlNecessario) {
        super(nome, descricao, categoria, raridade, peso, dano, critico, lvlNecessario);
        this.setNome("Fúria de Batalha");
        this.setDescricao("O portador deste poderoso machado ganha a habilidade de cortar pequenas faixas de inimigo ao mesmo tempo.");
        this.setCategoria(MACHADO);
        this.setRaridade(RARO);
        this.setPeso(5);
        this.setDano(22);
        this.setCritico(2.0f);
        this.setLvlNecessario(5);
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
