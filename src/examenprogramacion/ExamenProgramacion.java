
package examenprogramacion;
import java.util.Scanner;
public class ExamenProgramacion {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeros[] = new int[5];
    float oscurecido[] = new float[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
    String palabra = sc.nextLine();
    float porcentaje = sc.nextFloat();
   float multi = 0;
        for (int i = 0; i < oscurecido.length; i++) {
            if(numeros[i]<255){
           multi = porcentaje/100;
           
            oscurecido[i] = (multi*numeros[i])+numeros[i];
            System.out.println(oscurecido[i]);
       
            }
            if(numeros[i]>=255){
            oscurecido[i] = 255;
              System.out.println(oscurecido[i]);
            }
          
        }
    }
    
}
