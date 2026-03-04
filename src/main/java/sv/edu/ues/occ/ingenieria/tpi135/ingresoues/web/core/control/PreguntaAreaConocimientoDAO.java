package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.PreguntaAreaConocimiento;

import java.io.Serializable;

@Stateless
@LocalBean
public class PreguntaAreaConocimientoDAO extends IngresoDefaultDataAcces<PreguntaAreaConocimiento, Object> implements Serializable {
    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    //public PreguntaAreaConocimientoDAO() {
    //    super(PreguntaAreaConocimientoDAO.class);
    //}

    @Override
    public EntityManager getEntityManager() {
        return null;
    }

    @Override
    protected Class<PreguntaAreaConocimiento> getEntityClass() {
        return null;
    }
}
