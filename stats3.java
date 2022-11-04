//Write a program Stats3.java that prints three uniform random values between 0 and 1, their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().

public static void main(String[] args) {
 
       double num1 = Math.random();
       double num2 = Math.random();
       double num3 = Math.random();
       
       System.out.println("first number: " + num1);
       System.out.println("second number: " + num2);
       System.out.println("third number: " + num3);
       
       double avg = (num1 + num2 + num3)/3;
       System.out.println("The average of these numbers is: " + avg);
       
       if (num1<num3 && num1<num2)
           System.out.println("The smallest number is: " +num1);
       else if (num2<num3 && num2<num1)
           System.out.println("The smallest number is: " +num2);
       else 
           System.out.println("The smallest number is: " +num3);
       
       if (num1>num3 && num1>num2)
           System.out.println("The largest number is: " +num1);
       else if (num2>num3 && num2>num1)
           System.out.println("The largest number is: " +num2);
       else 
           System.out.println("The largest number is: " +num3);
       
    }
