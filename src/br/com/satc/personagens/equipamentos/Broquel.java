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
public class Broquel extends Equipamento{
    private int MrBroquel;

    public int getMrBroquel() {
        return MrBroquel;
    }

    public void setMrBroquel(int MrBroquel) {
        this.MrBroquel = MrBroquel;
    }
    public Broquel(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        
        this.setDefesa(9);
        this.setDescricaoEquip("Escudo redondo, feito de madeira e com um circulo metal no centro.");
        this.setLvlmin(1);
        this.setNomeEquip("Broquel");
        this.setPeso(5);
        this.setRaridade(EnumRaridade.COMUM);
        this.setClassificacao(EnumClassificacao.ESCUDO);
        this.setMrBroquel(5);
    }
    
}
