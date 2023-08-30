package Equipos;

public class Computadora {
    private String marca;
    private Double precio;
    private String color;
    private Impresora impresora;
    private CPU cpu;

    public Computadora() {
    }

    public Computadora(String marca, Double precio, String color, String marcaCPU, String modelo) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.cpu = new CPU(marcaCPU, modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    //Agregacion
    public void agregarImpresora(Impresora impresora) {

        this.impresora = impresora;
    }
}