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
public enum EnumRaridade {
    
    COMUM("Comum"),INCOMUM("Incomum"),
    RARO("Raro");

    private String value;
    EnumRaridade(String value){
        this.value = value;
    }
}
