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
public class AnelDoDestemido2 extends Equipamento{
    private int DesAnel;

    public int getDesAnel() {
        return DesAnel;
    }

    public void setDesAnel(int DesAnel) {
        this.DesAnel = DesAnel;
    }
    
    public AnelDoDestemido2(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Anél do Destemido +2");
        this.setDescricaoEquip("Uma versão melhorada do Anél do Destemido.");
        this.setLvlmin(3);
        this.setPeso(1);
        this.setClassificacao(EnumClassificacao.ACESSORIO);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(0);
        this.setDesAnel(4);
    }
    
}
