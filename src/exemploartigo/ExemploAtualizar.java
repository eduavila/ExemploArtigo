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
public class ExemploAtualizar {
    
    public static void main(String[] args){
          
        com.db4o.ObjectContainer db =  Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "banco");
        
        Contato contato =new Contato();
        contato.setNomeCompleto("João Pedro");
        contato.setNumero(0);
        
        
        ObjectSet result = db.queryByExample(contato);
        
        Contato contatoAtulizado = (Contato) result.next();
        
        contatoAtulizado.setNumero(333554);
        
        db.store(contatoAtulizado);
               
        db.close();
        
        
    }


}
