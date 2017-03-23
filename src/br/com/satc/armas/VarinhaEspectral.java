/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.armas;

import static br.com.satc.armas.EnumCategoria.VARINHA;
import static br.com.satc.armas.EnumRaridade.RARO;

/**
 *
 * @author andre
 */
public class VarinhaEspectral extends Arma {
    
    public VarinhaEspectral(String nome, String descricao, EnumCategoria categoria, EnumRaridade raridade, int peso, int dano, int critico, int lvlNecessario) {
        super(nome, descricao, categoria, raridade, peso, dano, critico, lvlNecessario);
    
    
        this.setNome("Varinha Espectral");
        this.setDescricao("Formado pelas arvores de Laner, as mais fortes de todos os reinos, "
                + "uma forte arma para canalizar o poder excedente dos druidas. "
                + "A sabedoria dos que a possuem é aumentada assim como suas tecnicas de magia de seu contralador "
                + "devem ser mais elevadas do que o normal.");
        this.setCategoria(VARINHA);
        this.setRaridade(RARO);
        this.setPeso(2);
        //this.setDanoMagico(24);
        this.setDano(5);
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
