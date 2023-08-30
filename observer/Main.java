/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Administrador
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        AlarmaLibro alarma=new AlarmaLibro();
        alarma.attach(new Compras());
        
        alarma.attach(new Administracion());
        
        alarma.attach(new Stock());
        
        Libro libro = new Libro();
        libro.setEstado("MALO");
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.devuelveLibro(libro);
    }
}
