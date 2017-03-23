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
public class ArmaduraDeOssos extends Equipamento{
   private int mrArmadura;

    public int getMrArmadura() {
        return mrArmadura;
    }

    public void setMrArmadura(int mrArmadura) {
        this.mrArmadura = mrArmadura;
    }
    public ArmaduraDeOssos(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Armadura de Ossos");
        this.setDescricaoEquip("Armadura leve, que utiliza de ossos do "
                             + "peitoral de um dragão ancião");
        this.setDefesa(10);
        this.setLvlmin(2);
        this.setPeso(10);
        this.setRaridade(EnumRaridade.COMUM);
        this.setMrArmadura(5);
    }
    
}
