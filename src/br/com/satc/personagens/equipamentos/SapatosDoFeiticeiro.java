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
public class SapatosDoFeiticeiro extends Equipamento{
    private int mrSapato;

    public int getMrSapato() {
        return mrSapato;
    }

    public void setMrSapato(int mrSapato) {
        this.mrSapato = mrSapato;
    }
    
    public SapatosDoFeiticeiro(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        
        this.setLvlmin(1);
        this.setDefesa(0);
        this.setNomeEquip("Sapatos do Feiticeiro");
        this.setPeso(3);
        this.setDescricaoEquip("Sapatos feitos do mesmo tecido do tenis de Merlin");
        this.setRaridade(EnumRaridade.COMUM);
        this.setMrSapato(5);
    }
    
}