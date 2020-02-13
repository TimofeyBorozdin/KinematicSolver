import java.util.Scanner;
import java.lang.Math;

public class KinematicSolver {
    public static void main() {
        Scanner Stop = new Scanner(System.in);
        String stopCheck = "stop";
        int i = 0;
        while (i < 3){
            
            Exercise();
            
            if(i <= 2){
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("--Program: Enter 'stop' if you want to stop, or 'next' to start again.");
                           
                String back = Stop.nextLine();
                if(back.contains(stopCheck)) {
                    System.out.println("--Program: I am Stopped.");
                    System.out.println("--Program: Good bye. :)");
                    break;
                }
            }
            i++;
            
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------------------------");
                        
            System.out.println("--Program-attempts: You have " + (3 - i) + " attempts left to this exercise.");
                        
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------------------------");
        }
    }
    
    static void Exercise() {                
        Scanner vars = new Scanner(System.in);
        double g = 9.8f;
        double V;
        double h;
        double a;
        
        //------------------------------------------
        double verticalInitial;
        double verticalFinal;
        double horizontal;
        double Vfin;
        double dH;
        double H;
        double t;
        double T;
        double S;
        double b; //(final velocity angle)
        //------------------------------------------
        
        
        System.out.println();
        System.out.println("----EXERCISE: Hello!");
        System.out.println("----EXERCISE: Please enter velocity of an object");
        V = vars.nextFloat();
        System.out.println("----EXERCISE: Please enter initial height");
        h = vars.nextFloat();
        System.out.println("----EXERCISE: Please enter value of an angle to the horizon");
        a = vars.nextFloat();
        
            
        verticalInitial = Math.abs(V * Math.sin(a * Math.PI / 180)); //vertical
        horizontal = Math.abs(V * Math.cos(a * Math.PI / 180)); //horizontal
        dH = Math.pow(verticalInitial, 2) / (2 * g);
        H = h + dH;
        t = verticalInitial / g;
            
        if(h == 0) {
            T = 2 * t;
        }
        else{
            T = t + Math.sqrt(2 * H / g);
        }
            
        S = horizontal * T;
        
        verticalFinal = verticalInitial + (g * Math.sqrt(2 * H / g));
        Vfin = Math.sqrt(Math.pow(horizontal, 2) + Math.pow(verticalFinal, 2));
        b = Math.atan(verticalFinal/horizontal * 180/Math.PI);
        //------------------------------------------
        //rounding to 0.00 form
        verticalInitial *= 100;
        verticalInitial = Math.round(verticalInitial);
        verticalInitial /= 100;
        //rounding to 0.00 form
        horizontal *= 100;
        horizontal = Math.round(horizontal);
        horizontal /= 100;
        //rounding to 0.00 form
        H *= 100;
        H = Math.round(H);
        H /= 100;
        //rounding to 0.00 form
        T *= 100;
        T = Math.round(T);
        T /= 100;
        //rounding to 0.00 form
        S *= 100;
        S = Math.round(S);
        S /= 100;
        //rounding to 0.00 form
        verticalFinal *= 100;
        verticalFinal = Math.round(verticalFinal);
        verticalFinal /= 100;
        //rounding to 0.00 form
        Vfin *= 100;
        Vfin = Math.round(Vfin);
        Vfin /= 100;
        //rounding to 0.00 form
        b *= 100;
        b = Math.round(b);
        b /= 100;
        //------------------------------------------
        System.out.println();
        System.out.println("----EXERCISE: The horisontal component of the initial velocity is " + horizontal);
        System.out.println("----EXERCISE: The vertical component of the initial velocity is " + verticalInitial);
        System.out.println("----EXERCISE: The maximal height that object reaches is " + H);
        System.out.println("----EXERCISE: The total time of the flight is " + T);
        System.out.println("----EXERCISE: The total horisontal displacement is " + S);
        
        System.out.println("----EXERCISE: The final vertical velocity is " + verticalFinal);
        System.out.println("----EXERCISE: The final velocity is " + Vfin);
        System.out.println("----EXERCISE: The angle of the final velocity to the horizon is " + b + " degrees");
        
        System.out.println();
        System.out.println("----EXERCISE: The End.");
        System.out.println();
                
    }
}
