/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package misventanasenlazadas;

import misventanasenlazadas.controles.ControlPrincipal;
import misventanasenlazadas.misDatos.MisDatosConf;
import misventanasenlazadas.vistas.VentanaPrincipal;

/**
 * Proyecto para enlazar diferentes ventanas y pasar información
 * entre ellas.
 * @author Sergio Teacher
 */
public class MisVentanasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Iniciando MisVentanasEnlazadas ...");
        MisDatosConf DDD = new MisDatosConf(args);
        VentanaPrincipal Vent = new VentanaPrincipal();
        ControlPrincipal MioControl = new ControlPrincipal(DDD,Vent);

        MioControl.arranque();
    }
    
}
