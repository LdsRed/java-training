package org.jlarcher.webapphibernate.appspringboothibernate;

import org.jlarcher.webapphibernate.appspringboothibernate.model.Instructor;
import org.jlarcher.webapphibernate.appspringboothibernate.model.InstructorDetails;
import org.jlarcher.webapphibernate.appspringboothibernate.repository.InstructorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppSpringbootHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppSpringbootHibernateApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(InstructorRepository instructorRepository) {
        return runner -> {
            createInstructor(instructorRepository);
        };
    }

    

    private void createInstructor(InstructorRepository instructorRepository){
        //populate the instructors
        Instructor instructor = new Instructor("Jordan", "Larcher", "lds.larcher@gmail.com");
        InstructorDetails instructorDetails = new InstructorDetails("fake_youtube.com", "Fake youtube Channel");
        //Associate the objects
        instructor.setInstructorDetails(instructorDetails);
        //save the instructor
        //This will also save the Instrcutor Details because of the Cascade = CascadeType.ALL
        instructorRepository.save(instructor);
    }
}
