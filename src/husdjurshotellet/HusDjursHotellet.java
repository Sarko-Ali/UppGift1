/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package husdjurshotellet;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Sarko
 */
public class HusDjursHotellet {
HusDjursHotellet(){

 List<HusDjuren> djuren = new LinkedList<>();                    //List för att ddera alla djur hit
        
   HusDjuren djur1=new Hund("Hund Sixten", 5000); // här gör polymorphism 
         djuren.add(djur1);                                 //addera djuren här 
         
         HusDjuren djur2=new Hund("Hund Dogge", 10000); djuren.add(djur2);
         
         HusDjuren djur3=new Katt("Katt Venus", 5000);djuren.add(djur3);
         
         HusDjuren djur4=new Katt("Katt Ove", 3000);djuren.add(djur4);
         
         HusDjuren djur5=new Orm("Orm Hypno", 1000);djuren.add(djur5);
         String djuret = JOptionPane.showInputDialog("Vilket djur ska ha mats?");
         
         int Searching=0;                                                          // variablen kollar om det finns djurens namn 
         for(HusDjuren a: djuren){
             if(djuret.equalsIgnoreCase(a.getNamn())){                          //söker genom djurens namn // polymorphism // anropp HusDjuren
                 JOptionPane.showMessageDialog(null, a.utSktiven());
                 Searching++;
                 break;
             }
         }
         if(Searching==0){                                                           //om sökande misslyckas med fel or 
             String temp="Inget sadant djur hittades som: ";
             temp = djuren.stream().map((a) -> (a.getNamn() + ", ")).reduce(temp, String::concat);
             JOptionPane.showMessageDialog(null, temp);
         }
    }      

    //for(HusDjuren a: djuren){
//                 temp+=(a.getNamn() + ", ");
//             }
//             JOptionPane.showMessageDialog(null, temp);
//         }


/**
 * @param args the command line arguments
 */
public static void main(String[] args) {

HusDjursHotellet p = new HusDjursHotellet();


}
}