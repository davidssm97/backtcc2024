package org.example;

import org.example.modelos.Mercancia;
import org.example.modelos.Vehiculo;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Vehiculo vehiculo = new Vehiculo();
        Mercancia mercancia = new Mercancia();

        System.out.println("Atributos de Vehiculo");

        System.out.print("Digite el id del vehiculo: ");
        vehiculo.setId(lea.nextInt());
        lea.nextLine(); // Consumir la línea sobrante
        System.out.println("El id del vehiculo es " + vehiculo.getId());

        System.out.print("Digite la marca del vehiculo: ");
        vehiculo.setMarca(lea.nextLine());
        System.out.println("La marca del vehiculo es " + vehiculo.getMarca());

        System.out.print("Digite el modelo del vehiculo (MM/yy), (MM-yy): ");
        vehiculo.setModelo(lea.nextLine());
        System.out.println("El modelo del vehiculo es " + vehiculo.getModelo());

        System.out.print("Digite el kilometraje del vehiculo: ");
        vehiculo.setKilometraje(lea.nextDouble());
        lea.nextLine(); // Consumir la línea sobrante
        System.out.println("El kilometraje del vehiculo es " + vehiculo.getKilometraje());

        System.out.print("Digite el color del vehiculo: ");
        vehiculo.setColor(lea.nextLine());
        System.out.println("El color del vehiculo es " + vehiculo.getColor());

        System.out.print("Digite la descripcion del vehiculo: ");
        vehiculo.setDescripcion(lea.nextLine());
        System.out.println("La descripcion del vehiculo es " + vehiculo.getDescripcion());

        System.out.print("Digite el tipo del vehiculo: ");
        vehiculo.setTipo(lea.nextLine());
        System.out.println("El tipo del vehiculo es " + vehiculo.getTipo());

        System.out.print("Digite la autonomia del vehiculo: ");
        vehiculo.setAutonomia(lea.nextInt());
        lea.nextLine(); // Consumir la línea sobrante
        System.out.println("La autonomia del vehiculo es " + vehiculo.getAutonomia());

        System.out.print("Digite la capacidad de carga del vehiculo: ");
        vehiculo.setCapacidadCarga(lea.nextDouble());
        lea.nextLine(); // Consumir la línea sobrante
        System.out.println("La capacidad de carga del vehiculo es " + vehiculo.getCapacidadCarga());

        System.out.print("Digite el avaluo del vehiculo: ");
        vehiculo.setAvaluo(lea.nextInt());
        lea.nextLine(); // Consumir la línea sobrante
        System.out.println("El avaluo del vehiculo es " + vehiculo.getAvaluo());

        System.out.println("Atributos de Mercancia");

        System.out.print("Digite el id de la mercancia: ");
        mercancia.setId(lea.nextInt());
        lea.nextLine(); // Consumir la línea sobrante
        System.out.println("El id de la mercancia es " + mercancia.getId());

        System.out.print("Digite el volumen ocupado de la mercancia: ");
        mercancia.setVolumenOcupado(lea.nextDouble());
        lea.nextLine(); // Consumir la línea sobrante
        System.out.println("El volumen ocupado de la mercancia es " + mercancia.getVolumenOcupado());

        System.out.print("Digite el tipo de mercancia: ");
        mercancia.setTipo(lea.nextLine());
        System.out.println("El tipo de mercancia es " + mercancia.getTipo());

        System.out.print("Digite el peso de la mercancia: ");
        mercancia.setPeso(lea.nextDouble());
        lea.nextLine(); // Consumir la línea sobrante
        System.out.println("El peso de la mercancia es " + mercancia.getPeso());

        System.out.print("Digite la descripcion de la mercancia: ");
        mercancia.setDescripcion(lea.nextLine());
        System.out.println("La descripcion de la mercancia es " + mercancia.getDescripcion());

        System.out.print("Digite el avaluo de la mercancia: ");
        mercancia.setAvaluo(lea.nextInt());
        lea.nextLine(); // Consumir la línea sobrante
        System.out.println("El avaluo de la mercancia es " + mercancia.getAvaluo());

        System.out.print("Digite la direccion remitente de la mercancia: ");
        mercancia.setDireccionRemitente(lea.nextLine());
        System.out.println("La direccion remitente de la mercancia es " + mercancia.getDireccionRemitente());

        System.out.print("Digite la direccion destinatario de la mercancia: ");
        mercancia.setDireccionDestinatario(lea.nextLine());
        System.out.println("La direccion destinatario de la mercancia es " + mercancia.getDireccionDestinatario());

        lea.close();
    }
}
