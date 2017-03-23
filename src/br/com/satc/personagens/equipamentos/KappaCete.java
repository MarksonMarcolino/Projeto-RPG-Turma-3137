/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.equipamentos;

/**
 *
 * @author Edutec
 */
public class KappaCete extends Equipamento{

    public KappaCete(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setDefesa(6);
        this.setDescricaoEquip("Capacete forjado no monte Tartagon por Oden, Mestre da Forja");
        this.setLvlmin(1);
        this.setNomeEquip("KappaCete");
        this.setPeso(4);
        this.setRaridade(EnumRaridade.COMUM);
    }
    
}
