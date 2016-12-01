
package boletin11;

import java.time.Duration;
import java.time.Instant;
import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Boletin11 {

    public static void main(String[] args) {
          Instant inicio=Instant.now();
        JOptionPane.showInputDialog("Escribe a seguinte frase:A documentacion e todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicacion informatica .");
        Instant fin=Instant.now();
        JOptionPane.showMessageDialog(null,"Tardaches "+Duration.between(inicio, fin).getSeconds()+" segundos en escribir");
    }
    
}
