/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Repositories.UsuariosRepository;
import java.util.ArrayList;
import java.util.List;
import objetosNegocio.Usuario;

/**
 *
 * @author Dany
 */
public class ControlUsuarios {
    UsuariosRepository usuariosRepository;
    
    public ControlUsuarios(){
        this.usuariosRepository= new UsuariosRepository();
    }
    
    public boolean guardar(Usuario usuario){
        return this.usuariosRepository.guardar(usuario);
    }
    
    public boolean actualizar(Usuario usuarioActualizado){
        return this.usuariosRepository.actualizar(usuarioActualizado);
    }
    
    public Usuario buscarporID(long id){
         return this.usuariosRepository.buscarporID(id);
    }
    
    public ArrayList<Usuario> buscarTodas(){
        return this.usuariosRepository.buscarTodas();
    } 
    
    public List<Usuario> buscarComo(String busqueda){
        return this.usuariosRepository.buscarComo(busqueda);
    }
    
     public Usuario buscarUsuario(String nomnbreUsuario){
         return this.usuariosRepository.buscarUsuario(nomnbreUsuario);
     }
}
