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
public class Scutum extends Equipamento{
    
    public Scutum(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Scutum");
        this.setClassificacao(EnumClassificacao.ESCUDO);
        this.setDefesa(13);
        this.setDescricaoEquip("Do latim, Scutu");
        this.setLvlmin(1);
        this.setRaridade(EnumRaridade.COMUM);
        this.setPeso(6);
    }
    
}
