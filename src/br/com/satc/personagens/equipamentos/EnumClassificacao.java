/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.personagens.equipamentos;

/**
 *
 * @author artur.393414
 */
public enum EnumClassificacao {
    
    SAPATO("Sapato"),ACESSORIO("Acessório"),
    ARMADURA("Armadura"),CAPA("Capa"),
    CAPACETE("Capacete"),ESCUDO("Escudo");

    private String value;
    EnumClassificacao(String value){
        this.value = value;
    }
}
