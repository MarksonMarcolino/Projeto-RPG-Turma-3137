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
public class TocaDeTrapos extends Equipamento{
    private int agiCapacete;

    public int getAgiCapacete() {
        return agiCapacete;
    }

    public void setAgiCapacete(int agiCapacete) {
        this.agiCapacete = agiCapacete;
    }
    
    public TocaDeTrapos(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setClassificacao(EnumClassificacao.CAPACETE);
        this.setDefesa(0);
        this.setDescricaoEquip("Toca estilosa");
        this.setLvlmin(1);
        this.setNomeEquip("Toca de Trapos");
        this.setPeso(2);
        this.setRaridade(EnumRaridade.COMUM);
        this.setAgiCapacete(5);
    }
    
}
