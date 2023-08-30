package biblioteca;

public interface Subject {
    void attach(iLibroMalEstado observer);
    void detach(iLibroMalEstado observer);
    void notifyObserver();

}
