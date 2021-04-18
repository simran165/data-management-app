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
public class Main {
    public static void main(String[] args) throws Exception{
        DBConnect connect= new DBConnect();
        connect.getData();
        
   
        
        UISelection frame2 = new UISelection();
        frame2.setVisible(true);
        
  
    }
//        public static void click(){
//            
//        }
    }
    

    

