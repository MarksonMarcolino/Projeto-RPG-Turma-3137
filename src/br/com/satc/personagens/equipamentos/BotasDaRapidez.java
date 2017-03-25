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
public class BotasDaRapidez extends Equipamento{
    private int AgiRa;

    public int getAgiRa() {
        return AgiRa;
    }

    public void setAgiRa(int AgiRa) {
        this.AgiRa = AgiRa;
    }
    
    public BotasDaRapidez(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Botas da Rapidez");
        this.setDescricaoEquip("Diz a lenda que essa bota pode deixar você bem rápido.");
        this.setLvlmin(3);
        this.setPeso(3);
        this.setClassificacao(EnumClassificacao.SAPATO);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(0);
        this.setAgiRa(7);
    }
    
}
