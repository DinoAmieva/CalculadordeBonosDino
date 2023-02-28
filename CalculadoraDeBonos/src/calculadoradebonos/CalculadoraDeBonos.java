package calculadoradebonos;

/**
 *
 * @author maryse
 *
 * Este programa calcula e imprime el bono por trabajo de una persona.
 *
 */
public class CalculadoraDeBonos {
    int salario; 
        String mensajeDeBono; 
        public void calcular (){
        salario = 50000;
        mensajeDeBono = "Tu bono total es de: $" + (.02*salario);
        System.out.println(mensajeDeBono);
        
        }
   public static void main(String[] args) {
        CalculadoraDeBonos NuevoBono = new CalculadoraDeBonos ();
        NuevoBono.calcular();

    }

}
