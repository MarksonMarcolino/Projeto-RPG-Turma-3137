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
public class AnelDaJuventude extends Equipamento{
    private int VitAmu;

    public int getVitAmu() {
        return VitAmu;
    }

    public void setVitAmu(int VitAmu) {
        this.VitAmu = VitAmu;
    }
    
    public AnelDaJuventude(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Anel Da Juventude");
        this.setDescricaoEquip("Anél encontrado nas cavernas de Al'Nal.");
        this.setLvlmin(3);
        this.setPeso(1);
        this.setClassificacao(EnumClassificacao.ACESSORIO);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(0);
        this.setVitAmu(4);
    }
    
}
