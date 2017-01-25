package ar.com.jbugba.base.wildfly.persistence;

import ar.com.jbugba.base.wildfly.model.Guitar;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Stateless
public class GuitarRepository extends Repository<Guitar> {

    public List<Guitar> getGuitars(int page, int size) {
        CriteriaQuery<Guitar> select = this.createCriteria(Guitar.class);
        Root<Guitar> root = select.from(Guitar.class);
        TypedQuery<Guitar> query = this.paginate(page, size, select);
        return query.getResultList();
    }

}
