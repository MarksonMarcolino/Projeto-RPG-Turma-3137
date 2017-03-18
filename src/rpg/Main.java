/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import br.com.satc.armas.Arma;
import br.com.satc.personagens.Personagem;

/**
 *
 * @author Markson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Personagem p1 = new Personagem("Crodu", 0, 0, 0, 0, 0, 0) {
            @Override
            public void atacar() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
            @Override
            public void bloquear() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }    
    
    
}
