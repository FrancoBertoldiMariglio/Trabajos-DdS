package Vehiculo;

public class MP3 {
    private String marca;
    private Double capacidad;

    public MP3() {
    }

    public MP3(String marca, Double capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }
}
