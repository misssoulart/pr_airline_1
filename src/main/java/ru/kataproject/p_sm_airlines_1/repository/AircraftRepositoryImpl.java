package ru.kataproject.p_sm_airlines_1.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import ru.kataproject.p_sm_airlines_1.entity.Aircraft;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ComponentScan("security")
@Repository
public abstract class AircraftRepositoryImpl implements AircraftRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void addAircraft(Aircraft aircraft) {
        entityManager.persist(aircraft);
    }

    @Override
    public void removeAircraft(int id) {
        entityManager.remove(getAircraftById(id));
    }

    @Override
    public void editAircraft (Aircraft updateAircraft) {
        entityManager.merge(updateAircraft);
    }

    @Override
    public Aircraft getAircraftById(int id) {
        return entityManager.find(Aircraft.class, id);
    }

    @Override
    public List<Aircraft> getAllAircrafts() {
        return entityManager.createQuery("select u from Aircraft u", Aircraft.class)
                .getResultList();
    }

    @Override
    public Aircraft getAircraftByAircraftname(String username) {
        return entityManager.createQuery("select u from Aircraft u where u.model = :aircraftname", Aircraft.class)
                .setParameter("aircraftname", getAircraftByAircraftname())
                .getSingleResult();
    }

    private Object getAircraftByAircraftname() {
        return null;
    }

}
