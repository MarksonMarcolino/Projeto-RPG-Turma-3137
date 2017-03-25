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
public class OrbeSagrado extends Equipamento{
    private int MrOrbe;

    public int getMrOrbe() {
        return MrOrbe;
    }

    public void setMrOrbe(int MrOrbe) {
        this.MrOrbe = MrOrbe;
    }
    
    public OrbeSagrado(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        super(NomeEquip, DescricaoEquip, peso, defesa, lvlmin, Raridade);
        this.setNomeEquip("Orbe Sagrado");
        this.setDescricaoEquip("Orbe usado por sacerdotes em rituais indígenas.");
        this.setLvlmin(3);
        this.setPeso(4);
        this.setClassificacao(EnumClassificacao.ESCUDO);
        this.setRaridade(EnumRaridade.INCOMUM);
        this.setDefesa(4);
        this.setMrOrbe(10);
    }
    
}
