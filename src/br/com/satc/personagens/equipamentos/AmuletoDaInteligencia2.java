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
public class AmuletoDaInteligencia2 extends Equipamento{
    private int IntAmu;

    public int getIntAmu() {
        return IntAmu;
    }

    public void setIntAmu(int IntAmu) {
        this.IntAmu = IntAmu;
    }
    
    public AmuletoDaInteligencia2(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Amuleto da Inteligência +2");
        this.setDescricaoEquip("Uma versão melhorada do Amuleto da Inteligência.");
        this.setLvlmin(3);
        this.setPeso(1);
        this.setClassificacao(EnumClassificacao.ACESSORIO);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(0);
        this.setIntAmu(4);
    }
    
}
