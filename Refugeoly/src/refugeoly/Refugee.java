
package refugeoly;

/**
 *
 * @author bille
 */
class Refugee implements MoneyReceiver,MoneyGiver{
    
public String Name;
public int money;
public int expenses;
public int extralife;



public Refugee(String Name, int money, int expenses, int extralife){
this.Name = Name;
this.money = money;
this.expenses = expenses;
this.extralife = extralife;
}    

 public void receiveMoney(int i){
 money = money + i;
 }

public void paymoney(int a){    
receiveMoney(a);
}
 
   

@Override
    public void giveMoney() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receiveMoney() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    







}
