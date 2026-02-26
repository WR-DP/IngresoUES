package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;

public abstract class IngresoDefaultDataAcces<T, ID> implements IngresoDAOInterface<T,ID> {

    public abstract EntityManager getEntityManager();

    protected abstract Class<T> getEntityClass();

    private final Class<T> TipoDato;

    protected IngresoDefaultDataAcces(Class<T> tipoDato) {
        TipoDato = tipoDato;
    }


    public void create(final T obj)throws IllegalStateException, IllegalArgumentException {
        EntityManager em = null;

    }

    public void delete(final T obj)throws IllegalStateException, IllegalArgumentException {}

    public T findById(final Object id)throws IllegalStateException, IllegalArgumentException {
        EntityManager em = null;
        try {
            em = getEntityManager();

        } catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
        return em.find(TipoDato,id);
    }



}
