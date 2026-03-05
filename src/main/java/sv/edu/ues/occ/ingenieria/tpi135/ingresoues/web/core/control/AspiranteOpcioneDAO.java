package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.AspiranteOpcione;

import java.io.Serializable;

public class AspiranteOpcioneDAO extends IngresoDefaultDataAcces<AspiranteOpcione, Object> implements Serializable {

    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    public AspiranteOpcioneDAO() {
        super(AspiranteOpcione.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<AspiranteOpcione> getEntityClass() {
        return AspiranteOpcione.class;
    }
}
