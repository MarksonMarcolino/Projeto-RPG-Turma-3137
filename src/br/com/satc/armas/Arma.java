/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.armas;

/**
 *
 * @author andre
 */
public abstract class Arma implements IArma {
    
    private String nome;
    private String descricao;
    private EnumCategoria categoria;
    private EnumRaridade raridade;
    private int peso;
    private int dano;
    private int danoMagico;
    private float critico;
    
    private int lvlNecessario;
    
    private int valorVenda;
    private int valorCompra;
    
    private int bonusForca; 
    private int bonusAgilidade;
    private int bonusVitalidade;
    private int bonusInteligencia;
    private int bonusDestreza;
    private int bonusSorte;
    
    private int penForca; 
    private int penAgilidade;
    private int penVitalidade;
    private int penInteligencia;
    private int penDestreza;
    private int penSorte;

    public Arma(String nome, String descricao, EnumCategoria categoria, EnumRaridade raridade, int peso, int dano, float critico, int lvlNecessario) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.raridade = raridade;
        this.peso = peso;
        this.dano = dano;
        this.critico = critico;
        this.lvlNecessario = lvlNecessario;
        
        this.valorCompra = 200;
        this.valorVenda = 100;
        
        //Colocando valor padrão nos atributos
        this.bonusForca = 0; 
        this.bonusAgilidade = 0;
        this.bonusVitalidade = 0;
        this.bonusInteligencia = 0;
        this.bonusDestreza = 0;
        this.bonusSorte = 0;
        this.penForca = 0; 
        this.penAgilidade = 0;
        this.penVitalidade = 0;
        this.penInteligencia = 0;
        this.penForca = 0;
        this.penDestreza = 0;
        this.penSorte = 0;        
    }

    public int getDanoMagico() {
        return danoMagico;
    }

    public void setDanoMagico(int danoMagico) {
        this.danoMagico = danoMagico;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EnumCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumCategoria categoria) {
        this.categoria = categoria;
    }

    public EnumRaridade getRaridade() {
        return raridade;
    }

    public void setRaridade(EnumRaridade raridade) {
        this.raridade = raridade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public float getCritico() {
        return critico;
    }

    public void setCritico(float critico) {
        this.critico = critico;
    }

    public int getLvlNecessario() {
        return lvlNecessario;
    }

    public void setLvlNecessario(int lvlNecessario) {
        this.lvlNecessario = lvlNecessario;
    }

    public int getBonusForca() {
        return bonusForca;
    }

    public void setBonusForca(int bonusForca) {
        this.bonusForca = bonusForca;
    }

    public int getBonusAgilidade() {
        return bonusAgilidade;
    }

    public void setBonusAgilidade(int bonusAgilidade) {
        this.bonusAgilidade = bonusAgilidade;
    }

    public int getBonusVitalidade() {
        return bonusVitalidade;
    }

    public void setBonusVitalidade(int bonusVitalidade) {
        this.bonusVitalidade = bonusVitalidade;
    }

    public int getBonusInteligencia() {
        return bonusInteligencia;
    }

    public void setBonusInteligencia(int bonusInteligencia) {
        this.bonusInteligencia = bonusInteligencia;
    }

    public int getBonusDestreza() {
        return bonusDestreza;
    }

    public void setBonusDestreza(int bonusDestreza) {
        this.bonusDestreza = bonusDestreza;
    }

    public int getBonusSorte() {
        return bonusSorte;
    }

    public void setBonusSorte(int bonusSorte) {
        this.bonusSorte = bonusSorte;
    }

    public int getPenForca() {
        return penForca;
    }

    public void setPenForca(int penForca) {
        this.penForca = penForca;
    }

    public int getPenAgilidade() {
        return penAgilidade;
    }

    public void setPenAgilidade(int penAgilidade) {
        this.penAgilidade = penAgilidade;
    }

    public int getPenVitalidade() {
        return penVitalidade;
    }

    public void setPenVitalidade(int penVitalidade) {
        this.penVitalidade = penVitalidade;
    }

    public int getPenInteligencia() {
        return penInteligencia;
    }

    public void setPenInteligencia(int penInteligencia) {
        this.penInteligencia = penInteligencia;
    }

    public int getPenDestreza() {
        return penDestreza;
    }

    public void setPenDestreza(int penDestreza) {
        this.penDestreza = penDestreza;
    }

    public int getPenSorte() {
        return penSorte;
    }

    public void setPenSorte(int penSorte) {
        this.penSorte = penSorte;
    }
    
    
}
