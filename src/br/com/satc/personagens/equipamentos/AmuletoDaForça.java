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
public class AmuletoDaForça extends Equipamento{
    private int ForcaAmuleto;

    public int getForcaAmuleto() {
        return ForcaAmuleto;
    }

    public void setForcaAmuleto(int ForcaAmuleto) {
        this.ForcaAmuleto = ForcaAmuleto;
    }
    
    public AmuletoDaForça(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setClassificacao(EnumClassificacao.ACESSORIO);
        this.setRaridade(EnumRaridade.COMUM);
        this.setDefesa(0);
        this.setDescricaoEquip("Amuleto de um guerreiro morto.");
        this.setLvlmin(1);
        this.setPeso(2);
        this.setNomeEquip("Amuleto da Força");
        this.setForcaAmuleto(3);
    }
    
}
