import javax.swing.*;
import java.util.Scanner;

public class Calculadora {
    static Scanner scan=new Scanner(System.in);

    public static void ejecutarCalc(){
        Integer opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige metodo de entrada/salida: " +
                "\n1)Consola" +
                "\n2)Ventana"));
        boolean porConsola=Entrada.elegirEntradaSalida(opcion);
        Float a=Entrada.introducirValores(porConsola);
        Float b=Entrada.introducirValores(porConsola);
        Integer operacion=0;
        if(porConsola==true){
            System.out.println("Elige una opcion: " +
                    "\n1)SUMA" +
                    "\n2)RESTA" +
                    "\n3)MULTIPLICACION" +
                    "\n4)DIVISION");
            operacion=scan.nextInt();
        } else if (porConsola==false) {
            operacion=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion: " +
                    "\n1)SUMA" +
                    "\n2)RESTA" +
                    "\n3)MULTIPLICACION" +
                    "\n4)DIVISION"));
        }

        Float resultado=Operaciones.operacion(operacion,a,b);
        Salida.salida(porConsola,resultado);

    }
}

