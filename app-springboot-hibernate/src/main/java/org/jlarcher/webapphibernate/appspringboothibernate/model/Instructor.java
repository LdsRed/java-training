package org.jlarcher.webapphibernate.appspringboothibernate.model;


import jakarta.persistence.*;

@Entity
@Table(name = "instructor")
public class Instructor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name ="first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @Column(name= "email")
    private String email;

    @Column(name = "instructor_details")
    private int instructorDetails;

    public Instructor(){}



    public Instructor(Long id, String firstName, String lastName, String email, int instructorDetails) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.instructorDetails = instructorDetails;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getInstructorDetails() {
        return instructorDetails;
    }

    public void setInstructorDetails(int instructorDetails) {
        this.instructorDetails = instructorDetails;
    }
}
