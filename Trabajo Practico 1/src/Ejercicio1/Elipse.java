package Ejercicio1;

public class Elipse {
    private Float semiEjeMayor;
    private Float semiEjeMenor;

    public Elipse() {
    }

    public Elipse(Float semiEjeMayor, Float semiEjeMenor) {
        this.semiEjeMayor = semiEjeMayor;
        this.semiEjeMenor = semiEjeMenor;
    }

    public Elipse crearCirculo(Float radio) {
        return new Elipse(radio, radio);
    }
}
