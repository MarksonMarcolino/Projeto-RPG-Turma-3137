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
public class AmuletoDaForça2 extends Equipamento{
    private int ForAmu;

    public int getForAmu() {
        return ForAmu;
    }

    public void setForAmu(int ForAmu) {
        this.ForAmu = ForAmu;
    }
    
    public AmuletoDaForça2(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Amuleto da Força +2");
        this.setDescricaoEquip("Uma versão melhorada do Amuleto da Força.");
        this.setLvlmin(3);
        this.setPeso(1);
        this.setClassificacao(EnumClassificacao.ACESSORIO);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(0);
        this.setForAmu(4);
    }
    
}
