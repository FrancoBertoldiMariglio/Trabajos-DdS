import Equipos.Computadora;
import Equipos.Impresora;
//import Persona.Persona;
//import Persona.Domicilio;
//import Vehiculo.*;

public class Main {
    public static void main(String[] args) {
//        Persona p1 = new Persona("Pepe", "Honguito", 1234);

        //System.out.println("La persona se llama " + p1.getNombre() + " " + p1.getApellido());

        //System.out.println("Su DNI es: " + p1.getDni());

        //p1.caminar();

//        Persona p2 = new Persona();
//
//        p2.setNombre("Franco");
//        p2.setApellido("Bertoldi");
//        p2.setDni(44436587);
//
//        Domicilio dom1 = new Domicilio("Huarpes", 123);
//
//        p1.setDom(dom1);

        //System.out.println(p1.getNombre() + p1.getApellido() + " vive en " + p1.getDom().getCalle());

//        dom1.setPersona(p1);

        //System.out.println(dom1.getCalle() + " " + dom1.getNumero() + " es el domicilio de: " + dom1.getPersona().getNombre());

        Computadora compu1 = new Computadora("Lenovo", 1000.0, "Azul", "Intel", "i5");
        Impresora imp1 = new Impresora("Tinta", "HP");
        compu1.agregarImpresora(imp1);
        System.out.println("La computadora " + compu1.getMarca() + " tiene una impresora " + compu1.getImpresora().getMarca());
    }
}