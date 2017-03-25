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
public class ChapeuMagico extends Equipamento{
    private int IntChapeu;

    public ChapeuMagico(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Chapéu Mágico");
        this.setDescricaoEquip("");
        this.setLvlmin(3);
        this.setPeso(2);
        this.setClassificacao(EnumClassificacao.CAPACETE);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(0);
        this.setIntChapeu(6);
    }

    public int getIntChapeu() {
        return IntChapeu;
    }

    public void setIntChapeu(int IntChapeu) {
        this.IntChapeu = IntChapeu;
    }

    
    
}
