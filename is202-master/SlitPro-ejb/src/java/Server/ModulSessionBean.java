/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Data.ModulData;
import Database.Modul;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Marti
 */
@Stateless
public class ModulSessionBean implements ModulSessionBeanRemote {

    @PersistenceContext(unitName = "SlitPro-ejbPU")
    private EntityManager em;

    

    
    @Override
    public ModulData getModul(int id)
    {        
        Modul modul = em.find(Modul.class, id);
        
        return this.convertModul(modul);
    }    
    
    @Override
    public List<ModulData> getModuler()
    {
        List<ModulData> modulListe = new ArrayList<ModulData>();
        
        try 
        {
            Query query = em.createNamedQuery("Modul.findAll", Modul.class);
            
            List<Modul> moduler = query.getResultList();
            
            for(Modul modul : moduler) {
                modulListe.add(this.convertModul(modul));
            }
             
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return modulListe;
    }        
    
    private ModulData convertModul(Modul modulen)
    {
        ModulData modulData = new ModulData();
        
        modulData.setModul_nummer(modulen.getModulNummer());
        modulData.setFrist(modulen.getFrist());
        modulData.setInnhold(modulen.getInnhold());
        
        return modulData;
        
    }    
    
      


    public void persist(Object object) {
        em.persist(object);
    }

    
}
