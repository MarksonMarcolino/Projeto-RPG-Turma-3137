/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.equipamentos;

/**
 *
 * @author Usuario
 */
public class CapaceteDeFerro extends Equipamento{
    
    public CapaceteDeFerro(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setClassificacao(EnumClassificacao.CAPACETE);
        this.setDefesa(8);
        this.setDescricaoEquip("Capacete de ferro fundido");
        this.setLvlmin(1);
        this.setNomeEquip("Capacete de Ferro");
        this.setPeso(5);
        this.setRaridade(EnumRaridade.COMUM); 
    } 
    
}
