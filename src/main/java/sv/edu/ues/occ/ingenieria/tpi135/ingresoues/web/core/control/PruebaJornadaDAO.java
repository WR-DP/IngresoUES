package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.PruebaJornada;

import java.io.Serializable;

public class PruebaJornadaDAO extends IngresoDefaultDataAcces<PruebaJornada,Object> implements Serializable {

    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    public PruebaJornadaDAO() {
        super(PruebaJornada.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<PruebaJornada> getEntityClass() {
        return PruebaJornada.class;
    }
}
