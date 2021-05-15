/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Repositories.MensajesRepository;
import java.util.ArrayList;
import java.util.List;
import objetosNegocio.Mensaje;

/**
 *
 * @author Dany
 */
public class ControlMensajes {
    MensajesRepository mensajesRepository;
    
    public ControlMensajes(){
        this.mensajesRepository=new MensajesRepository();
    }
    
    public boolean guardar(Mensaje mensaje) {
        return this.mensajesRepository.guardar(mensaje);
    }
    
    public Mensaje buscarporID(long id) {
        return this.mensajesRepository.buscarporID(id);
    }
    
    public ArrayList<Mensaje> buscarTodas() {
        return this.mensajesRepository.buscarTodas();
    }
    
    public List<Mensaje> buscarComo(String busqueda){
        return this.mensajesRepository.buscarComo(busqueda);
    }
}
