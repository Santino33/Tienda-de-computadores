package model;

import view.view;
import java.util.ArrayList;
import java.util.HashMap;

public class model {
    private static view ViewTest;
    private static computador computador;

    public void agregarComputador(){
        boolean salida;
        do {
            pedirDatos();
            salida = ViewTest.readString("¿Desea agregar otro computador?\n 1. Si\n 2. No");

        }while(salida);
    }



   private static void pedirDatos(){

       ArrayList<String> datos = new ArrayList<>();
       HashMap<String, ArrayList<String>> computadores = new HashMap<>();

       model.computador.nombre = ViewTest.readString("Inserte el nombre del nuevo computador");

       model.computador.precio = ViewTest.readInt("Inserte el precio");
       datos.add(String.valueOf(model.computador.precio));

       model.computador.procesador = ViewTest.readString("Inserte el nombre del procesador");
       datos.add(model.computador.nombre);

       model.computador.RAM = ViewTest.readInt("Inserte la capacidad de la tarjeta ");
       String RAMString = Integer.toString(model.computador.RAM);
       RAMString = RAMString + "GB";
       datos.add(RAMString);

       model.computador.ROM = ViewTest.readInt("Inserte la capacidad de la tarjeta ");
       String ROMString = Integer.toString(model.computador.ROM);
       ROMString = ROMString + "GB";
       datos.add(ROMString);

       computadores.put(model.computador.nombre, datos);
   }
}
