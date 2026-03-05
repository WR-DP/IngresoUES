package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.PruebaAreaPreguntaDistractor;

import java.io.Serializable;

public class PruebaAreaPreguntaDistractorDAO extends IngresoDefaultDataAcces<PruebaAreaPreguntaDistractor,Object> implements Serializable {

    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    public PruebaAreaPreguntaDistractorDAO() {
        super(PruebaAreaPreguntaDistractor.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<PruebaAreaPreguntaDistractor> getEntityClass() {
        return PruebaAreaPreguntaDistractor.class;
    }
}
