import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class W11ListExercises {

    Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
    
		W11ListExercises arrays = new W11ListExercises();
		arrays.runExercises();
    }
    
    public void runExercises() {

        System.out.println("Enter exercise number:");
        int number = reader.nextInt();
        
    	switch (number) {
    	
    		case(1):
    			exercise1();
    			break;
    		case(2):
    			exercise2();
    			break;
    		case(3):
    			exercise3();
    			break;
    		case(4):
    			exercise4();
    			break;
    		case(5):
    			exercise5();
    			break;
    		case(6):
    			exercise6();
    			break;
    		case(7):
    			exercise7();
    			break;
    		default:
    			System.out.println("unknown exercise");
    	}
    }

    public void exercise1() {
    
    }

    public void exercise2() {
    
    }

    public void exercise3() {
    
    }

    public void exercise4() {
    
    }

    public void exercise5() {
    
    }

    public void exercise6() {
    
    }

    public void exercise7() {
    
    }
}
