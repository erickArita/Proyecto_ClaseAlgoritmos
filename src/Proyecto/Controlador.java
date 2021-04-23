package Proyecto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Controlador {

    private XMLOutputter xml;
    private Element personas = new Element("Personas");
    private Document doc = null;
    private Boolean find = false;
    //Objeto Clase Persona    
    public Persona per = new Persona();
    public Persona p = new Persona();

    public Boolean getFind() {
        return find;
    }

    public void setFind(Boolean find) {
        this.find = find;
    }

    public void initElementsFile() throws IOException, JDOMException {

        File xmlFile = new File("registro.xml");

        if (xmlFile.exists()) {
            SAXBuilder builder = new SAXBuilder();
            doc = builder.build(new FileInputStream(xmlFile));
            personas = doc.detachRootElement();
        } else {
            doc = new Document();
        }

    }
//Metodo para agregar persona desde Registro.

    public void addPerson() throws IOException {
        
        Element nombre = new Element("Nombre");
        nombre.setText(per.getNombre());

        Element apellido = new Element("Apellido");
        apellido.setText(per.getApellido());

        Element sexo = new Element("Sexo");
        sexo.setText(per.getSexo());

        Element edad = new Element("Edad");
        edad.setText(per.getEdad());

        Element nacionalidad = new Element("Nacionalidad");
        nacionalidad.setText(per.getNacionalidad());

        Element dni = new Element("Dni");
        dni.setText(per.getDni());

        Element persona = new Element("persona");

        persona.addContent(nombre);
        persona.addContent(apellido);
        persona.addContent(dni);
        persona.addContent(edad);
        persona.addContent(sexo);
        persona.addContent(nacionalidad);

        personas.addContent(persona);

        doc.addContent(personas);

        xml = new XMLOutputter();
        xml.setFormat(Format.getPrettyFormat());
        xml.output(doc, new FileWriter("registro.xml"));

    }

    public ArrayList<Persona> getPersons() throws IOException, JDOMException {
        initElementsFile();
        List<Element> persona = personas.getChildren();
        ArrayList<Persona> personList = new ArrayList();

        for (Element personaAtributes : persona) {

            ArrayList<String> atributesList = new ArrayList();

            List<Element> atributes = personaAtributes.getChildren();

            Persona personaObject = new Persona();

            atributes.forEach((atribute) -> atributesList.add(atribute.getText()));

            personaObject.setNombre(atributesList.get(0));
            personaObject.setApellido(atributesList.get(1));
            personaObject.setEdad(atributesList.get(3));
            personaObject.setSexo(atributesList.get(4));
            personaObject.setNacionalidad(atributesList.get(5));
            personaObject.setDni(atributesList.get(2));
            
            if (per.getDni() != null && (per.getDni()).equals(atributesList.get(2))) {
                setFind(true);
                setPersonaObjectToPer(personaObject);
                
            }


            personList.add(personaObject);
        }
        return personList;
    }

    private void setPersonaObjectToPer(Persona personaObject) {
        p.setNombre(personaObject.getNombre());
        p.setApellido(personaObject.getApellido());
        p.setEdad(personaObject.getEdad());
        p.setNacionalidad(personaObject.getNacionalidad());
        p.setSexo(personaObject.getSexo());

    }
}
