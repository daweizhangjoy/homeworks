/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;


/**
 *
 * @author joy
 */
public class DriverLicense{
    private String licensenumber;
    private String dateissued;
    private String dateexp;
    private String bloodtype;
    private String picture;
    
    public String getlicensenumber(){
        return licensenumber;
    }
    public void setlicensenumber(String licensenumber){
        this.licensenumber= licensenumber;
    }
    public String getdateissued(){
        return dateissued;
    }
    public void setdateissued(String dateissued){
        this.dateissued= dateissued;
    }
    public String getdateexp(){
        return dateexp;
    }
    public void setdateexp(String dateexp){
        this.dateexp =dateexp;
    }
    public String getbloodtype(){
        return bloodtype;
    }
    public void setbloodtype(String bloodtype){
        this.bloodtype= bloodtype;
    }
     public String getpicture(){
        return picture;
    }
    public void setpicture(String picture){
        this.picture= picture;
    }
  
   
}