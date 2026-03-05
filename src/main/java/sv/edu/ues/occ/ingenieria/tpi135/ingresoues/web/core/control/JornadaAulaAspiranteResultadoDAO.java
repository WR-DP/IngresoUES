package sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.control;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import sv.edu.ues.occ.ingenieria.tpi135.ingresoues.web.core.entity.JornadaAulaAspiranteResultado;

import java.io.Serializable;

public class JornadaAulaAspiranteResultadoDAO extends IngresoDefaultDataAcces<JornadaAulaAspiranteResultado,Object> implements Serializable {

    @PersistenceContext(unitName = "IngresoPU")
    private EntityManager em;

    public JornadaAulaAspiranteResultadoDAO() {
        super(JornadaAulaAspiranteResultado.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<JornadaAulaAspiranteResultado> getEntityClass() {
        return JornadaAulaAspiranteResultado.class;
    }
}
