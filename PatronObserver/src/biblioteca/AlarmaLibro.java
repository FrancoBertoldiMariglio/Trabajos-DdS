package biblioteca;

import java.util.ArrayList;

public class AlarmaLibro implements Subject
{
    private ArrayList<iLibroMalEstado> observers = new ArrayList<iLibroMalEstado>();
    public AlarmaLibro() {}
    @Override
    public void attach(iLibroMalEstado observer) {
        observers.add(observer);
    }
    @Override
    public void detach(iLibroMalEstado observer) { observers.remove(observer); }
    @Override
    public void notifyObserver() {
        for (iLibroMalEstado observer : observers)
        {
            observer.update();
        }
    }
}
