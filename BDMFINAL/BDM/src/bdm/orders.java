/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdm;

/**
 *
 * @author SANDY
 */
class orders {
     private String O_ID;
    private String O_Date;
    private String O_ShipDate;
    private String Quantity;
     private String Priority;
      private String ProdID;
      
   
    
    public orders(String O_ID, String O_Date, String O_ShipDate, String Quantity, String Priority,String ProdID ){
        this.O_ID=O_ID;
        this.O_Date=O_Date;
        
        this.O_ShipDate=O_ShipDate;
         this.Quantity=Quantity;
          this.Priority=Priority;
           this.ProdID=ProdID;
    }

    

   
    
    public String getO_ID(){
        return O_ID;
    }
    public String getO_Date(){
        return O_Date;
    }
     public String getO_ShipDate(){
        return O_ShipDate;
    }
    public String getQuantity(){
        return Quantity;
    }
   
    public String getPriority(){
        return Priority;
    }
    public String getProdID(){
        return ProdID;
    }

   

    
}
