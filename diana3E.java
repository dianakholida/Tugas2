/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author thosiba
 */
public class adaaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
         for (int a=0;a<=n;a++){
            for (int b=0;b<=n;b++){
              if (b==0 || a==0 ||b==n ||a==n){
                  System.out.print("#");
              }
              else{
                  System.out.print("*");
              }
          }
            System.out.println();
      }
        
    }
    
}
