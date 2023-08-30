package biblioteca;

public class Stock implements iLibroMalEstado{
    @Override
    public void update()
    {
        System.out.println("El libro roto salio de stock");
    }
}
