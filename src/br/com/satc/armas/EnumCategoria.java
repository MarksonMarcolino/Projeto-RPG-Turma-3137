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
public enum EnumCategoria {
    
    ARCO("Arco"),
    BESTA("Besta"),
    CAJADO("Cajado"),
    VARINHA("Varinha"),
    MACHADO("Machado");
    
    private String valorCategoria;
    EnumCategoria(String valor){
        valorCategoria = valor;
    }

    public String getValorCategoria() {
        return valorCategoria;
    }
    
    
    
}
