package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;
import java.util.List;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

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

    public T findById(final Object id)throws IllegalStateException, IllegalArgumentException {
        EntityManager em = null;
        try {
            em = getEntityManager();

        } catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
        return em.find(getEntityClass(), id);
    }

    @Override
    public T update(final T registro)
            throws IllegalArgumentException, IllegalStateException {

        if (registro == null) {
            throw new IllegalArgumentException("Parámetro no válido: registro es null");
        }

        try {
            EntityManager em = getEntityManager();

            if (em == null) {
                throw new IllegalStateException("No se pudo obtener el EntityManager");
            }

            return em.merge(registro);

        } catch (Exception ex) {
            throw new IllegalStateException("Error al actualizar el registro", ex);
        }
    }

    @Override
    public List<T> findRange(int first, int max)
            throws IllegalArgumentException, IllegalStateException {

        if (first < 0 || max < 1) {
            throw new IllegalArgumentException("Parámetros no válidos");
        }

        try {
            EntityManager em = getEntityManager();

            if (em == null) {
                throw new IllegalStateException("No se pudo obtener el EntityManager");
            }

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<T> cq = cb.createQuery(getEntityClass());
            Root<T> root = cq.from(getEntityClass());

            cq.select(root);

            TypedQuery<T> query = em.createQuery(cq);
            query.setFirstResult(first);
            query.setMaxResults(max);

            return query.getResultList();

        } catch (Exception ex) {
            throw new IllegalStateException("No se pudo acceder al repositorio", ex);
        }
    }


}
