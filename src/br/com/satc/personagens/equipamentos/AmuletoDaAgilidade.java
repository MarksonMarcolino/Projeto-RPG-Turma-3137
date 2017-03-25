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
public class AmuletoDaAgilidade extends Equipamento{
    private int AgiAmu;

    public int getAgiAmu() {
        return AgiAmu;
    }

    public void setAgiAmu(int AgiAmu) {
        this.AgiAmu = AgiAmu;
    }
    
    public AmuletoDaAgilidade(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Amuleto da Agilidade");
        this.setDescricaoEquip("Usado por Usain Bolt para dar sorte em suas corridas.");
        this.setLvlmin(3);
        this.setPeso(1);
        this.setClassificacao(EnumClassificacao.ACESSORIO);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(0);
        this.setAgiAmu(4);
    }
    
}
