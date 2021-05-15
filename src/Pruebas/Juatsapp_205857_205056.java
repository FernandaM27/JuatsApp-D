/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import Enums.Sexo;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import objetosNegocio.Usuario;
import Control.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import objetosNegocio.Chat;
import objetosNegocio.Mensaje;
import objetosNegocio.Rel_ChatUsuario;
/**
 *
 * @author Dany
 */
public class Juatsapp_205857_205056 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControlUsuarios controlUsuarios= new ControlUsuarios();       
        ControlMensajes controlMensajes=new ControlMensajes();
        ControlChats controlChats=new ControlChats();
        ControlRelChatsUsuarios controlRel= new ControlRelChatsUsuarios();
        Chat chat=controlChats.buscarporID(1);
        Usuario usuario=controlUsuarios.buscarporID(1);
        Mensaje mensaje=new Mensaje(usuario, "hola", new Date(), chat);
        chat.agregarMensaje(mensaje);
        controlChats.actualizar(chat);
//        controlUsuarios.guardar(new Usuario("samuel@gmail.com", new GregorianCalendar(1992, 6, 14),
//                Sexo.MASCULINO, "Samuel", "sammyc4"));
//        
//        controlUsuarios.guardar(new Usuario("jose@hotmail.com", new GregorianCalendar(1994, 3, 29),
//                Sexo.MASCULINO, "Edain", "joseda"));
        
////        Chat chat= new Chat();
////        chat.setNombre("A ver si jala");
//        Usuario usuario= controlUsuarios.buscarporID(1);
//        Chat chat= controlChats.buscarporID(1);
//        Mensaje mensaje= new Mensaje(usuario, "Hola", new Date(), chat);
        
//        Rel_ChatUsuario rel= new Rel_ChatUsuario(chat, usuario);
//        chat.addrel(rel);
//        controlChats.guardar(chat);
//        List<Chat>chatsUsuario=controlRel.buscarChatsUsuario(1);
//        for (Chat chat : chatsUsuario) {
//            System.out.println(chat);
//        }
//        Usuario usuario= controlUsuarios.buscarporID(1);
//        Chat chat=controlChats.buscarporID(1);
//        Mensaje mensaje= new Mensaje(usuario,"hola", new Date(),chat);
//        chat.agregarMensaje(mensaje);
//        controlChats.actualizar(chat);
//        Usuario buscado1=controlUsuarios.buscarporID(1);
//        Chat chat= new Chat();
//        chat.setNombre("nose");
//        Rel_ChatUsuario rel1=new Rel_ChatUsuario();
//        rel1.setChat(chat);
//        rel1.setUsuario(buscado1);
//        chat.addrel(rel1);
//        ControlChats controlChats= new ControlChats();
//        controlChats.guardar(chat);
        
    }
    
}
