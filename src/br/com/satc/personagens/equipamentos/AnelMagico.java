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
public class AnelMagico extends Equipamento{
    private int IntAnel;

    public int getIntAnel() {
        return IntAnel;
    }

    public void setIntAnel(int IntAnel) {
        this.IntAnel = IntAnel;
    }
    
    public AnelMagico(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setClassificacao(EnumClassificacao.ACESSORIO);
        this.setDefesa(0);
        this.setDescricaoEquip("Anél do mesmo dono do Amuleto da Inteligência");
        this.setLvlmin(1);
        this.setNomeEquip("Anél Mágico");
        this.setPeso(1);
        this.setRaridade(EnumRaridade.COMUM);
        this.setIntAnel(3);
    }
    
}
