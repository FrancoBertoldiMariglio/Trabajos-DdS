package biblioteca;

public class Main {
    public static void main(String[] args)
    {
        Biblioteca bib1 = new Biblioteca();
        Libro lib1 = new Libro("Activo", "Moby Dick");
        AlarmaLibro alarma = new AlarmaLibro();

        Administracion admin = new Administracion();
        alarma.attach(admin);

        Stock stock = new Stock();
        alarma.attach(stock);

        Compras compras = new Compras();
        alarma.attach(compras);

        lib1.setEstado("MALO");
        bib1.devuelveLibro(lib1);
    }
}
