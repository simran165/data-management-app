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
class sales {
    private String OrderID;
    private String CustomerID;
    private String Quantity;
    private String profit;
     private String ShippingCost;
      private String Discount;
       private String ProductID;
   
    
    public sales(String OrderID, String CustomerID, String Quantity,String profit,String ShippingCost,String Discount,String ProductID ){
        this.OrderID=OrderID;
        this.CustomerID=CustomerID;
        this.Quantity=Quantity;
        this.profit=profit;
         this.ShippingCost=ShippingCost;
          this.Discount=Discount;
           this.ProductID=ProductID;
    }

    sales(String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public String getOrderID(){
        return OrderID;
    }
    public String getCustomerID(){
        return CustomerID;
    }
    public String getQuantity(){
        return Quantity;
    }
    public String getProfit(){
        return profit;
    }
    public String getShippingCost(){
        return ShippingCost;
    }
    public String getDiscount(){
        return Discount;
    }

    public String getProductID(){
        return ProductID;
    }

    
}
