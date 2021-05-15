/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Repositories.ChatRepository;
import java.util.ArrayList;
import java.util.List;
import objetosNegocio.Chat;
/**
 *
 * @author Dany
 */
public class ControlChats {
    ChatRepository chatsRepository;
    
    public ControlChats(){
        this.chatsRepository=new ChatRepository();
    }
    
    public boolean guardar(Chat chat) {
        return this.chatsRepository.guardar(chat);
    }

    
    public boolean actualizar(Chat chat) {
       return this.chatsRepository.actualizar(chat);
    }

    
    public Chat buscarporID(long id) {
        return this.chatsRepository.buscarporID(id);
    }


    public ArrayList<Chat> buscarTodas() {
        return this.chatsRepository.buscarTodas();
    }


    public List<Chat> buscarComo(String busqueda) {
        return this.chatsRepository.buscarComo(busqueda);
    }    
}
