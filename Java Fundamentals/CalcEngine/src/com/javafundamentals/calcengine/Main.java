package com.javafundamentals.calcengine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //for the preset values
        if(args.length == 0) {
            performCalculations();
        }
        //To run program interactively
        else if(args.length ==1 && args[0].equals("interactive")){
            executeInteractively();
        }
        //for commandline arguments
        else if(args.length == 3){
            performOperation(args);
        }
        else{
            System.out.println("Please provide an operation code and 2 numeric values");
        }
    }

    //performCalculation method
    static void performCalculations(){

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(MathOperation.DIVIDE, 100.0d, 50.0d);
        equations[1] = new MathEquation(MathOperation.ADD, 25.0d, 92.0d);
        equations[2] = new MathEquation(MathOperation.SUBTRACT, 225.0d, 17.0d);
        equations[3] = new MathEquation(MathOperation.MULTIPLY, 11.0d, 3.0d);

        for(MathEquation equation: equations){
            equation.execute();
            System.out.println(equation); //will call toString()
        }

        System.out.println("Average result = " + MathEquation.getAverageResult());

        //useOverloads;
    }

    static void userOverloads(){

        System.out.println();
        System.out.println("Using execute overloads");
        System.out.println();

        MathEquation equationOverload = new MathEquation(MathOperation.DIVIDE);
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        equationOverload.execute(leftDouble, rightDouble);

        System.out.println("Overload result with doubles: " + equationOverload.getResult());

        int leftInt = 9;
        int rightInt = 4;

        equationOverload.execute(leftInt, rightInt);
        System.out.println("Overload result with ints: " + equationOverload.getResult());

    }

    //To interact with user
    static void executeInteractively(){
        System.out.println("Enter an operation and two numbers: ");
        Scanner sn = new Scanner(System.in);
        String userInput = sn.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }



    //performOperation function
    private static void performOperation(String[] parts){
        MathOperation opCode = MathOperation.valueOf(parts[0].toUpperCase());
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        MathEquation equation = new MathEquation(opCode, leftVal, rightVal);
        equation.execute();

        System.out.println(equation);

    }

    static double valueFromWord(String word){
        String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        double value = 0d;
        for(int index = 0; index <numberWords.length; index++){
            if(word.equals(numberWords[index])){
                value = index;
                break;
            }
        }
        return value;
    }

}