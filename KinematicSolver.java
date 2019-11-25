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
        System.out.println();
        System.out.println("----EXERCISE: Hello!");
                    
        Scanner vars = new Scanner(System.in);
        System.out.println("----EXERCISE: Please enter velocity of an object");
        double V = vars.nextFloat();
        System.out.println("----EXERCISE: Please enter initial height");
        double h = vars.nextFloat();
        System.out.println("----EXERCISE: Please enter value of an angle to the horizon");
        double a = vars.nextFloat();
            
        double g = 9.8f;
            
        //------------------------------------------
        double v;
        double u;
        double dH;
        double H;
        double t;
        double T;
        double S;
        //------------------------------------------
            
        v = Math.abs(V * Math.sin(a * Math.PI / 180)); //vertical
        u = Math.abs(V * Math.cos(a * Math.PI / 180)); //horizontal
        dH = Math.pow(v, 2) / (2 * g);
        H = h + dH;
        t = v / g;
            
        if(h == 0) {
            T = 2 * t;
        }
        else{
            T = t + Math.sqrt(2 * H / g);
        }
            
        S = u * T;
                
        //------------------------------------------
        //rounding to 0.00 form
        v *= 100;
        v = Math.round(v);
        v /= 100;
        //rounding to 0.00 form
        u *= 100;
        u = Math.round(u);
        u /= 100;
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
        //------------------------------------------
        System.out.println();
        System.out.println("----EXERCISE: The horisontal component of the initial velocity is " + u);
        System.out.println("----EXERCISE: The vertical component of the initial velocity is " + v);
        System.out.println("----EXERCISE: The maximal height that object reaches is " + H);
        System.out.println("----EXERCISE: The total time of the flight is " + T);
        System.out.println("----EXERCISE: The total horisontal displacement is " + S);      
        System.out.println();
        System.out.println("----EXERCISE: The End.");
        System.out.println();
                
    }
}
