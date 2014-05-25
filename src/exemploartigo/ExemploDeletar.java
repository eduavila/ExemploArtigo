/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploartigo;

import com.db4o.*;


/**
 *
 * @author eduardo
 */
public class ExemploDeletar {
    
    public static void main(String[] args){
        // Abrindo arquivo banco de dados.
        ObjectContainer db =  Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "banco");
        
        // criado novo objeto para modelo na recuperação do objeto 
        Contato modeloContato = new Contato();
        modeloContato.setNomeCompleto("João Pedro");
        modeloContato.setNumero(0);
        
        
        ObjectSet result = db.queryByExample(modeloContato);
        
        Contato contato = (Contato) result.next();
        
        
        db.delete(contato);
       
        db.close();
    
    }
    
}
