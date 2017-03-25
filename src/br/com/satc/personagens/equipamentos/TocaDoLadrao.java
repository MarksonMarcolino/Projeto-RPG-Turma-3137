/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.equipamentos;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class TocaDoLadrao extends Equipamento{
    private int AgiToca;

    public TocaDoLadrao(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Toca do Ladrão");
        this.setDescricaoEquip("");
        this.setLvlmin(3);
        this.setPeso(3);
        this.setClassificacao(EnumClassificacao.CAPACETE);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(0);
        this.setAgiToca(7);
    }

    public int getAgiToca() {
        return AgiToca;
    }

    public void setAgiToca(int AgiToca) {
        this.AgiToca = AgiToca;
    }
    
}
