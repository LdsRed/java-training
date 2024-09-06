package org.jlarcher.webapphibernate.appspringboothibernate.model;


import jakarta.persistence.*;

@Entity
@Table(name ="instructor_details")
public class InstructorDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="youtube_channel")
    private String youtubeChannel;

    @Column(name="hobby")
    private String hobby;


    public InstructorDetails(){}

    public InstructorDetails(String hobby, String youtubeChannel, Long id) {
        this.hobby = hobby;
        this.youtubeChannel = youtubeChannel;
        this.id = id;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getYoutubeChannel() {
        return youtubeChannel;
    }

    public void setYoutubeChannel(String youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
