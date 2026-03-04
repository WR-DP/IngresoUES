package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.DistractorAreaConocimiento;

import java.io.Serializable;

@Stateless
@LocalBean
public class DistractorAreaConocimientoDAO extends IngresoDefaultDataAcces<DistractorAreaConocimiento, Object> implements Serializable {
    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    //public DistractorAreaConocimientoDAO() {
    //    super(DistractorAreaConocimientoDAO.class);
    //}

    @Override
    public EntityManager getEntityManager() {
        return null;
    }

    @Override
    protected Class<DistractorAreaConocimiento> getEntityClass() {
        return null;
    }
}
