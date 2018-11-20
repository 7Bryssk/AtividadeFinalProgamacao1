package dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.Query;

import javax.persistence.EntityManager;
import jpa.JPAUtil;
import model.Bean;

public abstract class JpaDaoBase<T extends Bean> implements Dao<T> {

    private final Class<T> classe;

    @SuppressWarnings("unchecked")
    public JpaDaoBase() {
        this.classe = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public void salva(T t) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        if (t.getId() == null) {
            em.persist(t);
        } else {
            em.merge(t);
        }

        em.getTransaction().commit();
    }

    public void remove(T t) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        em.remove(this.buscaPorld(t.getId()));

        em.getTransaction().commit();
    }

    public void atualiza(T t) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();

        em.merge(t);

        em.getTransaction().commit();
    }

    public List<T> listaTodos() {
        Query query = JPAUtil.getEntityManager().createQuery(getQueryAll());
        List<T> lista = query.getResultList();
        return lista;
    }

    public T buscaPorld(Long id) {
        return (T) JPAUtil.getEntityManager().find(classe, id);
    }

    public List<T> listaPaginada(int ini, int max) {
        Query query = JPAUtil.getEntityManager().createQuery(getQueryAll());
        query.setFirstResult(ini);
        query.setMaxResults(max);
        List<T> lista = query.getResultList();
        return lista;
    }

    protected String getQueryAll() {
        return "select t from " + classe.getName() + " t ";
    }

}
