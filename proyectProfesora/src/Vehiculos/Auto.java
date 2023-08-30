package Vehiculos;

public class Auto extends Vehiculo{
    private String matricula;

    public Auto(String matricula, String marca) {
        super.marca = marca;
//      super(marca);
        this.matricula = matricula;
    }

    @Override
    public void arrancar() {

    }
}
