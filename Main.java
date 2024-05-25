package Vista;

import Modelo.Contacto;
import Servicio.Agenda;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Agregar contactos
        agenda.agregarContacto("Mario", 123456789L, "mario@nintendo.com", LocalDate.of(1981, 7, 9));
        agenda.agregarContacto("Link", 987654321L, "link@hyrule.com", LocalDate.of(1986, 2, 21));
        agenda.agregarContacto("Peach", 456789123L, "peach@nintendo.com", LocalDate.of(1985, 9, 13));
        agenda.agregarContacto("Zelda", 234567890L, "zelda@hyrule.com", LocalDate.of(1986, 2, 21));
        agenda.agregarContacto("Bowser", 345678901L, "bowser@nintendo.com", LocalDate.of(1985, 9, 13));
        agenda.agregarContacto("Luigi", 567890123L, "luigi@nintendo.com", LocalDate.of(1983, 7, 14));
        agenda.agregarContacto("Toad", 678901234L, "toad@nintendo.com", LocalDate.of(1985, 9, 13));
        agenda.agregarContacto("Yoshi", 789012345L, "yoshi@nintendo.com", LocalDate.of(1990, 11, 21));
        agenda.agregarContacto("Wario", 890123456L, "wario@nintendo.com", LocalDate.of(1992, 1, 11));
        agenda.agregarContacto("Daisy", 901234567L, "daisy@nintendo.com", LocalDate.of(1989, 8, 3));
        agenda.agregarContacto("Rosalina", 12345678L, "rosalina@nintendo.com", LocalDate.of(2007, 11, 1));
        agenda.agregarContacto("Donkey", 112345678L, "donkey@nintendo.com", LocalDate.of(1981, 7, 9));
        agenda.agregarContacto("Diddy", 212345678L, "diddy@nintendo.com", LocalDate.of(1994, 11, 18));
        agenda.agregarContacto("Koopa", 312345678L, "koopa@nintendo.com", LocalDate.of(1985, 9, 13));
        agenda.agregarContacto("Goomba", 412345678L, "goomba@nintendo.com", LocalDate.of(1985, 9, 13));

        // Mostrar contactos
        System.out.println("Contactos en la agenda:");
        agenda.mostrarContactos();

        // Buscar un contacto
        System.out.println("\nBuscando el contacto de Link:");
        Contacto contacto = agenda.buscarContacto("Link");
        if (contacto != null) {
            System.out.println("Nombre: " + contacto.getNombre() +
                    ", Teléfono: " + contacto.getTelefono() +
                    ", Correo Electrónico: " + contacto.getCorreoElectronico() +
                    ", Fecha de Nacimiento: " + contacto.getFechaNacimiento());
        } else {
            System.out.println("Contacto no encontrado.");
        }

        // Eliminar un par de contactos
        System.out.println("\nEliminando el contacto de Peach.");
        agenda.eliminarContacto("Peach");
        System.out.println("Eliminando el contacto de Mario.");
        agenda.eliminarContacto("Mario");

        // Mostrar contactos después de la eliminación
        System.out.println("\nContactos en la agenda después de eliminar a Peach y Mario:");
        agenda.mostrarContactos();
    }
}