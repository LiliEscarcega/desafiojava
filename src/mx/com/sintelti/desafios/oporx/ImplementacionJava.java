
package mx.com.sintelti.desafios.oporx;

public class ImplementacionJava implements Solucion {

    public String convertir (String entrada) {
        int con = 0;
        String fin = "";
        String letra = "o";
        String[] cadenaSeparada;
        int total=0;
        cadenaSeparada = entrada.split("");
        for (int i = 0; i < cadenaSeparada.length; i++) {
            if (cadenaSeparada[i].equalsIgnoreCase(letra)) {
                String varx = "";
                total ++;
                for(int let = 0; let < total; let++){
                    varx = varx + "x";
                }
                fin = fin + varx;
            } else {
                fin = fin + cadenaSeparada[i];

            }

        }

        System.out.println(fin);

        return fin;
       }
    }
