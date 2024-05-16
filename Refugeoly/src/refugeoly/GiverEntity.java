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
public class GiverEntity implements MoneyGiver {

    
    
    
public String name; 
public int money;  


public GiverEntity(String name, int money){
this.name = name;    
this.money = money;
}
 
 
 public int giveMoney(int i){
 this.money = this.money - i;
 return i;     
 }

   

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 @Override
    public void giveMoney() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

