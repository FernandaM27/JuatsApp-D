/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import objetosNegocio.Chat;
import objetosNegocio.Rel_ChatUsuario;

/**
 *
 * @author Dany
 */
public class RelChatUsuarioRepository extends BaseRepository<Rel_ChatUsuario>{

    @Override
    public boolean guardar(Rel_ChatUsuario entidad) {
       return true;
    }

    @Override
    public boolean actualizar(Rel_ChatUsuario entidad) {
        return true;
    }

    public boolean eliminar(long id){
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Rel_ChatUsuario rel = entityManager.find(Rel_ChatUsuario.class, id);
        if (rel != null) {
            entityManager.remove(rel);
            entityManager.getTransaction().commit();
            return true;
        }
        entityManager.getTransaction().commit();
        return false;
    }
    
    @Override
    public Rel_ChatUsuario buscarporID(long id) {
        return null;
    }

    @Override
    public ArrayList<Rel_ChatUsuario> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Rel_ChatUsuario.class));
        Query query = entityManager.createQuery(criteria);
        List<Rel_ChatUsuario> relaciones = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(relaciones);
    }

    @Override
    public List<Rel_ChatUsuario> buscarComo(String busqueda) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Rel_ChatUsuario.class));
        Query query = entityManager.createQuery(criteria);
        List<Rel_ChatUsuario> rel = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(rel);
    }
    
    public List<Chat> buscarChatsUsuario(Long id) {
       List<Rel_ChatUsuario>rel=this.buscarComo("");
       List<Chat>chatsUsuario=new ArrayList<>();
        for (Rel_ChatUsuario rels : rel) {
            if (rels.getUsuario().getIdusuario()==id) {
                chatsUsuario.add(rels.getChat());
            }
        }
        return chatsUsuario;
    }
}
