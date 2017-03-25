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
public class AnelMagico2 extends Equipamento{
    private int IntAnel;

    public int getIntAnel() {
        return IntAnel;
    }

    public void setIntAnel(int IntAnel) {
        this.IntAnel = IntAnel;
    }
    
    public AnelMagico2(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Anél Mágico +2");
        this.setDescricaoEquip("Uma versão melhorada do Anél Mágico.");
        this.setLvlmin(3);
        this.setPeso(1);
        this.setClassificacao(EnumClassificacao.ACESSORIO);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(0);
        this.setIntAnel(4);
    }
    
}
