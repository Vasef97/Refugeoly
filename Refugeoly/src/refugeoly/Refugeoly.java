
package refugeoly;
import java.util.Scanner;



public class Refugeoly {

    
    public static void main(String[] args) {
        
        
        
        ReceiverEntity MafiaBank = new ReceiverEntity("Mafia",0);                         //Dhmiourgia trapezwn
        GiverEntity NGOBank = new GiverEntity("NGOBank",10000);
        RollDiceAction Zari = new RollDiceAction();                                       //Dhmiourgia Zariou
        GoToAction MoveTo = new GoToAction();
        
        
        
        System.out.println("Parakalw eisagete ton arithmo twn paixtwn(Ews 4 paixtes)");
        Scanner p1 = new Scanner(System.in);                                              //arithmos paixtwn
        
        int numofplayers = p1.nextInt();
       
        if(numofplayers > 4 || numofplayers<1){
        throw new ArithmeticException("Akatallilos arithmos paixtwn");                    //exception se periptwsi lanthasmenou arithmou
        }
            
      
        Refugee[] Players;                                                                //Dilwsi enos array me antikeimena Refugee
        Players = new Refugee[numofplayers];                                              //Dimiourgia enos array numberofplayers arithmou stoixeiwn Refugee
        String PlayerName;
        
        
        for (int i = 0; i < numofplayers; i++) {
        System.out.println("Parakalw eisagete to onoma tou paixti "+ (i+1));               
        PlayerName = p1.next();
        Players[i] = new Refugee(PlayerName, 10000, 0, 0);                                     //Dimiourgia antikeimenwn Refugee kai eisagwgi onomatos kai arxikou posou..
        }                                                                                //..ston kathe paixti mesw constructor
        
        
        Board[] Boards;                                                                
        Boards = new Board[numofplayers];
        for (int i = 0; i < numofplayers; i++) {
        Boards[i] = new Board(0);                                                      //Dimiourgia antikeimenwn Board gia kathe paixti
        Boards[i].addSquare(0,"Country in conflict.");
        Boards[i].addSquare(1,"Food for the journey.Pay $100.");
        Boards[i].addSquare(2,"Car.You get a free lift.Roll dice.");
        Boards[i].addSquare(3,"Communication gear.Mobile phone and sim card.Pay $300 to the Mafia Bank.");
        Boards[i].addSquare(4,"Army Control.You go back to war box (0).");
        Boards[i].addSquare(5,"Border 1.Go back to war box (0).");
        Boards[i].addSquare(6,"Mafia.Pay 1000$.");
        Boards[i].addSquare(7,"Live Vest.You have an extra life if you land in the sea (Box 10).");
        Boards[i].addSquare(8,"GPS Location.Stay for a turn.");
        Boards[i].addSquare(9,"Boat.Pay 3000$ to the Mafia Bank.Roll dice.");
        Boards[i].addSquare(10,"Dead at Sea.You are dead and out of the game.");
        Boards[i].addSquare(11,"You get sick.Stay one turn.");
        Boards[i].addSquare(12,"You reach an EU coast.Roll dice.");
        Boards[i].addSquare(13,"Tent and sleeping bag.Pay 200$ to the Mafia Bank.t");
        Boards[i].addSquare(14,"Border Police. Stay one turn.");
        Boards[i].addSquare(15,"Border Control 2.Back to Border Control 1.");
        Boards[i].addSquare(16,"Refugee Camp.Pay 500$ to the Mafia bank to leave and roll dice.");
        Boards[i].addSquare(17,"Train.Roll dice.");
        Boards[i].addSquare(18,"Red Cross Shelter.Jump to river crossing box (22).");
        Boards[i].addSquare(19,"Guard Dogs.Stay one turn.");
        Boards[i].addSquare(20,"NGO Support.You receive 1000$ from NGO Bank.");
        Boards[i].addSquare(21,"Theft.You lose 1500$.Place this money in the Players Expenses box.");
        Boards[i].addSquare(22,"River Crossing.Roll dice and go backwards by the number on the dice.");
        Boards[i].addSquare(23,"NGO Lift.Jump to family reunion box (29).");
        Boards[i].addSquare(24,"Border Police.Stay one turn.");
        Boards[i].addSquare(25,"Border Control 3.Back to border 2 (box 15).");
        Boards[i].addSquare(26,"Asylum Paperwork.Pay 1000$ to Mafia Bank.Option A: Pay $1500 to Mafia Bank and roll dice.Option B: Don’t pay and stay 2 turns.");
        Boards[i].addSquare(27,"Storm.Stay one turn.");
        Boards[i].addSquare(28,"UNHCR Aid.Roll dice.");
        Boards[i].addSquare(29,"Family Reunion.Jump to bus box (31).");
        Boards[i].addSquare(30,"Right Wing Militia.Back to Border police box (24).");
        Boards[i].addSquare(31,"Mafia Bus.Pay 800$ to Mafia Bank.Roll dice.");
        Boards[i].addSquare(32,"Government Detention Camp.Stay one turn.");
        Boards[i].addSquare(33,"Asylum Seeker Application rejected.Back to Train box (17) and Roll dice.");
        Boards[i].addSquare(34,"Border Police.Stay one turn.");
        Boards[i].addSquare(35,"Border Control 4.Back to Border 3 (box 25).");
        Boards[i].addSquare(36,"Asylum Seeker Application Approved. You win.");
        Boards[i].addSquare(37,"Mafia.Pay 1000$ to Mafia Bank."); 
        Boards[i].addSquare(38,"Deported.You are sent back to war box (0)."); 
        Boards[i].addSquare(39,"New Home.You are finally accepted. You win.");
        }            
        
       int k = numofplayers - 1; 
        
       for (int i = 0; i<2; i++){
           for (int j = 0; j < numofplayers; j++) {
               
               System.out.println(Players[j].Name +" position is now :"  );
               Boards[j].getSquare(0);
               System.out.println();
               System.out.println(Players[j].Name+" " + k + " rolling Dice..."  );
               System.out.println();
               System.out.println();
               
               Boards[j].position = Boards[j].position + Zari.roll();
               
               
              switch (Boards[j].position){
              
              case 1:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(1);
                   System.out.println();
                   
                   Players[j].money = Players[j].money - 100;
                   Players[j].expenses = Players[j].expenses + 100;
                   
                   break;
    
              case 2:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(2);
                   System.out.println();   
                  
                   break;
                  
              case 3:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(3);
                   System.out.println();   
                   
                   Players[j].money = Players[j].money - 300;
                   Players[j].paymoney(300);
                   Players[j].expenses = Players[j].expenses + 300;
                   MafiaBank.money = MafiaBank.money + 300;
                   
                   break;
              
              case 4:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(4);
                   System.out.println();  
                   
                   Boards[j].position = 0;
                   
                   
                   
                   
                  
                   break;
              case 5:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(5);
                   System.out.println(); 
                   
                   Boards[j].position = 0;
                  
                   break;
                   
              case 6:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(6);
                   System.out.println();   
                   
                    
                   Players[j].money = Players[j].money - 1000;
                   Players[j].paymoney(1000);
                   Players[j].expenses = Players[j].expenses + 1000;
                   MafiaBank.money = MafiaBank.money + 1000;
                   
                   break;     
                   
              case 7:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(7);
                   System.out.println();   
                   
                   Players[j].extralife=1;
                  
                   break;    
                   
              case 8:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(8);
                   System.out.println();   
                  
                   break;   
                   
              case 9:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(9);
                   System.out.println();   
                   
                     
                   Players[j].money = Players[j].money - 3000;
                   Players[j].paymoney(3000);
                   Players[j].expenses = Players[j].expenses + 3000;
                   MafiaBank.money = MafiaBank.money + 3000;
                   
                   break;   
                   
              case 10:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(10);
                   System.out.println();   
                  
                   break;  
                   
              case 11:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(2);
                   System.out.println();   
                  
                   break; 
                   
                   
              case 12:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(2);
                   System.out.println();   
                  
                   break; 
                   
              case 13:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(2);
                   System.out.println();   
                  
                   break; 
                   
                   
              case 14:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(2);
                   System.out.println();   
                  
                   break; 
                   
              case 15:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(2);
                   System.out.println();   
                  
                   break;
                   
                   
              case 16:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(2);
                   System.out.println();   
                  
                   break; 
                   
                   
              case 17:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(2);
                   System.out.println();   
                  
                   break;
                   
              case 18:
                   System.out.println(Players[j].Name +" position is now :"  );
                   Boards[j].getSquare(2);
                   System.out.println();   
                  
                   break; 
                   
                   
                   
              }
             
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
           
           }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
       }
        
       
        for (int i = 0; i < numofplayers; i++) {                                         // Test
        System.out.println(Players[i].Name);  
        System.out.println(Players[i].money); 
        System.out.println(Players[i].expenses);
        Boards[0].getSquare(35);
         System.out.println(NGOBank.money);
         
       int f,j,l;
       f = Zari.roll();
        j = Zari.roll();
         l = Zari.roll();
    System.out.println(f+" "+j+" "+l);
      
       
    
       
        
        
        
        
        
}
    
}




}
