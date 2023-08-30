/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class AlarmaLibro implements Subject
{
    private static ArrayList<ILibroMalEstado> observadores = 
            new ArrayList<ILibroMalEstado>();

    
    
    @Override
    public void attach(ILibroMalEstado observer)
    {
        observadores.add(observer);
    }

    @Override
    public void dettach(ILibroMalEstado observer)
    {
        observadores.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
        for (ILibroMalEstado observador : observadores)
        {
            observador.update();
        }
    }
    
}
