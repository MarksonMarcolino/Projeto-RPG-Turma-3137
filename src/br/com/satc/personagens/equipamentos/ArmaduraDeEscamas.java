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
public class ArmaduraDeEscamas extends Equipamento{
    private int MrEscamas;

    public int getMrEscamas() {
        return MrEscamas;
    }

    public void setMrEscamas(int MrEscamas) {
        this.MrEscamas = MrEscamas;
    }
    
    public ArmaduraDeEscamas(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Armadura de Escamas");
        this.setDescricaoEquip("Uma armadura pesada feita com escamas de vários metais.");
        this.setClassificacao(EnumClassificacao.ARMADURA);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setLvlmin(3);
        this.setPeso(15);
        this.setDefesa(16);
        this.setMrEscamas(7);
    }
    
}
