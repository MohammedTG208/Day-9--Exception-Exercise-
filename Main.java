import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input
//        System.out.println("=== 1 ===");
//        numberStatus(input);
////        2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
//        System.out.println("=== 2 ===");
//        multiplication(input);
//
////        3. Write a Java program to print the area and perimeter of a circle.
//        System.out.println("=== 3 ===");
//        printArea(input);
//
////        4. Java program to find out the average of a set of integers
//        System.out.println("=== 4 ===");
//        getAverage(input);
//
////        5. Write a Java program that accepts three integers as input, adds the first two integers
////        together, and then determines whether the sum is equal to the third integer.
//        System.out.println("=== 5 ===");
//        acceptsThreeNumber(input);
        //6. Write a Java program to reverse a word
//        try {
//            reversString(input);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

//        7 - Java program to check whether the given number is even or odd
//        System.out.println("=== 7 ===");
//        oddOReven(input);
////        8 - Java program to convert the temperature in Centigrade to Fahrenheit
//        System.out.println("=== 8 ===");
//        temperature(input);
////        9.Write a Java program that takes a string and a number from the user,then prints the
////        character in the given index.
//        System.out.println("Input a string ;");
//        System.out.println("=== 9 ===");
//        try {
//            getStringIndex(input);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
////        10. Write a Java program to print the area and perimeter of a rectangle.
//        System.out.println("=== 10 ===");
//        areaAndPerimeter(input);
    }

    static void numberStatus(Scanner input)throws InputMismatchException {
        try {
            System.out.println("Enter 1st Number:");
        int number1=input.nextInt();
        System.out.println("Enter 2nd Number: ");
        int number2=input.nextInt();
        int sum=number1+number2;
        int multiply=number1*number2;
        int subtract=number1-number2;
        int divide=number1/number2;
        int mod=number1%number2;
        System.out.println(number1+"+"+number2+"="+sum);//125+24=149
        System.out.println(number1+"-"+number2+"="+subtract);//125X24=3000
        System.out.println(number1+"x"+number2+"="+multiply);//125-24=101
        System.out.println(number1+"/"+number2+"="+divide);// 125/24=5
        System.out.println(number1+" mod "+number2+"="+mod);//125 mod 24=5
        }catch (InputMismatchException e){
            System.out.println("Enter Integer Number only");
        }catch (Exception e){
            System.out.println("Enter valid number");
        }
    }

    static void multiplication(Scanner input){
        try {
            System.out.println("Enter number to get multiplication:");
        int num=input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("multiply "+num+" x "+i+"= "+(num*i));
        }

        }catch (InputMismatchException e){
            System.out.println("Enter Integer Number only");
        }catch (Exception e){
            System.out.println("Enter Integer Number only");
        }
    }

    static void printArea(Scanner input){
        try {
            System.out.println("Enter Radius:");
        double radius=input.nextDouble();
        //3.14 x 5² (5 x 5)
        double pi= 3.141592653589793;
        double perimeter = 2 * pi * radius;
        double area=pi * radius * radius;
        System.out.println("perimeter: "+perimeter+"\narea: "+area);
        }catch (InputMismatchException e){
            System.out.println("Enter double value");
        }catch (Exception e){
            System.out.println(" try aging ");
        }
    }

    static void getAverage(Scanner input){
        try {
        System.out.println("Enter the count of numbers: ");
        int count=input.nextInt();
        int totale=count;
        int intNum=0;
        double getnumbers=0;
        do {
            System.out.println("Enter an integer:");
            intNum=input.nextInt();
            getnumbers+=intNum;
            count--;
        }while (count!=0);
        System.out.println("The average is: "+getnumbers/totale);//The average is: 5.2

        }catch (InputMismatchException e){
            System.out.println("enter int");
        }catch (Exception e){
            System.out.println("try again");
        }
    }
    static void acceptsThreeNumber(Scanner input) {
        try {
            System.out.println("Input the first number :");
        int first= input.nextInt();
        System.out.println("Input the second number:");
        int second= input.nextInt();
        System.out.println("Input the third number");
        int third=input.nextInt();
        boolean isTrue=true;
        if (first+second==third){
            System.out.println("The result is: "+isTrue);
        }else {
            isTrue=false;
            System.out.println("The result is: "+isTrue);
        }
        }catch (InputMismatchException e){
            System.out.println("Enter int value");
        }
    }
     static void reversString(Scanner input)throws Exception {
         System.out.print("Enter a Word: ");
         String usertext=input.nextLine();
        if (usertext.isEmpty())
        {
            throw new Exception("Enter String first");
        } else {
            try {
        int index=usertext.length()-1;
        String fullText="";
        do {
            fullText+=""+ usertext.charAt(index);
           index--;

        }while (index!=-1);
                System.out.println(fullText);
            }catch (InputMismatchException e){
                System.out.println("Enter Test only");
            }
        }
    }
    static void oddOReven(Scanner input) {
        try {
            System.out.print("Enter a number: ");
            int check = input.nextInt();//2
            if (check == 0) {
                throw new Exception("Enter number > 0 ");
            } else {
                try {

                    if (check % 2 == 0) {
                        System.out.println("The number is Odd");//true
                    } else {
                        System.out.println("The number is Even");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Enter int value");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void temperature(Scanner input) {
        try {
            System.out.println("Enter temperature in Centigrade:");
            int userTemp = input.nextInt();//43
            double fahrenheit = (userTemp * 1.8) + 32;
            System.out.println("Temperature in Fahrenheit is: " + fahrenheit);//Temperature in Fahrenheit is: 109.4
        } catch (InputMismatchException |IndexOutOfBoundsException e ) {
            System.out.println(e.getMessage());
        }

    }
    static void getStringIndex(Scanner input)throws Exception {
        try {
            System.out.println("Input a string");
            String uWord = input.nextLine();//mohammed tariq
            if (uWord.isEmpty()) {
                throw new Exception("Enter Text first");
            } else {
                System.out.println("input a number :");
                int uNumber = input.nextInt();//7
                if (uNumber > uWord.length()) {
                    throw new Exception("Enter <= " + uWord.length());
                } else {
                    System.out.println(uWord.charAt(uNumber));//d
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("Enter int and string only");
        }
    }
    static void areaAndPerimeter(Scanner input) {
        try {
            System.out.println("Enter what we need: ");
            System.out.println("Width: ");
            double width = input.nextDouble();
            System.out.println("Height: ");
            double height = input.nextDouble();
            System.out.println("Area is " + width + " * " + height + " = " + (width * height));
            System.out.println("Perimeter is " + 2 + " * " + "(" + width + "+" + height + ")" + " = " + 2 * (width + height));
        } catch (InputMismatchException e) {
            System.out.println("Enter double");
        }
    }

}