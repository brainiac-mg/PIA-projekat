/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import db.Korisnici;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Brana
 */
@Named(value = "cntrl")
@SessionScoped
public class Controler implements Serializable {

    private String errormsg;
    private String usr;
    private String pass;
    private String tip;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
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
    
    public String logIn(ActionEvent actionEvent){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Transaction tr = s.beginTransaction();
        Korisnici k = (Korisnici) s.load(Korisnici.class, usr);
        System.out.print(k.getIme());
        
        errormsg = "Uspesno!";
        return "index";
    }
    
    public void skip(ActionEvent actionEvent){
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("guest.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(Controler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Controler() {
    }
    
}
