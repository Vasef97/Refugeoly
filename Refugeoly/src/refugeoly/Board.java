/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugeoly;

import java.util.ArrayList;

/**
 *
 * @author bille
 */
public class Board {
    
    
public int position;    
    
    

ArrayList<Square> square = new ArrayList<>(39);

    public Board(int i) {
     this.position=i;   
    }

    
    
public void addSquare(int arithmos, String keimeno ){
 square.add(new Square(arithmos, keimeno));    
 }
public void getSquare(int i){
 System.out.println(square.get(i));
 }      
    
    

  


 

    
    
    
}
