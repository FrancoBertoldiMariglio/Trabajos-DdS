package biblioteca;

public class Compras implements iLibroMalEstado{
    @Override
    public void update()
    {
        System.out.println("Comprando otra copia del libro roto");
    }
}
