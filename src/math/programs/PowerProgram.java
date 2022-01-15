package math.programs;

import java.util.Scanner;

public class PowerProgram {
    public static void main(String[] args) {
//        Scanner
        Scanner number = new Scanner(System.in);

        System.out.println("Input Base Number = ");
        double baseNum = number.nextDouble();
        System.out.println("Input Power = ");
        double power = number.nextDouble();


        double result = baseNum;

//        Logic
        if ( power == 0 ) {
            result = 1;
        } else {
            for ( int i = 0; i < (power - 1); i++ ) {
                result *= baseNum;
            }
        }


//        Print Result
        System.out.println("Result from " + baseNum + " power " + power + " = " + result);
    }
}
