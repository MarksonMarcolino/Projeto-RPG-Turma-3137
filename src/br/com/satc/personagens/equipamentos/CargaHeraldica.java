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
public class CargaHeraldica extends Equipamento{
    private int MrCargaH;

    public int getMrCargaH() {
        return MrCargaH;
    }

    public void setMrCargaH(int MrCargaH) {
        this.MrCargaH = MrCargaH;
    }
    
    public CargaHeraldica(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setClassificacao(EnumClassificacao.ESCUDO);
        this.setDefesa(8);
        this.setDescricaoEquip("Escudo quase-mágico");
        this.setLvlmin(1);
        this.setNomeEquip("Carga Heráldica");
        this.setPeso(3);
        this.setRaridade(EnumRaridade.COMUM);
        this.setMrCargaH(6);
    }
    
}
