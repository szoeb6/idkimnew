package distance;

import java.util.*;

public class distance {
    
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter x1 and y1 coordinate: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        
        System.out.println("Please enter x2 and y2 coordinate: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        
        int diffx = (x2-x1)*(x2-x1);
        int diffy = (y2-y1)*(y2-y1);
        int sum = diffx + diffy;
        double sqrt = Math.sqrt(sum);
        
        System.out.print("The Euclidean distance between ("+x1+","+y1+") and ("+x2+","+y2+") is: " + sqrt);
        System.out.println();
                
    }
    
}
