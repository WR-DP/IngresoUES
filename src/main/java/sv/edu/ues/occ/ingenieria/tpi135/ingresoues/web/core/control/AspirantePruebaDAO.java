package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.AspirantePrueba;

import java.io.Serializable;

public class AspirantePruebaDAO extends IngresoDefaultDataAcces<AspirantePrueba, Object> implements Serializable {

    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    public AspirantePruebaDAO() {
        super(AspirantePrueba.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<AspirantePrueba> getEntityClass() {
        return AspirantePrueba.class;
    }
}
