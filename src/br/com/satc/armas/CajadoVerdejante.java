/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.armas;

import static br.com.satc.armas.EnumCategoria.CAJADO;
import static br.com.satc.armas.EnumRaridade.COMUM;

/**
 *
 * @author andre
 */
public class CajadoVerdejante extends Arma {
    
    public CajadoVerdejante(String nome, String descricao, EnumCategoria categoria, EnumRaridade raridade, int peso, int dano, int critico, int lvlNecessario) {
        super(nome, descricao, categoria, raridade, peso, dano, critico, lvlNecessario);
        
        this.setNome("Cajado Verdejante");
        this.setDescricao("Um cajado retorcido feito de galhos velhos de carvalho, emana alguma energia da natureza e é usado por "
                + "discípulos e aventureiros iniciantes.");
        this.setCategoria(CAJADO);
        this.setRaridade(COMUM);
        this.setPeso(4);
        this.setDano(5);
        this.setCritico(2);
        this.setLvlNecessario(1);
        
    }
    
    
}
