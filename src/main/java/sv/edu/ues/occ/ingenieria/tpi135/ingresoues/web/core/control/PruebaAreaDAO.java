package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.PruebaArea;

import java.io.Serializable;

public class PruebaAreaDAO extends IngresoDefaultDataAcces<PruebaArea,Object> implements Serializable {

    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    public PruebaAreaDAO() {
        super(PruebaArea.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<PruebaArea> getEntityClass() {
        return PruebaArea.class;
    }
}
