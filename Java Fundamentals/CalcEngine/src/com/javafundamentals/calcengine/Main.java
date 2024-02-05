package com.javafundamentals.calcengine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        //for the preset values
        if(args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
            }
            //printing results
            for (double currentResult : results) {
                System.out.println(currentResult);
            }
        }
        //To run program interactively
        else if(args.length ==1 && args[0].equals("interactive")){
            executeInteractively();
        }
        //for commandline arguments
        else if(args.length == 3){
            handleCommandLine(args);
        }
        else{
            System.out.println("Please provide an operation code and 2 numeric values");
        }
    }

    //To interact with user
    static void executeInteractively(){
        System.out.println("Enter an operation and two numbers: ");
        Scanner sn = new Scanner(System.in);
        String userInput = sn.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }


    //function to handle commandline arguments
    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    //performOperation function
    private static void performOperation(String[] parts){
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode,leftVal,rightVal);
        displayResult(opCode,leftVal,rightVal,result);
    }

    private static void displayResult(char opCode, double leftVal, double rightVal, double result){
        char symbol = symbolFromOpCode(opCode);
        StringBuilder builder = new StringBuilder(20);
        builder.append(leftVal);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(rightVal);
        builder.append(" = ");
        builder.append(result);
        String output = builder.toString();
        System.out.println(output);
    }

    static char opCodeFromString(String operationName){
        return operationName.charAt(0);
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

    //returns symbol from opcode
    private static char symbolFromOpCode(char opCode){
        char[] opCodes = {'a','s','m','d'};
        char[] symbols = {'+', '-','*','/'};
        char symbol = ' ';

        for (int index = 0; index < opCodes.length; index++){
            if(opCode == opCodes[index]){
                symbol = symbols[index];
                break;
            }
        }
        return symbol;
    }
    //execute method
    static double execute ( char opCode, double leftVal, double rightVal){
        double result;
        switch (opCode) {
            case 'a' -> result = leftVal + rightVal;
            case 's' -> result = leftVal - rightVal;
            case 'm' -> result = leftVal * rightVal;
            case 'd' -> result = rightVal != 0 ? leftVal / rightVal : 0.0d;
            default -> {
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
            }
        }
        return result;
    }
}