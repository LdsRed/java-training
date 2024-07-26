package sections.junioradv;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLParserExample {
    public static void main(String[] args) {

        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("/home/jor_test_24-07-24/Documentos/java-training/java-sections/src/main/java/sections/junioradv/example.xml"));
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("case");

            for (int i = 0; i < nodeList.getLength(); i++){
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element testElement = (Element) node;

                    System.out.println("Test id " );
                }

            }

        }catch (Exception e ) {
            e.printStackTrace();
        }
    }
}
