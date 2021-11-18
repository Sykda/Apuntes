package xml_java;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserSAX {

	public static void main(String[] args) {

		try {
			File inputFile = new File("C:\\Users\\admin\\Desktop\\empresa.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			Manejador manejador = new Manejador();
			saxParser.parse(inputFile, manejador);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Manejador extends DefaultHandler {

	boolean nombre_empleado = false;
	boolean sueldo = false;

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		// Atributos
		if (qName.equalsIgnoreCase("empleado")) {
			String cargo = attributes.getValue("cargo");
			System.out.println("Cargo : " + cargo);
		}

		if (qName.equalsIgnoreCase("empleado")) {
			String edad = attributes.getValue("edad");
			System.out.println("Edad : " + edad);
		}
		if (qName.equalsIgnoreCase("empleado")) {
			String id = attributes.getValue("id");
			System.out.println("ID : " + id);

		// Etiquetas
		}
		if (qName.equalsIgnoreCase("nombre_empleado")) {
			nombre_empleado = true;
		} else if (qName.equalsIgnoreCase("sueldo")) {
			sueldo = true;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {

		if (qName.equalsIgnoreCase("student")) {
			System.out.println("End Element :" + qName);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {

		if (nombre_empleado) {
			System.out.println("Nombre empleado: " + new String(ch, start, length));
			nombre_empleado = false;
		} else if (sueldo) {
			System.out.println("Sueldo: " + new String(ch, start, length));
			sueldo = false;
		}
	}

	@Override
	public void startDocument() {

	}

	@Override
	public void endDocument() {

	}
}