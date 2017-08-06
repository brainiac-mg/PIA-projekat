package beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Brana
 */
@Named(value = "reg")
@SessionScoped
public class Registrator implements Serializable {

    private String errormsg, usr, pass, cpass, name, sname, email, komp, sex;
    private Date birth;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKomp() {
        return komp;
    }

    public void setKomp(String komp) {
        this.komp = komp;
    }

    public String register(){
        return "index.xhtml";
    }
    
    public Registrator() {
    }

}
