/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;


import br.com.satc.monstros.Goblin;
import br.com.satc.personagens.Personagem;
import br.com.satc.personagens.guerreiro;
import java.util.Scanner;


/**
 *
 * @author Markson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        int atq;
      guerreiro gu1 = new guerreiro("aaa",5,5,10,5,5,5);
      gu1.setHp(18);
      Goblin go1 = new Goblin(5,"Um Goblin equipado com uma forte lança",19,1,"Goblin Lanceiro",3,2,9,1,2,1);
        System.out.println("HP Inicial:" + gu1.getHp());
      do{
          System.out.println("Digite 1 para ataque básico e 2 para ataque especial");
        atq=oi.nextInt();
        switch(atq) {
            
            case 1: go1.atacar(gu1);
             System.out.println("HP:"+gu1.getHp());
            break;
            case 2:go1.ataquesespeciais(gu1);
             System.out.println("HP:"+gu1.getHp());    
          
        }
      }while(gu1.getHp()>0);
        System.out.println("O goblin derrotou o guerreiro!");
       
        
      
    }
    
}
