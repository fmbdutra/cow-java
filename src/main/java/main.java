/**
 * Its a program to count cows weight
 * and find out which cow is heavier
 * and have less weight.
 * <p>
 * Used to implement new learn skill of Java.
 * <p>
 * vaca = cow in brazilian portuguese.
 *
 * @author Fabiano Matheus Bittencourt Dutra
 * @version 1.0
 * @since 2018-09-03
 */


public class main {

    public static void main(String[] args) {
        double[] vaca = new double[5];

        vaca[0] = 500.0;
        vaca[1] = 986.0;
        vaca[2] = 850.0;
        vaca[3] = 590.0;
        vaca[4] = 1050.0;


//        Code to understand: list cows quantity and weight of them.
//        Para entender: lista a quantidade de vacas e peso delas
//
//        System.out.println("Temos: "+vaca.length+" vacas");
//        for(int i=0;i<vaca.length;i++) {System.out.println("Vaca "+i+": "+vaca[i]);}


        double maiorPeso = 0, menorPeso = 0; //Declara atributos de peso

        int idVacaMaior = 0, idVacaMenor = 0; //Para guardar id das vacas

        for (int x = 0; x < vaca.length; x++) {
            if (menorPeso == 0 || maiorPeso == 0) {
                menorPeso = vaca[x];
                maiorPeso = vaca[x];
            }

            if (maiorPeso <= vaca[x]) {
                maiorPeso = vaca[x];
                idVacaMaior = x;
            }

            if (menorPeso >= vaca[x]) {
                menorPeso = vaca[x];
                idVacaMenor = x;
            }
        }
        System.out.println("Maior Peso: " + maiorPeso + " - Vaca " + idVacaMaior);
        System.out.println("Menor Peso: " + menorPeso + " - Vaca " + idVacaMenor);
    }
}