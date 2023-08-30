package Vehiculo;

public class Auto {
    private String marca;
    private Garage garage;
    private MP3 mp3;
    private Rueda rueda;


    public Auto() {
    }

    public Auto(String marca, Float medida) {
        this.marca = marca;
        this.rueda = new Rueda(medida);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public MP3 obtenerMP3() {
        return mp3;
    }

    public void agregarMP3(MP3 mp3) {
        this.mp3 = mp3;
    }

    public Rueda getRueda() {
        return rueda;
    }
}