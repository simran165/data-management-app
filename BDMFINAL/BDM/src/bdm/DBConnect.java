
package bdm;

import java.sql.*;
public class DBConnect {

   private Connection con;
   private Statement st;
   private ResultSet rs;
    public DBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdm_final","root","");
            st = con.createStatement();
        
        }
        catch(Exception ex){
            System.out.print("Exception :"+ex);
        }
    }
    public void getData(){
        try{
           // String q1= "Insert into customer values (1,'sidhu moosewala','12 32 street', '3144344343')";
        
            String query = "Select * from customerdata LIMIT 0,100";
           // st.executeUpdate(q1);
            rs = st.executeQuery(query);
            System.out.println("Records from Database");
            while(rs.next()){
                String id = rs.getString("C_ID");
                String name = rs.getString("C_Name");
                String city = rs.getString("City");
                String state= rs.getString("State");
                String country= rs.getString("Country");
                String postal= rs.getString("Postal_Code");
                String region= rs.getString("Region");
                System.out.println("ID: "+ id+ " Name: "+name+ " city: "+ city +"  state : "+ state+ " country : " + country+ "  potal code: "+ postal+ "  region: "+ region);
            }
        }
        catch(Exception ex){
            System.out.println("Exception :" +ex);
        }
    }
     public int inserttodb( String user_id, String user_name, String user_city, String user_state, String user_country, String user_zip, String user_region) {
		int inserted = 0;
                int counter =1;
		try {
			String query = "insert into customerdata(C_ID,C_Name,City,State,Country,Postal_Code,Region) values(?,?,?,?,?,?,?) ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user_id);
                        ps.setString(2, user_name);
			
			ps.setString(3, user_city);
                        ps.setString(4, user_state);
                        ps.setString(5, user_country);
                        ps.setString(6, user_zip);
                         ps.setString(7, user_region);
			inserted = ps.executeUpdate();
                        System.out.println("Records inserted successfully");
		} catch (Exception e) {

			e.printStackTrace();
		}

		return inserted;
	}
     public int deletefromdb(String user_id, String user_name, String user_city, String user_state, String user_country, String user_zip, String user_region) {
		int deleted = 0;
		try {
			String query = "DELETE FROM customerdata where(C_ID = ? and C_Name = ?) ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user_id);
                        ps.setString(2, user_name);
			deleted = ps.executeUpdate();
                        System.out.println("Records deleted successfully");
		} catch (Exception e) {

			e.printStackTrace();
		}

		return deleted;
	}

    /**
     *
     * @param product_name
     * @param product_name
     * @param product_category
     * @param product_subcategory
     * @return
     */
    public int insertproducttodb( String product_name, String product_category, String product_subcategory) {
		int inserted = 0;
                int counter =1;
		try {
			String query = "insert into productdata(P_Name,Catgory,SubCategory) values(?,?,?) ";
			PreparedStatement ps1 = con.prepareStatement(query);
			//ps.setString(0, user_id);
                        ps1.setString(1, product_name);
			
			ps1.setString(2, product_category);
                        ps1.setString(3, product_subcategory);
                       
			inserted = ps1.executeUpdate();
                        System.out.println("Products Records inserted successfully");
		} catch (Exception e) {

			e.printStackTrace();
		}

		return inserted;
	}

    int deleteProductfromdb(String product_name, String product_category, String product_subcategory) {
       int deleted1 = 0;
		try {
			String query = "DELETE FROM productdata where (P_Name = ? and Catgory=? and SubCategory=?) ";
			PreparedStatement ps = con.prepareStatement(query);
			//ps.setString(0, user_id);
                     PreparedStatement ps1 = con.prepareStatement(query);
			//ps.setString(0, user_id);
                        ps1.setString(1, product_name);
			
			ps1.setString(2, product_category);
                        ps1.setString(3, product_subcategory);
			deleted1 = ps.executeUpdate();
                        System.out.println("Records deleted successfully");
		} catch (Exception e) {

			e.printStackTrace();
		}

		return deleted1;
	}
     public int insertSalestodb( String OrderID, String CustomerID, String Quantity, String Profit, String ShippingCost, String Discount, String ProductID) {
		int inserted = 0;
                int counter =1;
		try {
			String query = "insert into salesdata(OrderID,CustomerID,Quantity,Profit,ShipingCost,Discount,ProductID) values(?,?,?,?,?,?,?) ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, OrderID);
                        ps.setString(2, CustomerID);
			
			ps.setString(3, Quantity);
                        ps.setString(4, Profit);
                        ps.setString(5, ShippingCost);
                        ps.setString(6, Discount);
                         ps.setString(7,ProductID);
			inserted = ps.executeUpdate();
                        System.out.println("Records inserted successfully");
		} catch (Exception e) {

			e.printStackTrace();
		}

		return inserted;
	}
     
     int deletesalesfromdb(String OrderID, String CustomerID, String Quantity, String Profit, String ShippingCost, String Discount, String ProductID) {
       int deleted2 = 0;
		try {
			String query = "DELETE FROM salessdata where (OrderID = ? and CustomerID=? ) ";
			PreparedStatement ps = con.prepareStatement(query);
			//ps.setString(0, user_id);
                     PreparedStatement ps2 = con.prepareStatement(query);
			//ps.setString(0, user_id);
                        ps2.setString(1, OrderID);
                        ps2.setString(2, CustomerID);
			
			ps2.setString(3, Quantity);
                        ps2.setString(4, Profit);
                        ps2.setString(5, ShippingCost);
                        ps2.setString(6, Discount);
                         ps2.setString(7,ProductID);
			deleted2 = ps.executeUpdate();
                        System.out.println("Records deleted successfully");
		} catch (Exception e) {

			e.printStackTrace();
		}

		return deleted2;
	}
     public int insertordertodb(String O_ID, String O_Date, String O_ShipDate,String Quantity,String OrderPriority,String ProdID) {
		int inserted = 0;
                int counter =1;
		try {
			String query = "insert into ordersdata(O_ID, O_Date,O_ShipDate,Quantity,OrderPriority,ProdID) values(?,?,?,?,?,?) ";
			PreparedStatement ps3 = con.prepareStatement(query);
			ps3.setString(1, O_ID);
                        ps3.setString(2, O_Date);
			
			ps3.setString(3, O_ShipDate);
                        ps3.setString(4, Quantity);
                        ps3.setString(5, OrderPriority);
                        ps3.setString(6, ProdID);
             
			inserted = ps3.executeUpdate();
                        System.out.println("Records inserted successfully");
		} catch (Exception e) {

			e.printStackTrace();
		}

		return inserted;
	}
     int deleteorderfromdb(String O_ID, String O_Date, String O_ShipDate,String Quantity,String OrderPriority,String ProdID) {
       int deleted2 = 0;
		try {
			String query = "DELETE FROM ordersdata where (O_ID = ? and ProdID=? ) ";
			PreparedStatement ps = con.prepareStatement(query);
			//ps.setString(0, user_id);
                     PreparedStatement ps4 = con.prepareStatement(query);
			//ps.setString(0, user_id);
                       ps4.setString(1, O_ID);
                        ps4.setString(2, O_Date);
			
			ps4.setString(3, O_ShipDate);
                        ps4.setString(4, Quantity);
                        ps4.setString(5, OrderPriority);
                        ps4.setString(6, ProdID);
			deleted2 = ps4.executeUpdate();
                        System.out.println("Records deleted successfully");
		} catch (Exception e) {

			e.printStackTrace();
		}

		return deleted2;
	}
    
}
