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
class User {
    private String id;
    private String name;
    private String city;
    private String state;
    private String country;
    private String postcode;
    private String region;
    
    public User(String id, String name, String city, String state, String country, String postcode, String region){
        this.id=id;
        this.name=name;
        this.city=city;
        this.state=state;
        this.country=country;
        this.postcode=postcode;
        this.region=region;
    }

    
    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getcity(){
        return city;
    }
    public String getstate(){
        return state;
    }
    public String getcountry(){
        return country;
    }
    public String getpostcode(){
        return postcode;
    }
    public String getregion(){
        return region;
    }
    
    
}
