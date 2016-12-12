/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Data.ModulData;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Marti
 */
@Remote
public interface ModulSessionBeanRemote {
    
    
    
    
    
    public ModulData getModul(int id);
    
    List<ModulData> getModuler();
    
}
