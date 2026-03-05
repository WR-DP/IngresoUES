package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.ejb.Local;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.AreaConocimiento;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.PreguntaDistractor;

import java.io.Serializable;

@Stateless
@LocalBean
public class PreguntaDistractorDAO extends IngresoDefaultDataAcces<PreguntaDistractor, Object> implements Serializable {
    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    public PreguntaDistractorDAO() {
        super(PreguntaDistractor.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<PreguntaDistractor> getEntityClass() {
        return PreguntaDistractor.class;
    }
}
