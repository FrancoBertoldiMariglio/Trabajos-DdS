/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Administrador
 */
public interface Subject
{
    public void attach(ILibroMalEstado observer);
    public void dettach(ILibroMalEstado observer);
    public void notifyObservers();
    
}
