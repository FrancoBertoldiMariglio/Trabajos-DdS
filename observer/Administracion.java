/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Administrador
 */
public class Administracion implements ILibroMalEstado
{

    @Override
    public void update()
    {
        System.out.println("Administracion: ");
        System.out.println("Suspensión de socio hasta la reposición o reparación del daño causado.....");
    }
    
}
