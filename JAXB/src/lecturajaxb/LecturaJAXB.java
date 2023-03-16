/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecturajaxb;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;



/**
 *
 * @author Scott
 */
public class LecturaJAXB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException {
        // TODO code application logic here
        
        JAXBContext context = JAXBContext.newInstance(Libreria.class);
        
        Unmarshaller unmarshaller = context.createUnmarshaller();
       
        Libreria libreria = (Libreria) unmarshaller.unmarshal(new File("libreria.xml"));
        
        System.out.println(libreria.getNombre());
        
        ArrayList<Libro> libros = libreria.getLibros();

        for(Libro l: libros){

            System.out.println(l.getIsbn()+" "+l.getTitulo()+" "+l.getAutor());

        }
    }
    
}
