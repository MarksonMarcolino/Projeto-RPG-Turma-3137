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
public class BotasDeAço extends Equipamento{
    private int MrAço;

    public int getMrAço() {
        return MrAço;
    }

    public void setMrAço(int MrAço) {
        this.MrAço = MrAço;
    }
    
    public BotasDeAço(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Botas de Aço");
        this.setDescricaoEquip("Bota muito pesada,porém com uma grande resistência.");
        this.setLvlmin(3);
        this.setPeso(5);
        this.setClassificacao(EnumClassificacao.SAPATO);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(8);
        this.setMrAço(3);
    }
    
}
