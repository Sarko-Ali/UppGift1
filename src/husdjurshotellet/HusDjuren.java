/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package husdjurshotellet;

/**
 *
 * @author Sarko
 */


public abstract class HusDjuren implements DjursVikt{ 
     protected String namn;
     protected int vikt;
     protected int mat;
     protected String matNamn;
    
    
    
    HusDjuren(String namn, int vikt){
        this.namn = namn;
        this.vikt = vikt;
        
    }
    
    HusDjuren(){} // default
    
//      public void utSktiven(){
//        System.out.println(namn + getNamn()+ getVikt());
//    }
    
        public String utSktiven(){
        String m = namn + " ska ha " + (int)getMatVikt() + " gram med " + getMatNamn() + ".";
        return m;
    }

    public String getNamn(){
        return namn;
    }
    
    public double getVikt(){
        return vikt;
    }
    public String getMatNamn(){
         return matNamn;
    }
     public double getMatVikt(){
       return mat;
     }
    
//    public void ändraViktGram(String nyMat){
//        namn = nyMat;
//    }
// public void getMatNamn(String fond){
//        matNamn = fond;
// }
}



