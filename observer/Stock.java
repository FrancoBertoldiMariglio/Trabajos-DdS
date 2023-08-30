/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Administrador
 */
public class Stock implements ILibroMalEstado
{

    @Override
    public void update()
    {
        System.out.println("Stock:");
        System.out.println("Se da de baja al libro y se manda a reparación o reposición...");
    }
    
}
