/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Administrador
 */
public class Compras implements ILibroMalEstado
{

    @Override
    public void update()
    {
        System.out.println("Compras:");
        System.out.println("Solicito cotización de reparación o reposición de libro...");
    }
    
}
