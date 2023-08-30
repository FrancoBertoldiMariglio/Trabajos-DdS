/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Administrador
 */
public class Biblioteca
{
    public void devuelveLibro(Libro libro)
    {
        if(libro.getEstado().equals("MALO"))
        {
            AlarmaLibro alarma = new AlarmaLibro();
            alarma.notifyObservers();
        }
    }
}
