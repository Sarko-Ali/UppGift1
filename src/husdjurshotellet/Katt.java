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



public class Katt extends HusDjuren {
 
private final 
        int MAT =(150);
    
    public Katt(String namn, int vikt ) {
        super(namn, vikt);
      mat = vikt/MAT;
       matNamn ="kattfoder";
    }
    
//    public void run(){
//    }
//    
    
//    public void utSktiven(){
//        System.out.println(getNamn() + 
//                + getVikt());
    @Override
    public void setMatVikt(int vikt){
    mat = vikt * MAT;
    }
    
@Override
    public void setRiktigMat(){
    matNamn ="kattfoder";
    }
    public void changeWight(int vikt){
    this.vikt = vikt;
    
    }
    
@Override
    public void ändringVIkt(int vikt){
    this.vikt = vikt;
    setMatVikt(vikt);
    }


}
