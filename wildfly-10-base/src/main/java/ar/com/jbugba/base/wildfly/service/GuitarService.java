package ar.com.jbugba.base.wildfly.service;

import ar.com.jbugba.base.wildfly.model.Guitar;
import ar.com.jbugba.base.wildfly.persistence.GuitarRepository;

import javax.inject.Inject;
import java.util.List;

public class GuitarService {

    private final GuitarRepository guitarRepository;

    @Inject
    public GuitarService(GuitarRepository guitarHome) {
        this.guitarRepository = guitarHome;
    }

    public List<Guitar> getGuitars(int page, int size) {
        return this.guitarRepository.getGuitars(page, size);
    }
}
