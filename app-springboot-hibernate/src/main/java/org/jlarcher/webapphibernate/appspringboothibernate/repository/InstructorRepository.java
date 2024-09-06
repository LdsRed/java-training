package org.jlarcher.webapphibernate.appspringboothibernate.repository;


import org.jlarcher.webapphibernate.appspringboothibernate.model.Instructor;
import org.springframework.stereotype.Repository;


@Repository
public interface InstructorRepository{

    void save(Instructor instructor);
}
