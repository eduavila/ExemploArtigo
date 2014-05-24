/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploartigo;

import com.db4o.*;

import java.util.List;

/**
 *
 * @author eduardo
 */
public class ExemploRecuperar {
    
    
  
    
    
    
    public static void main(String[] args){
        ObjectContainer db =  Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "banco");
        
        Contato contato = new Contato();
        contato.setNomeCompleto(null);
        contato.setNumero(0);
        
        ObjectSet result = db.queryByExample(contato);
        
         for (Object o : result) {
                System.out.println(o);
         }
        
        
        
        db.close();
    }
    
    
    
    
    
    
    
}
