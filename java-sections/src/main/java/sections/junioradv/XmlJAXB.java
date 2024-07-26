package sections.junioradv;

import jakarta.xml.bind.JAXB;

import java.io.File;

public class XmlJAXB {
    public static void main(String[] args) {


        //Reading an XAML file (unmarshalling)

        try{
            User userTest = JAXB.unmarshal(new File("/home/jor_test_24-07-24/Documentos/java-training/java-sections/src/main/java/sections/junioradv/user.xml"), User.class);
            System.out.println(userTest.getName());
            System.out.println(userTest.getUserId());

        }catch (Exception e){
            System.err.println("Exception occurred while reading the XML!");

        }

    }
}
