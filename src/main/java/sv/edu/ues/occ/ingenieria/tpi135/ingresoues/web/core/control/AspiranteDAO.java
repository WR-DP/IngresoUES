package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.Aspirante;

import java.io.Serializable;

public class AspiranteDAO extends IngresoDefaultDataAcces<Aspirante, Object> implements Serializable {

    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    public AspiranteDAO() {
        super(Aspirante.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<Aspirante> getEntityClass() {
        return Aspirante.class;
    }
}
