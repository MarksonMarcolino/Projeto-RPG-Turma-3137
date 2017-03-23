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
public abstract class Equipamento{
    String NomeEquip, DescricaoEquip;
    int peso, defesa, lvlmin;
    EnumRaridade Raridade;

    public Equipamento(String NomeEquip, String DescricaoEquip, int peso, int defesa, int lvlmin, EnumRaridade Raridade) {
        this.NomeEquip = NomeEquip;
        this.DescricaoEquip = DescricaoEquip;
        this.peso = peso;
        this.defesa = defesa;
        this.lvlmin = lvlmin;
        this.Raridade = Raridade;
    }
    
    public EnumRaridade getRaridade() {
        return Raridade;
    }

    public void setRaridade(EnumRaridade Raridade) {
        this.Raridade = Raridade;
    }

    public String getNomeEquip() {
        return NomeEquip;
    }

    public void setNomeEquip(String NomeEquip) {
        this.NomeEquip = NomeEquip;
    }

    public String getDescricaoEquip() {
        return DescricaoEquip;
    }

    public void setDescricaoEquip(String DescricaoEquip) {
        this.DescricaoEquip = DescricaoEquip;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getLvlmin() {
        return lvlmin;
    }

    public void setLvlmin(int lvlmin) {
        this.lvlmin = lvlmin;
    }
  
    
}
