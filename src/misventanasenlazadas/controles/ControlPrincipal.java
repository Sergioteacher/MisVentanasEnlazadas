/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misventanasenlazadas.controles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import misventanasenlazadas.misDatos.MisDatosConf;
import misventanasenlazadas.vistas.MiVentanaConfig;
import misventanasenlazadas.vistas.VentanaPrincipal;
import misventanasenlazadas.vistas.VentanaSecundaria;

/**
 *
 * @author Sergio Teacher
 */
public class ControlPrincipal implements ActionListener {


private MisDatosConf Datos;
private VentanaPrincipal VVV;
private VentanaSecundaria Vdos;
private MiVentanaConfig VConfig;
private String[] Parametros;

    public ControlPrincipal(MisDatosConf Datos, VentanaPrincipal VVV ) {
        this.Datos = Datos;
        this.VVV = VVV;
        this.Parametros = Parametros;

        Vdos = new VentanaSecundaria();
        VConfig = new MiVentanaConfig(VVV,true);

        iniciaEscuchadores();
    }


    private void iniciaEscuchadores(){
        VVV.addActionListenerbtnConf(this);
        VVV.addActionListenerbtnHija(this);
        VConfig.addActionListenerbtnColor(this);
        VConfig.addActionListenerbtnOk(this);
        VConfig.addActionListenerbtnCancel(this);
    }


public void arranque(){

    Vdos.setTitle(Datos.getVTituloSecundaria());
    VVV.setTitle(Datos.getVTituloPrincipal());
    VVV.ponColorjPanelCentral(Datos.getOPColorInicial());

    VVV.setVisible(true);
}

public void actionPerformed(ActionEvent e){
    System.out.println("evento: " + e.getActionCommand());
    switch (e.getActionCommand()){
        case "Conf":
            lanzaMiVentanaConfig();
            break;
        case "Hija":
            lanzaVentanaSecundaria();
            break;
        case "Ok":
            lanzaOk();
            break;
        case "Color":
            lanzaColor();
            break;
        case "Cancel":
            lanzaCancel();
            break;
        default:
            System.out.println("Se ha pulsado algo ???");
    }
}

private void lanzaVentanaSecundaria(){
    Vdos.setVisible(true);
}
private void lanzaMiVentanaConfig(){
    VConfig.setVisible(true);

}

private void lanzaOk(){
    System.out.println("Ok");
    if ( !VConfig.getTextoFieldTitulo().isEmpty() ){
        VVV.setTitle(VConfig.getTextoFieldTitulo());
        System.out.println("Nuevo título: " + VConfig.getTextoFieldTitulo() + ".");
    }
    VConfig.dispose();
}
private void lanzaColor(){
    System.out.println("Color");
    JColorChooser colorOptar = new JColorChooser();
    int resultado = JOptionPane.showConfirmDialog(null, colorOptar, "Selecciona un color", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

    if (resultado == JOptionPane.OK_OPTION) {
            Datos.setOPColor(colorOptar.getColor());
            System.out.println("El color seleccionado es " + Datos.getOPColor().toString());
            VConfig.ponColorjPanelCentral(Datos.getOPColor());
            VVV.ponColorjPanelCentral(Datos.getOPColor());
        } else {
            System.out.println("No se seleccionó ningún color.");
    }

}
private void lanzaCancel(){
    System.out.println("Cancel");
    VConfig.ponColorjPanelCentral(Datos.getOPColorInicial());
    VVV.ponColorjPanelCentral(Datos.getOPColorInicial());
    VConfig.dispose();
}


}
