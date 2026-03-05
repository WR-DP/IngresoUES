package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.PruebaAreaPregunta;

import java.io.Serializable;

public class PruebaAreaPreguntaDAO extends IngresoDefaultDataAcces<PruebaAreaPregunta, Object> implements Serializable {

    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    public PruebaAreaPreguntaDAO() {
        super(PruebaAreaPregunta.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<PruebaAreaPregunta> getEntityClass() {
        return PruebaAreaPregunta.class;
    }
}
