package com.exam;
// Generated Mar 22, 2019 1:58:40 AM by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;




/**
 * Resume generated by hbm2java
 */

@ManagedBean
@SessionScoped
public class Resume  implements java.io.Serializable {
private List<Resume>list= new ArrayList<>();

     private int id;
     private String firstName;
     private String city;
     private String password;
     private String email;
     private Integer mobile;
     private String zip;

    public Resume() {
    }

	
    public Resume(int id) {
        this.id = id;
    }
    public Resume(int id, String firstName, String city, String password, String email, Integer mobile, String zip) {
       this.id = id;
       this.firstName = firstName;
       this.city = city;
       this.password = password;
       this.email = email;
       this.mobile = mobile;
       this.zip = zip;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getMobile() {
        return this.mobile;
    }
    
    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }
    public String getZip() {
        return this.zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }



public String dosave(){
ResumeDao  d=new ResumeDao ();
d.dosave(this);
return "Resumeupdate1";

}



 
public String update(){
    ResumeDao  d=new ResumeDao ();
  d.update(this);
return "Resumeupdate2";

} 

 
public String delete(){
    ResumeDao  d=new ResumeDao ();
  d.delete(this);
return "Resumeupdate3";

} 

    public List<Resume> getList() {
        ResumeDao  d=new ResumeDao ();
  list=d.show();
        return list;
    }

    public void setList(List<Resume> list) {
        this.list = list;
    }


}


