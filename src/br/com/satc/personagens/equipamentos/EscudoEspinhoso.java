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
public class EscudoEspinhoso extends Equipamento{
    
    public EscudoEspinhoso(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Escudo Espinhoso");
        this.setDescricaoEquip("Escudo feito de espinhos..");
        this.setLvlmin(3);
        this.setPeso(7);
        this.setClassificacao(EnumClassificacao.ESCUDO);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(16);
    }
    
}
