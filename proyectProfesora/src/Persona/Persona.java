package Persona;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer dni;

    private ArrayList<Domicilio> domArr = new ArrayList<Domicilio>();
    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void caminar() {
        System.out.println("Estoy caminando");
    }

    public Domicilio getDomA(int i) { return domArr.get(i); }
    public void setDomArr(Domicilio dom) { this.domArr.add(dom); }

    public void imprimirDom() {
        for (int i = 0; i < domArr.size(); i++) {
            System.out.println(domArr.get(i).getCalle() + " " + domArr.get(i).getNumero());
        }

        for (Domicilio dom : domArr) {
            System.out.println(dom.getCalle() + " " + dom.getNumero());
        }
    }
}