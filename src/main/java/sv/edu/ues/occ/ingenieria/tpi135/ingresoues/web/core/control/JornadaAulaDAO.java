package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.JornadaAula;

import java.io.Serializable;

public class JornadaAulaDAO extends IngresoDefaultDataAcces<JornadaAula, Object> implements Serializable {

    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    public JornadaAulaDAO() {
        super(JornadaAula.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<JornadaAula> getEntityClass() {
        return JornadaAula.class;
    }
}
