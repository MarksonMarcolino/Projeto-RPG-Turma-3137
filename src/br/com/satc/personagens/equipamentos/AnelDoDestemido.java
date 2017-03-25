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
public class AnelDoDestemido extends Equipamento{
    private int DesAnel;

    public int getDesAnel() {
        return DesAnel;
    }

    public void setDesAnel(int DesAnel) {
        this.DesAnel = DesAnel;
    }
    
    public AnelDoDestemido(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setClassificacao(EnumClassificacao.ACESSORIO);
        this.setDefesa(0);
        this.setDescricaoEquip("Anél usado no casamento de um aventureiro qualquer");
        this.setLvlmin(1);
        this.setNomeEquip("Anél do Destemido");
        this.setPeso(1);
        this.setRaridade(EnumRaridade.COMUM);
        this.setDesAnel(3);
    }
    
}
