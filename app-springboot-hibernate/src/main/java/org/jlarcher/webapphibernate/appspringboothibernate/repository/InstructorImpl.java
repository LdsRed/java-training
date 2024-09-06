package org.jlarcher.webapphibernate.appspringboothibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.jlarcher.webapphibernate.appspringboothibernate.model.Instructor;

public class InstructorImpl implements InstructorRepository{

    //Define field for entity manager
    private final EntityManager entityManager;

    //Inject entity manager using constructor injection
    public InstructorImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor instructor) {
        entityManager.persist(instructor);
    }
}
