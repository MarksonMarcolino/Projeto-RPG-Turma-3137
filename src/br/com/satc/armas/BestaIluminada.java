/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.armas;

import static br.com.satc.armas.EnumCategoria.BESTA;
import static br.com.satc.armas.EnumRaridade.RARO;

/**
 *
 * @author Edutec
 */
public class BestaIluminada extends Arma{

    public BestaIluminada(String nome, String descricao, EnumCategoria categoria, EnumRaridade raridade, int peso, int dano, float critico, int lvlNecessario) {
        super(nome, descricao, categoria, raridade, peso, dano, critico, lvlNecessario);
        this.setNome("Besta Iluminada");
        this.setDescricao("Muito mais que um arco qualquer, esta besta tem um poder de incomparavel."
                +" Possuidora de flechas de luz com dano imenso, não queira estar no caminho de seu controlador"
                +" quando seu ataque critar.");
        this.setCategoria(BESTA);
        this.setRaridade(RARO);
        this.setPeso(6);
        this.setDano(25);
        this.setCritico(1.7f);
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
