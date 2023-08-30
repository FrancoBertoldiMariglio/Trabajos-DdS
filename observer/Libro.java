/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Administrador
 */
public class Libro
{
    
    
    private String titulo;
    private String estado;

    public Libro() {
    }

    public Libro(String titulo, String estado) {
        this.titulo = titulo;
        this.estado = estado;
    }
    
    
    

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    
    

}
