package xml_java;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class ParserDOM {
	
	public static void main (String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		//Crear el builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		 
		//Crea documento (lo coje para leerlo)
		Document documento = builder.parse(new File("C:\\Users\\admin\\Desktop\\empresa.xml"));
		 
		//Normaliza la estructura del XML; Importante !!
		documento.getDocumentElement().normalize();
		 
		//Va al root
		Element root = documento.getDocumentElement();
		System.out.println(root.getNodeName());
		 
		//Coje todos los empleados
		NodeList nList = documento.getElementsByTagName("empleado");
		System.out.println("============================");
		 
		for (int temp = 0; temp < nList.getLength(); temp++){
			Node node = nList.item(temp); 
			System.out.println("");    //Separador
			
			 if (node.getNodeType() == Node.ELEMENT_NODE){
				
				 	//Pinta los detalles del empleado
				    Element eElement = (Element) node;
				    
				    System.out.println("Cargo : "    + eElement.getAttribute("cargo"));
				    System.out.println("Edad : "    + eElement.getAttribute("edad"));
				    System.out.println("ID : " + eElement.getAttribute("id"));				    
				    System.out.println("Nombre : "  + eElement.getElementsByTagName("nombre_empleado").item(0).getTextContent());
				    System.out.println("Sueldo : "   + eElement.getElementsByTagName("sueldo").item(0).getTextContent());			
				    		 
			}		 
		}
	}
}
