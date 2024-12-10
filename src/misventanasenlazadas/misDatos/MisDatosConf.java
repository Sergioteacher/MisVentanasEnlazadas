/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misventanasenlazadas.misDatos;

import java.awt.Color;

/**
 *
 * @author Sergio Teacher
 */
public class MisDatosConf {

    private String[] Parametros;
//  private final Color OPColorInicial = new Color(240,240,240);
    private Color OPColorInicial;
    private Color OPColor;
    private String VTituloPrincipal;
    private String VTituloSecundaria;

    public MisDatosConf(String[] Parametros) {
        this.Parametros = Parametros;
        System.out.println("");
        System.out.println("1º Título principal");
        System.out.println("2º Color del fondo principal");
        System.out.println("3º Título secundario");
        System.out.println("resto '(se descarta)'");
        System.out.println("");
        System.out.println("procesando ajustes ...");
        System.out.println("Nº de parámetros es: "  + Parametros.length );
        switch (Parametros.length){
            case 0:
                System.out.println("Se cargan los valores por defecto.");
                OPColorInicial = textoAcolor("");
                VTituloPrincipal="Ventana Principal";
                VTituloSecundaria="Ventana Secundaria";
                break;
            case 1:
                System.out.println("Se carga el título" );
                OPColorInicial = textoAcolor("");
                VTituloPrincipal= Parametros[0];
                VTituloSecundaria="Ventana Secundaria";
                break;
            case 2:
                System.out.println("Se carga el título y el color");
                OPColorInicial = textoAcolor(Parametros[1]);
                VTituloPrincipal= Parametros[0];
                VTituloSecundaria="Ventana Secundaria";
                break;
            case 3:
                System.out.println("Se carga el título, el color y título secundario");
                OPColorInicial = textoAcolor(Parametros[1]);
                VTituloPrincipal= Parametros[0];
                VTituloSecundaria= Parametros[2];
                break;
            default:
                System.out.println("Se carga el título, el color y título secundario");
                OPColorInicial = textoAcolor(Parametros[1]);
                VTituloPrincipal= Parametros[0];
                VTituloSecundaria= Parametros[2];
                System.out.println("Se han pasado más 3 parámetros ... se descartan");
        }
    }



    public Color getOPColorInicial() {
        return OPColorInicial;
    }

    public Color getOPColor() {
        return OPColor;
    }

    public void setOPColor(Color OPColor) {
        this.OPColor = OPColor;
    }

    public String getVTituloPrincipal() {
        return VTituloPrincipal;
    }

    public void setVTituloPrincipal(String VTituloPrincipal) {
        this.VTituloPrincipal = VTituloPrincipal;
    }

    public String getVTituloSecundaria() {
        return VTituloSecundaria;
    }

    public void setVTituloSecundaria(String VTituloSecundaria) {
        this.VTituloSecundaria = VTituloSecundaria;
    }


private Color textoAcolor(String s){
    Color tmp=null; 
    switch (s){
        case "rojo":
            tmp = Color.RED;
            break;
        case "verde":
            tmp = Color.GREEN;
            break;
        case "azul":
            tmp = Color.BLUE;
            break;
        case "blanco":
            tmp = Color.WHITE;
            break;
        case "negro":
            tmp = Color.BLACK;
            break;
        case "amarillo":
            tmp = Color.YELLOW;
            break;
        case "naranja":
            tmp = Color.ORANGE;
            break;
        default:
            System.out.println("gris ...");
            tmp = Color.LIGHT_GRAY;
    }
    return tmp;
}
    
}
