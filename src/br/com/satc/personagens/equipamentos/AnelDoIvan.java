/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.equipamentos;


public class AnelDoIvan extends Equipamento {
    private int forcaAnel;

    public int getForcaAnel() {
        return forcaAnel;
    }

    public void setForcaAnel(int forcaAnel) {
        this.forcaAnel = forcaAnel;
    }
    
    public AnelDoIvan(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);            
        this.setNomeEquip("Anel Do Ivan");
        this.setPeso(1);
        this.setDescricaoEquip("Anel dourado, liso por fora, e com inscrições por dentro: "
                             + "'VAI CABEÇA DE LAMPADA'. Anel forjado por Ivan, nas provincias de Zueiran");
        this.setLvlmin(1);
        this.setRaridade(EnumRaridade.COMUM);
        this.setClassificacao(EnumClassificacao.ACESSORIO);
        this.setDefesa(0);
        this.setForcaAnel(3);
    }
}
