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
public enum EnumRaridade {
    
    COMUM("Comum"), INCOMUM("Incomum"),
    RARO("Raro");
    
    private String valorRaridade;
    EnumRaridade(String valor){
        valorRaridade = valor;
        
    }

    public String getValorRaridade() {
        return valorRaridade;
    }   
    
}
