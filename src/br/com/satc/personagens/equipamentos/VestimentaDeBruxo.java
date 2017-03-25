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
public class VestimentaDeBruxo extends Equipamento{
    private int MrVestimenta;

    public int getMrVestimenta() {
        return MrVestimenta;
    }

    public void setMrVestimenta(int MrVestimenta) {
        this.MrVestimenta = MrVestimenta;
    }
    
    public VestimentaDeBruxo(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setLvlmin(1);
        this.setClassificacao(EnumClassificacao.ARMADURA);
        this.setRaridade(EnumRaridade.COMUM);
        this.setDefesa(3);
        this.setDescricaoEquip("Vestimenta usada nas batalhas nórdicas à muito tempo atrás");
        this.setNomeEquip("Vestimenta de Bruxo");
        this.setPeso(3);
        this.setMrVestimenta(6);
    }
    
}
