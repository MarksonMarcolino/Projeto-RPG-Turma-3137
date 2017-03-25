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
public class ArmaduraDeFerro extends Equipamento{
    private int MrArmadura;

    public int getMrArmadura() {
        return MrArmadura;
    }

    public void setMrArmadura(int MrArmadura) {
        this.MrArmadura = MrArmadura;
    }
    
    public ArmaduraDeFerro(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setClassificacao(EnumClassificacao.ARMADURA);
        this.setRaridade(EnumRaridade.COMUM);
        this.setDefesa(12);
        this.setDescricaoEquip("Armadura forjada a mão");
        this.setNomeEquip("Armadura de Ferro");
        this.setLvlmin(1);
        this.setPeso(12);
        this.setMrArmadura(5);
    }
    
}
