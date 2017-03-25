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
public class CapaceteDeAço extends Equipamento{
    
    public CapaceteDeAço(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Capacete de Aço");
        this.setDescricaoEquip("Capecete pesado feito de aço para guerreiros da linha de frente.");
        this.setLvlmin(3);
        this.setPeso(6);
        this.setClassificacao(EnumClassificacao.CAPACETE);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(10);
    }
    
    
}
