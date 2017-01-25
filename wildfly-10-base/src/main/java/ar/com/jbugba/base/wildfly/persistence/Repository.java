package ar.com.jbugba.base.wildfly.persistence;

import ar.com.jbugba.base.wildfly.model.Guitar;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

public class Repository<T> {

    @PersistenceContext(unitName = "h2")
    protected EntityManager entityManager;

    protected CriteriaQuery<T> createCriteria(Class<T> clazz) {
        return this.entityManager.getCriteriaBuilder().createQuery(clazz);
    }

    protected TypedQuery<T> paginate(int page, int size, CriteriaQuery<T> select) {
        TypedQuery<T> query = this.entityManager.createQuery(select);
        query.setFirstResult(page * size);
        query.setMaxResults(size);
        return query;
    }


}
