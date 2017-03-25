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
public class BotasDeElfo extends Equipamento{
    private int MrBota;

    public int getMrBota() {
        return MrBota;
    }

    public void setMrBota(int MrBota) {
        this.MrBota = MrBota;
    }
    
    public BotasDeElfo(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Botas de Elfo");
        this.setDescricaoEquip("Um par de botas leve e confortável feito para os pés de um elfo. ");
        this.setLvlmin(3);
        this.setPeso(2);
        this.setClassificacao(EnumClassificacao.SAPATO);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(3);
        this.setMrBota(8);
    }
    
}
