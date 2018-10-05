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


public class Orm extends HusDjuren{
    
    public Orm(String namn, int vikt) {
        super(namn,vikt);
//        this.vikt = vikt;
        mat = 20;
        matNamn = "Ormpellets";
        
    }
    
    @Override
    public void setMatVikt(int vikt){
    mat = 20;
    }
    @Override
    public void setRiktigMat(){
    matNamn = "ormpellets";
    }
    @Override
    public void ändringVIkt(int vikt){
        this.vikt = vikt;
    }
    
       public void ändradVIkt(int vikt){
        this.vikt = vikt;
         setMatVikt(vikt);
    }

}
