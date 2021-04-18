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
public class product {
 private String id;
    private String name;
   
    private String category;
    private String subcategory;
   
    
    public product(String id, String name, String category, String subcategory){
        this.id=id;
        this.name=name;
        this.category=category;
        this.subcategory=subcategory;
    }

    
    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getcategory(){
        return category;
    }
    public String getsubcategory(){
        return subcategory;
    }

    
}

