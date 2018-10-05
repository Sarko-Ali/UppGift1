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




public class Hund extends HusDjuren {
           private final 
                   int MAT = (100);

//    private int hundVikt;
//    private int hundVikt1;
    
    public Hund(String namn, int vikt) {
        super(namn, vikt);
        mat = vikt/MAT;
        matNamn ="kattfoder";
    }
    
    
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














//
//
//
//
//
//public class Hund {
//String namn,namn1;
// int hundVikt = 10;
// int hundVikt1 = 5;
//   public class Hunden{
//   
//      public void Hunder(){
//      System.out.println("man kan skriva ut om man vill");
//}
//
//class Hund1 extends Hund{
//    public void Hunder(){
//    
//vikt = 10/100;
//    System.out.println(hundVikt);
//}
//}
//
//class Hund2 extends Hund{
//
//    public void Hunder(){
//    
//vikt1 = 5/150;
//    System.out.println(hundVikt1);
//}
//}
//   }
//
////protected int HundsFondGram;
////protected String fråga;
////
////void hund (){
////HundsFondGram = 100;
////
////
//////if-eles sats här
////}
//}