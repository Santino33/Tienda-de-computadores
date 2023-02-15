package model;

import view.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class model {
    private static view ViewTest;
    private static computador computador;


    public void agregarComputador(){
        int salida = 0;
        do {
            pedirDatos();
            salida = preguntarNuevoComputador();


        }while(salida == 1);
    }


    private static void subirDatos(HashMap base){
        try {
            FileOutputStream fl = new FileOutputStream("C:/Users/willi/Universidad/Programacion 1/Ejercicios/TiendaComputadores/src/model/basededatos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fl);
            oos.writeObject(base);
        }catch (Exception e){
            System.out.println("Ha ocurrido un error actualizando la base "+ e.getMessage());
        }
    }
    private static int preguntarNuevoComputador(){
        ViewTest = new view();
        int salida = 0;
        String pregunta;
        boolean repetir = false;
        do {
            try {
                pregunta = ViewTest.readString("¿Desea agregar otro computador?\n S/N");
                switch(pregunta){
                    case "S": salida = 1;
                        break;
                    case "s": salida = 1;
                        break;
                    case "N": salida = 2;
                        break;
                    case "n": salida = 2;
                        break;
                }

            } catch (Exception e) {
                ViewTest.showMessage("Porfavor inserte unicamente S o N");
                repetir = true;
            }
        }while(repetir);
        return salida;
    }

   private static HashMap pedirDatos(){
        computador pc = new computador();
       ViewTest = new view();

       ArrayList<String> datos = new ArrayList<>();
       HashMap<String, ArrayList<String>> computadores = new HashMap<>();

       pc.nombre = ViewTest.readString("Inserte el nombre del nuevo computador");

       pc.precio = ViewTest.readInt("Inserte el precio");
       datos.add(String.valueOf(pc.precio));

       pc.procesador = ViewTest.readString("Inserte el nombre del procesador");
       datos.add(pc.procesador);

       pc.SO = ViewTest.readString("Inserte el nombre del sistema operativo");
       datos.add(pc.SO);

       pc.RAM = ViewTest.readInt("Inserte la capacidad de la tarjeta RAM(Solo numeros) ");
       String RAMString = Integer.toString(pc.RAM);
       RAMString = RAMString + "GB";
       datos.add(RAMString);

       pc.ROM = ViewTest.readInt("Inserte la capacidad del almacenamiento interno(Solo numeros) ");
       String ROMString = Integer.toString(pc.ROM);
       ROMString = ROMString + "GB";
       datos.add(ROMString);

       computadores.put(pc.nombre, datos);
       System.out.println(computadores);
       subirDatos(computadores);
       return computadores;
   }
}
