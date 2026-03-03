package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;

public abstract class IngresoDefaultDataAcces<T, ID> implements IngresoDAOInterface<T, ID> {

    public abstract EntityManager getEntityManager();

    protected abstract Class<T> getEntityClass();

    private final Class<T> TipoDato;

    protected IngresoDefaultDataAcces(Class<T> tipoDato) {
        TipoDato = tipoDato;
    }

    public void create(final T obj) throws IllegalStateException, IllegalArgumentException  {
        EntityManager em = null;

        if (obj == null) {
            throw new IllegalArgumentException("Parametro no valido:objeto nulo");
        }
        try {
           em = getEntityManager();
            if (em == null) {
                throw new IllegalArgumentException("Parametro no valido:entity manager nulo");
            }
            em.persist(obj);
            em.flush();
        } catch (Exception e) {
            if(e instanceof IllegalArgumentException) {
                throw (IllegalArgumentException) e;
            }
            throw new IllegalStateException("Error al acceder al repositorio", e);
        }
    }

    public void delete(final T obj) throws  IllegalStateException, IllegalArgumentException {
        EntityManager em = null;

        if (obj == null) {
            throw new IllegalArgumentException("Parametro no valido:entity nulo");
        }
        try {
            //asignacion en limpio
            em = getEntityManager();
            if (em == null) {
                throw new IllegalArgumentException("Parametro no valido:entity manager nulo");
            }
            //merge para obtener la entidad gestionada,
            // esto es necesario para evitar problemas de transaccionalidad y manejo de entidades no gestionadas
            T managedEntity = em.merge(obj);
            //remover la entidad gestionada directamente,
            // evitando problemas de transaccionalidad y manejo de entidades no gestionadas
            em.remove(managedEntity);
        } catch (Exception ex) {
            if (ex instanceof IllegalArgumentException) {
                throw (IllegalArgumentException) ex;
            }
            throw  new IllegalStateException("Error al acceder al repositorio", ex);
        }
    }

}
