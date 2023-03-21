import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {
    float ans;
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public float square_root(float x){
        if(x < 0){
            logger.error("[ERROR - SQRT] - square root function is given -ve number");
            return -1f;
        }
        double temp = Math.sqrt(x);
        logger.info("[SQRT] - " + x);
        logger.info("[RESULT - SQRT] - " + temp);
        return (float) temp;
    }

    public int factorial(int x){
        if(x < 0){
            logger.error("[ERROR - FACTORIAL] - factorial function does not work with -ve number");
            return -1;
        }
        int ans = 1;
        for(int i = 1; i <= x; i++){
            ans = ans * i;
        }
        logger.info("[FACTORIAL] - " + x);
        logger.info("[RESULT - FACTORIAL] - " + ans);
        return ans;
    }

    public float nat_log(float x){
        if(x < 0){
            logger.error("[ERROR - LOG] - natural log function does not work with -ve number");
            return -1;
        }
        float temp = (float) Math.log(x);
        logger.info("[LOG] - " + x);
        logger.info("[RESULT - LOG] - " + temp);
        return temp;
    }

    public float power(float x, float b){
        float temp = (float) Math.pow(x,b);
        logger.info("[POWER] - " + x + ", " + b);
        logger.info("[RESULT - POWER] - " + temp);
        return temp;
    }
    public float evaluate(int c, float x, float b){
        switch (c) {
            case (1) :
            ans = square_root(x);
            break;
            case (2) : ans = factorial((int) x);
            break;
            case (3) : ans = nat_log(x);
            break;
            case (4) : ans = power(x, b);
            break;
            default :
                logger.error("[ERROR] - cannot select this option");
                System.out.println("You cannot select this option. Please try again.");break;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose operation: \n"+
                "1. Square Root  \n"+
                "2. Factorial  \n"+
                "3. Natural Log  \n"+
                "4. Power  \n"+
                "Enter your choice : ");


        int c = scan.nextInt();
        float x = 0;
        float b = 0;

        if (c == 1 || c == 2 || c == 3){
            System.out.print("Enter your operand");
            x = scan.nextFloat();
        }
        else if (c == 4){
            System.out.print("Enter your two (space separated) operands: ");
            x = scan.nextFloat();
            b = scan.nextFloat();
        }

        Calculator calc = new Calculator();
        System.out.println("Here's your answer: " +  calc.evaluate(c, x, b));
    }
}
