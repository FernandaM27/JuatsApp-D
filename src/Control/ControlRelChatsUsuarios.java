/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Repositories.RelChatUsuarioRepository;
import java.util.List;
import objetosNegocio.Chat;
import objetosNegocio.Rel_ChatUsuario;

/**
 *
 * @author Dany
 */
public class ControlRelChatsUsuarios {
    RelChatUsuarioRepository relChatUsuarioRepository;
    
    public ControlRelChatsUsuarios(){
        this.relChatUsuarioRepository=new RelChatUsuarioRepository();
    }
    
    public List<Chat>buscarChatsUsuario(Long id){
        return this.relChatUsuarioRepository.buscarChatsUsuario(id);
    }
    
    public List<Rel_ChatUsuario>buscarTodas(){
        return this.relChatUsuarioRepository.buscarTodas();
    }
    
    public boolean eliminarRelacion(long id){
        return this.relChatUsuarioRepository.eliminar(id);
    }
}
