package ie.nuigalway.ct417project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enda
 */
public class CT417Class {
    
    private String email;
    private String name;
    
    /*
        No args constructor
    */
    public CT417Class(){
        this.email = "something@email.com";
        this.name = "John";        
    }
    
   public String getName(){return name;}
   
   public String getEmail() {return email;}
   
   public void setName(String name)
   {
       this.name = name;
   }
   
   public void setEmail(String email)
   {
       this.email = email;
   }
   
   
}
