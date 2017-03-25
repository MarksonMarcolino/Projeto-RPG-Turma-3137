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
public class CapaDoHerói extends Equipamento{
    private int ForCapa;

    public int getForCapa() {
        return ForCapa;
    }

    public void setForCapa(int ForCapa) {
        this.ForCapa = ForCapa;
    }
    
    public CapaDoHerói(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setClassificacao(EnumClassificacao.CAPA);
        this.setDefesa(2);
        this.setDescricaoEquip("Capa de um enunciador de guerra");
        this.setLvlmin(1);
        this.setNomeEquip("Capa do Herói");
        this.setPeso(2);
        this.setRaridade(EnumRaridade.COMUM);
        this.setForCapa(3);
    }
    
}
