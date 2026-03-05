package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.AreaConocimiento;

import java.io.Serializable;

public class AreaConocimientoDAO
        extends IngresoDefaultDataAcces<AreaConocimiento, Object>
        implements Serializable {

    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    public AreaConocimientoDAO() {
        super(AreaConocimiento.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<AreaConocimiento> getEntityClass() {
        return AreaConocimiento.class;
    }
}