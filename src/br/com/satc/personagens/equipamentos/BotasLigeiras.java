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
public class BotasLigeiras extends Equipamento{
    private int AgiBota;

    public int getAgiBota() {
        return AgiBota;
    }

    public void setAgiBota(int AgiBota) {
        this.AgiBota = AgiBota;
    }
    
    public BotasLigeiras(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setClassificacao(EnumClassificacao.SAPATO);
        this.setDefesa(0);
        this.setDescricaoEquip("Botas do Usain Bolt");
        this.setLvlmin(1);
        this.setNomeEquip("Botas Ligeiras");
        this.setPeso(2);
        this.setRaridade(EnumRaridade.COMUM);
        this.setAgiBota(5);
    }
    
}
