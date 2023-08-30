package Vehiculos;

public abstract class Vehiculo {
    protected String marca;

//    public Vehiculo(String marca) {
//        this.marca = marca;
//    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) { this.marca = marca; }

    public abstract void arrancar();
}