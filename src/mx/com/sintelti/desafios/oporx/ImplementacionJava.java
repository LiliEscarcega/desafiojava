
package mx.com.sintelti.desafios.oporx;

public class ImplementacionJava implements Solucion {

    public String convertir (String entrada) {
        int con = 0;
        String fin = "";
        String letra = "o";
        String[] cadenaSeparada; //arreglo
        int total=0; //contador
        cadenaSeparada = entrada.split(""); //sepaa la palabra
        for (int i = 0; i < cadenaSeparada.length; i++) {
            if (cadenaSeparada[i].equalsIgnoreCase(letra)) {   //ciclo que compara la letra con la o
                String varx = "";
                total ++; //contador para el numero de o
                for(int let = 0; let < total; let++){ //ciclo para contar el mumero de o
                    varx = varx + "x";
                }
                fin = fin + varx;
            } else {
                fin = fin + cadenaSeparada[i];
            }
        }
        return fin; //nox retorna el valor al metodo main
       }
    }
