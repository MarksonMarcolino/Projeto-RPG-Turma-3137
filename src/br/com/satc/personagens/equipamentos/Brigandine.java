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
public class Brigandine extends Equipamento{
    private int MrBrigandine;

    public int getMrBrigandine() {
        return MrBrigandine;
    }

    public void setMrBrigandine(int MrBrigandine) {
        this.MrBrigandine = MrBrigandine;
    }
    
    public Brigandine(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Brigandine");
        this.setClassificacao(EnumClassificacao.ARMADURA);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDescricaoEquip("Uma armadura que combina um pano em forma"
                             + " de jaqueta e um metal protetor em chapas metálicas.");
        this.setPeso(10);
        this.setLvlmin(3);
        this.setDefesa(11);
        this.setMrBrigandine(5);
    }
    
}
