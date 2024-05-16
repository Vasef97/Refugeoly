/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refugeoly;
import java.util.Random;
/**
 *
 * @author bille
 */
public class RollDiceAction {
    
    
 public int roll(){
 Random rand = new Random(); 
 int rand_int = rand.nextInt(7); 
 return rand_int;
 }   
  
    
}
