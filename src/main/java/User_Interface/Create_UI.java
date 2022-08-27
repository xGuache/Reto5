package User_Interface;

import CRUD.Create;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Create_UI {
    private JButton Button_Crear_Bicicleta;
    private JTextField textField_Fabricante;
    private JTextField textField_Precio;
    private JTextField textField_Anio;
    private JLabel jLabel_Fabricante;
    private JLabel jLabel_Precio;
    private JLabel jLabel_Año;

    public Create_UI() {
        Button_Crear_Bicicleta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create NewCreate = new Create("insert into `bicicletas` (`id_Bicicletas`,`Fabricante_Nombre`, `Precio`, `Anio`) values ('1005'," + text_Fabricante + ",'1200000','2020'");
            }
        });


        textField_Fabricante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String text_Fabricante = textField_Fabricante.getText();
            }
        });


        textField_Precio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text_Precio = textField_Precio.getText();
            }
        });


        textField_Anio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text_Anio = textField_Anio.getText();
            }
        });
    }

}
