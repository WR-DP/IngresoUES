package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.AreaConocimiento;

import java.io.Serializable;
import java.util.List;

@Stateless
@LocalBean
public class AreaConocimientoDAO extends IngresoDefaultDataAcces<AreaConocimiento, Object> implements Serializable {
    @PersistenceContext(unitName="IngresoPU")
    private EntityManager em;

    //public AreaConocimientoDAO() {
    //    super(AreaConocimientoDAO.class);
    //}

    @Override
    public EntityManager getEntityManager() {
        return null;
    }

    @Override
    protected Class<AreaConocimiento> getEntityClass() {
        return null;
    }


}
