package presenter;

import view.view;
import model.model;

public class Main {
    private static view viewTest;
    private static model modelTest;
    public static void main(String[] args) {
        menu();
    }

    public static void menu (){
        viewTest = new view();
        modelTest = new model();
        viewTest.showMessage("Ahora puedes tener toda la informacion de \n" +
                " tu tienda de computadores en un solo lugar\n Luego de darle OK digita la opcion que desees consultar");
        int option = viewTest.readInt("1.Agregar un nuevo computador\n" +
                "2. Eliminar un  computador\n" +
                "3. Buscar un computador\n" +
                "4. Listar todos los computadores disponibles\n" +
                "5. Salir\n Selecciona una opcion para continuar");

        switch (option){
            case 1: modelTest.agregarComputador();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }


    }
}