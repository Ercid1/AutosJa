import javax.swing.*;

public class ConsoleIO {
    public static void main(String[] args) {

         // lectura de datos
        // el Joptionpane llama a una libreria
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero del sistema decimal: ");
        int numeroDecimal=Integer.parseInt(numeroStr);
        try {
            numeroDecimal = Integer.parseInt(numeroStr);   // El parse convierte el tipo de datos
        } catch (NumberFormatException e){
            JOptionPane.showInputDialog(null, "Error capa 8");
            main(args);  // Esta parte es como un bucle que se llama a si mismo
            System.exit(0);

        //Transformar un numero decimal a si mismo

         System.out.println("Numero decimal de " + numeroDecimal + "=" +Integer.toString(numeroDecimal));

        //Trasnformar un numero decimal en binario
        System.out.println("Numero bineario  de " + numeroDecimal + "=" +Integer.toBinaryString(numeroDecimal)) ;

        //Trasnformar un numero decimal a octarl
        System.out.println("Numero decimal de " + numeroDecimal + "="+ Integer.toOctalString(numeroDecimal));

        //Transformar un numero decimal en hexadecimal

        System.out.println("Numero binario de " + numeroDecimal + "="+ Integer.toHexString(numeroDecimal));

        //Desplegar los valores capturados
            // Desde aqui esta contatenando el codigo
        String mensaje = "Numero decimal es " + numeroDecimal + "=" + Integer.toString(numeroDecimal)  + "\n";
        mensaje += "Numero binario de " + numeroDecimal + "=" + Integer.toBinaryString(numeroDecimal) + "\n";
        mensaje += "Numero decimal de " + numeroDecimal + "=" + Integer.toOctalString(numeroDecimal) + "\n";
        mensaje += "Numero binario de " + numeroDecimal + "=" + Integer.toHexString(numeroDecimal);

        }
    }
}
