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
public class CapaDoAventureiro extends Equipamento{
    private int DesCapa;

    public int getDesCapa() {
        return DesCapa;
    }

    public void setDesCapa(int DesCapa) {
        this.DesCapa = DesCapa;
    }
    
    public CapaDoAventureiro(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setClassificacao(EnumClassificacao.CAPA);
        this.setDefesa(0);
        this.setDescricaoEquip("Capa do maior aventureiro e explorador do mundo!");
        this.setLvlmin(1);
        this.setNomeEquip("Capa do Aventureiro");
        this.setPeso(2);
        this.setRaridade(EnumRaridade.COMUM);
        this.setDesCapa(4);
    }
    
}
