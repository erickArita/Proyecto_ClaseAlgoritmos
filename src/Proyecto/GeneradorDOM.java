package Proyecto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class GeneradorDOM {

    //Nodos
    private XMLOutputter xml;
    private Element root = null;
    private Document doc = null;
    //Objeto Persona    
    public Persona per = new Persona();

    public void initElements() throws IOException, JDOMException {

        File xmlFile = new File("registro.xml");
        if (xmlFile.exists()) {
            FileInputStream fis = new FileInputStream(xmlFile);
            SAXBuilder sb = new SAXBuilder();
            doc = sb.build(fis);
            root = doc.getRootElement();
            fis.close();

        } else {
            doc = new Document();
            root = new Element("registro");
        }

    }
    //Objeto Persona    

    public void addPerson() throws IOException {

        Element nombre = new Element("Nombre");
        nombre.setText(per.getNombre());

        Element apellido = new Element("Apellido");
        apellido.setText(per.getNombre());

        Element sexo = new Element("Sexo");
        sexo.setText(per.getSexo());

        Element edad = new Element("Edad");
        edad.setText(Integer.toString(per.getEdad()));

        Element nacionalidad = new Element("Nacionalidad");
        nacionalidad.setText(per.getNacionalidad());

        Element dni = new Element("Dni");
        dni.setText(Integer.toString(per.getDni()));

        Element persona = new Element("persona");
        Element personas = new Element("personas");

        persona.addContent(nombre);
        persona.addContent(sexo);
        persona.addContent(edad);
        persona.addContent(nacionalidad);
        persona.addContent(dni);
        persona.addContent(apellido);
        personas.addContent(persona);
        root.addContent(personas);
        doc.setContent(root);

        xml = new XMLOutputter();
        xml.setFormat(Format.getPrettyFormat());
        xml.output(doc, new FileWriter("registro.xml"));

    }
}
