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
public class RoupaoDosAprendizes extends Equipamento{
    private int MrRoupao;

    public int getMrRoupao() {
        return MrRoupao;
    }

    public void setMrRoupao(int MrRoupao) {
        this.MrRoupao = MrRoupao;
    }
    
    public RoupaoDosAprendizes(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Roupao dos Aprendizes");
        this.setDescricaoEquip("Roupão usado por elfos aprendizes de uma antiga escola de magia negra.");
        this.setLvlmin(3);
        this.setClassificacao(EnumClassificacao.ARMADURA);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setPeso(5);
        this.setDefesa(5);
        this.setMrRoupao(11);
    }
    
}
