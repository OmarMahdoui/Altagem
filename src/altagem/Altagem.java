/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altagem;


import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class Altagem {
    
    /**
     * @param args the command line arguments
     */
    
     
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        
        
        
        
        
        String mString;
        int mIMin;
        int mIMax;
        double mDNumber;
        boolean mBNumberIsInt;
        Scanner in = new Scanner(System.in);
        
      
              System.out.println("Entrer le premier entier Min: ");
              mString = in.next();
              if(numberOrNot(mString)){
                  mDNumber=Double.parseDouble(mString);
              }
              else{
                  do {                      
                       System.out.println("Vous n'avez pas entrer une valeur reeseyer :");
                       mString = in.next();
                  } while (!numberOrNot(mString));
                 mDNumber=Double.parseDouble(mString);
                 
              }
            
        
        mBNumberIsInt=checkNumber(mDNumber);
        if(mBNumberIsInt){
            mIMin=(int)mDNumber;
            System.out.println("Min = "+mIMin);
        }
        else{
            do {                
                System.out.println("la valeur entrer est plus grande q'un entier resseyer :");
                mDNumber=in.nextDouble();
                mBNumberIsInt=checkNumber(mDNumber);
            } while (!mBNumberIsInt);
            mIMin=(int)mDNumber;
            System.out.println("Min = "+mIMin);
           
        }
        
        
       System.out.println("Entrer le deuxieme entier Max: ");
       mString = in.next();
              if(numberOrNot(mString)){
                  mDNumber=Double.parseDouble(mString);
              }
              else{
                  do {                      
                       System.out.println("Vous n'avez pas entrer une valeur reeseyer :");
                       mString = in.next();
                  } while (!numberOrNot(mString));
                 mDNumber=Double.parseDouble(mString);
                 
              }
     
       mBNumberIsInt=checkNumber(mDNumber);
       if(mBNumberIsInt){
            mIMax=(int)mDNumber;
            System.out.println("Max = "+mIMax);
        }
        
        else{
            do {                
                System.out.println("la valeur entrer est plus grande q'un entier resseyer :");
                mDNumber=in.nextDouble();
                mBNumberIsInt=checkNumber(mDNumber);
            } while (!mBNumberIsInt);
            mIMax=(int)mDNumber;
            System.out.println("Max = "+mIMax);
        }
       
      
       if(mIMin>mIMax || mIMin==mIMax){
            do {                
                System.out.println("Max doit etre plus grand que Min reesseyer ");
                mIMax = in.nextInt();
            } while (mIMin>mIMax);
        }
        
        
        displayMagicalNumber(mIMin,mIMax);
    }
    
    
   public static void displayMagicalNumber(int pIMin,int pIMax){
        
        for (int i=pIMin;i<pIMax;i++){
            
            if(i%5==0){
                System.out.println("S");
            }
            if(i%3==0){
                System.out.println("H");
            }
           if(i%3!=0 && i%5!=0){
            System.out.println(i);
           }
        }
      
    }
   
   public static boolean checkNumber(Double pDNumber){
        return !(pDNumber > Integer.MAX_VALUE || pDNumber < Integer.MIN_VALUE);
   }
    static boolean numberOrNot(String input)
    {
        try
        {
            Double.parseDouble(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
    
    
}
