
package Repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Dany
 * @param <T>
 */
public abstract class BaseRepository<T>  {
    public abstract boolean guardar(T entidad);
    public abstract boolean actualizar(T entidad);
    public abstract T buscarporID(long id);
    public abstract ArrayList<T> buscarTodas();
    public abstract List<T> buscarComo(String busqueda);
    public EntityManager createEntityManager(){
        EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("juatsapp_205857_205056PU");
        EntityManager entityManager= managerFactory.createEntityManager();
        return entityManager;
    }
    
}
