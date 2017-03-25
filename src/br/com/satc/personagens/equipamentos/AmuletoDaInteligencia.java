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
public class AmuletoDaInteligencia extends Equipamento{
    private int IntAmuleto;

    public int getIntAmuleto() {
        return IntAmuleto;
    }

    public void setIntAmuleto(int IntAmuleto) {
        this.IntAmuleto = IntAmuleto;
    }
    
    public AmuletoDaInteligencia(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setClassificacao(EnumClassificacao.ACESSORIO);
        this.setRaridade(EnumRaridade.COMUM);
        this.setDefesa(0);
        this.setDescricaoEquip("Amuleto de um mago morto");
        this.setLvlmin(1);
        this.setPeso(1);
        this.setNomeEquip("Amuleto da Inteligência");
        this.setIntAmuleto(3);
    }
    
}
