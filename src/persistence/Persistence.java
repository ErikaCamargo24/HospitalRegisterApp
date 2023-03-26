package persistence;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Persistence {


    public Persistence() {
        try {
            File xmlFile = new File("src/persistence/hospital.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("nombre de la etiqueta raiz: "   + doc.getDocumentElement().getNodeName());           
            NodeList nodeList = doc.getElementsByTagName("libro");
            for (int i = 0; i < nodeList.getLength(); i++) {
                getLibro(nodeList.item(i));
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
    
    public void getLibro(Node node) {
        System.out.println("Nombre de la etiqueta: " + node.getNodeName());        
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            System.out.println("Id: " + element.getAttribute("id"));
            System.out.println("Titulo: " + getTagValue("titulo", element));
            System.out.println("Autor: " + getTagValue("autor", element));
            System.out.println("Año lanzamiento: " + getTagValue("anio", element));
        }
    }
    
    public String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }

    
    public static void main(String[] args) {
        new Persistence();
    }
   
        
    }


}