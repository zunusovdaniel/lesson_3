import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] abs= {12.1, -7.9 , 23.21,32.21,55.1,11.1,-345.22,-123.6,45.65,-34.45,65.34,64.112,-34.87,-876.22,33.1};
        double result = 0;
        int i = 0;
        boolean swich = false;
        for (double number: abs) {
            if (number > 0 && swich){
                result = result + number;
                i++;
                System.out.println(result);
            } else {
                swich = true;
                continue;
            }
        }
        System.out.println(result /= i);

        // снизу сортировка выбором
        /*for (int j = 0; j < abs.length; j++) {
            double min = abs[j];
            int min_i = j;
            for (int k = 0; k < abs.length; k++) {
                if (abs[k] < min){
                   min = abs[k];
                   min_i = k;
                }
            }
            if (j != min_i){
                double tmp = abs[j];
                abs[j] = abs[min_i];
                abs[min_i] = tmp;
            }
        }*/
        // эта сортировка массива работает не корректно
        for(int j = abs.length-1 ; j > 0 ; j--){
            System.out.println(Arrays.toString(abs));
            for(int k = 0 ; k < j ; k++){

            if( abs[k] > abs[k+1] ){
                double tmp = abs[k];
                abs[k] = abs[k+1];
                abs[k+1] = tmp;
            }
        }
    }
        System.out.println("Finish " + Arrays.toString(abs));
    }
}