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
public class CapaDaAgilidade extends Equipamento{
    private int DestrezaCapa, AgilidadeCapa;

    public int getAgilidadeCapa() {
        return AgilidadeCapa;
    }

    public void setAgilidadeCapa(int AgilidadeCapa) {
        this.AgilidadeCapa = AgilidadeCapa;
    }

    public int getDestrezaCapa() {
        return DestrezaCapa;
    }

    public void setDestrezaCapa(int DestrezaCapa) {
        this.DestrezaCapa = DestrezaCapa;
    }
    public CapaDaAgilidade(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        
        this.setDefesa(0);
        this.setDescricaoEquip("Diz a lenda que se a pessoa for a escolhida, a capa concede o poder da invisibilidade");
        this.setLvlmin(1);
        this.setNomeEquip("Capa da Agilidade");
        this.setPeso(2);
        this.setRaridade(EnumRaridade.COMUM);
        this.setDestrezaCapa(4);
        this.setAgilidadeCapa(3);
    }
    
}
