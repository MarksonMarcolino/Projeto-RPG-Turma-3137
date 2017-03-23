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
public class AmuletoDaJuventude extends Equipamento{
    private int vitalidadeAmuleto;

    public int getVitalidadeAmuleto() {
        return vitalidadeAmuleto;
    }

    public void setVitalidadeAmuleto(int vitalidadeAmuleto) {
        this.vitalidadeAmuleto = vitalidadeAmuleto;
    }
    public AmuletoDaJuventude(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        
        this.setDefesa(0);
        this.setDescricaoEquip("Amuleto encontrado nas cavernas de Al'Nal");
        this.setLvlmin(1);
        this.setNomeEquip("Amuleto da Juventude");
        this.setPeso(1);
        this.setRaridade(EnumRaridade.COMUM);
        this.setClassificacao(EnumClassificacao.ACESSORIO);
        this.setVitalidadeAmuleto(3); 
    }
    
}
