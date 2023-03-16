/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecturajaxb;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *

 */
public class EscrituraJAXB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException, IOException{
        // TODO code application logic here
        JAXBContext context = JAXBContext.newInstance(Libreria.class);
        Marshaller marshaller =context. createMarshaller();
        
        Libreria libreria = new Libreria();
        libreria.setNombre("Mi Libreria");
        
        ArrayList<Libro> libros = new ArrayList();
        Libro libro = new Libro();
        libro.setIsbn("123456789");
        libro.setTitulo("Libro 1");
        libro.setAutor("Autor 1");
        libros.add(libro);
        
        libro = new Libro();
        libro.setIsbn("098765432");
        libro.setTitulo("Libro 2");
        libro.setAutor("Autor 2");
        libros.add(libro);
        
        libreria.setLibros(libros);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        //marshaller.marshal(libreria, System.out);
        marshaller.marshal(libreria, new FileWriter("miLibreria.xml"));
        

 

    }
    
}
