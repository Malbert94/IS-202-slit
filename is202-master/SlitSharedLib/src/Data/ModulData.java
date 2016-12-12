/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Date;

/**
 *
 * @author Marti
 */
public class ModulData implements java.io.Serializable{
    
    private int modulNummer;
    
    private Date frist;
    
    private String innhold;

    public int getModul_nummer() {
        return modulNummer;
    }

    public void setModul_nummer(int modul_nummer) {
        this.modulNummer = modul_nummer;
    }

    public Date getFrist() {
        return frist;
    }

    public void setFrist(Date frist) {
        this.frist = frist;
    }

    public String getInnhold() {
        return innhold;
    }

    public void setInnhold(String innhold) {
        this.innhold = innhold;
    }
    
    
}
