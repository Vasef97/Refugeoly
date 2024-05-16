/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugeoly;


/**
 *
 * @author bille
 */
public class Square {
    
 public int arithmos;
 public String keimeno;
 
 
 
 public Square(int arithmos, String keimeno){
     this.arithmos = arithmos;
     this.keimeno = keimeno;
     }
 
 

 
 
 @Override
 public String toString(){//overriding the toString() method  
  return arithmos+". "+keimeno; }  
    
}
