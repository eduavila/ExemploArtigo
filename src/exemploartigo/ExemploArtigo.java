/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploartigo;

import com.db4o.*;

/**
 *
 * @author Eduardo Avila Malheiros
 */
public class ExemploArtigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        com.db4o.ObjectContainer db =  Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "banco");
        
        // criar novo objeto a partir da classe Contato;
        
        Contato  contato = new Contato();
        
        contato.setNomeCompleto("João Pedro");
        contato.setNumero(659857756);
        
        db.store(contato);
        
        db.close();
        
    }
    
}
