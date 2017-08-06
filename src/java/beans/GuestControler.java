/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Brana
 */
@Named(value = "gctrl")
@SessionScoped
public class GuestControler implements Serializable {

    private String radio, from, to;
    private Date dep, ret;
    private int adult = 1;
    private boolean direct;

    public boolean isDirect() {
        return direct;
    }

    public void setDirect(boolean direct) {
        this.direct = direct;
    }

    public int getAdult() {
        return adult;
    }

    public void setAdult(int adult) {
        this.adult = adult;
    }

    public Date getDep() {
        return dep;
    }

    public void setDep(Date dep) {
        this.dep = dep;
    }

    public Date getRet() {
        return ret;
    }

    public void setRet(Date ret) {
        this.ret = ret;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public void srch(){
        
    }
    
}
