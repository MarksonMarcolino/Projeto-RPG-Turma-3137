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
public class BotaDeFerro extends Equipamento{
    private int MrBota;

    public int getMrBota() {
        return MrBota;
    }

    public void setMrBota(int MrBota) {
        this.MrBota = MrBota;
    }
    
    public BotaDeFerro(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setClassificacao(EnumClassificacao.SAPATO);
        this.setDefesa(5);
        this.setDescricaoEquip("Bota de ferro fundido");
        this.setLvlmin(1);
        this.setNomeEquip("Bota de Ferro");
        this.setPeso(3);
        this.setRaridade(EnumRaridade.COMUM);
        this.setMrBota(2);
    }
    
}
