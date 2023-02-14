package view;

import javax.swing.*;

public class view {

    public int readInt(String message) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(message));
        return number;
    }

    public void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }

    public String readString(String message) {
        String text = (JOptionPane.showInputDialog(message));
        return text;
    }

    public boolean readBoolean(String message) {
        try {
            boolean a = Boolean.parseBoolean((JOptionPane.showInputDialog(message)));
        }catch(Exception e){
            System.out.println("Error, inserte un valor valido");
        }
        return a;
    }

}
