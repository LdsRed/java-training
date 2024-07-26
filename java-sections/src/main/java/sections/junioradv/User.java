package sections.junioradv;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {


    /*
    * The variables or attributes represents the NODES in the xml file*/
    private long userId;
    private String name;


    public User(){}
    public User(long userId, String name){
        this.userId = userId;
        this.name = name;
    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
